package patterns.decorator.implementations;


import patterns.decorator.basic.BasicStringHandler;
import patterns.decorator.basic.StringHandler;

import java.util.Base64;

public class EncryptionStringHandler extends BasicStringHandler {

    public EncryptionStringHandler(final StringHandler stringHandler) {
        super(stringHandler);
    }

    @Override
    public void input(final String string) {
        super.input(this.encode(string));
    }

    @Override
    public String output() {
        return this.decode(super.output());
    }

    private String encode(final String data) {
        final byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(final String data) {
        final byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
