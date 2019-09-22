package patterns.decorator.basic;

public class BasicStringHandler implements StringHandler {

    private StringHandler stringHandler;

    public BasicStringHandler(StringHandler source) {
        this.stringHandler = source;
    }

    @Override
    public void input(String string) {
        stringHandler.input(string);
    }

    @Override
    public String output() {
        return stringHandler.output();
    }
}
