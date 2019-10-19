package patterns.decorator.basic;

// base class that stores a reference to an object and delegates all tasks to it
public class BasicStringHandler implements StringHandler {

    private final StringHandler stringHandler;

    public BasicStringHandler(final StringHandler stringHandler) {
        this.stringHandler = stringHandler;
    }

    @Override
    public void input(final String string) {
        stringHandler.input(string);
    }

    @Override
    public String output() {
        return stringHandler.output();
    }
}
