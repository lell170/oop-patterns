package patterns.factory.product;

public class RedWine implements Wine {
    @Override
    public void drink() {
        System.out.println("it tastes viscous");
    }
}
