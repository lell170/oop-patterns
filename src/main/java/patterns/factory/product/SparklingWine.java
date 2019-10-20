package patterns.factory.product;

public class SparklingWine implements Wine {
    @Override
    public void drink() {
        System.out.println("it tastes carbonated");
    }
}
