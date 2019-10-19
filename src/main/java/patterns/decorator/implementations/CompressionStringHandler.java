package patterns.decorator.implementations;

import patterns.decorator.basic.BasicStringHandler;
import patterns.decorator.basic.StringHandler;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionStringHandler extends BasicStringHandler {

    private static final int COMPRESSION_LEVEL = 6;

    public CompressionStringHandler(final StringHandler stringHandler) {
        super(stringHandler);
    }

    @Override
    public void input(final String string) {
        super.input(compress(string));
    }

    @Override
    public String output() {
        return decompress(super.output());
    }

    private String compress(final String stringData) {
        final byte[] data = stringData.getBytes();
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            final DeflaterOutputStream outputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(COMPRESSION_LEVEL));
            outputStream.write(data);
            outputStream.close();
            byteArrayOutputStream.close();
            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String decompress(final String stringData) {
        final byte[] data = Base64.getDecoder().decode(stringData);
        try {
            final InputStream inputStream = new ByteArrayInputStream(data);
            final InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            final ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = inflaterInputStream.read()) != -1) {
                bout.write(b);
            }
            inputStream.close();
            inflaterInputStream.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (final IOException ex) {
            return null;
        }
    }
}
