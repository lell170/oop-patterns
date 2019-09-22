package patterns.decorator.basic;

// base class that stores a reference to an object and delegates all tasks to it
public class BasicStringHandler implements StringHandler {

    private StringHandler stringHandler;

    public BasicStringHandler(StringHandler stringHandler) {
        this.stringHandler = stringHandler;
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
