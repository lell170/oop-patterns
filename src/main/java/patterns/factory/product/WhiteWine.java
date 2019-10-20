package patterns.factory.product;

public class WhiteWine implements Wine {
    @Override
    public void drink() {
        System.out.println("it tastes sour");
    }
}
