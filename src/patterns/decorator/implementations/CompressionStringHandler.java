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

    public CompressionStringHandler(StringHandler stringHandler) {
        super(stringHandler);
    }

    @Override
    public void input(String string) {
        super.input(compress(string));
    }

    @Override
    public String output() {
        return decompress(super.output());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DeflaterOutputStream outputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(COMPRESSION_LEVEL));
            outputStream.write(data);
            outputStream.close();
            byteArrayOutputStream.close();
            return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream inputStream = new ByteArrayInputStream(data);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = inflaterInputStream.read()) != -1) {
                bout.write(b);
            }
            inputStream.close();
            inflaterInputStream.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }
}
