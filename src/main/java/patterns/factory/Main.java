package patterns.factory;

import patterns.factory.factory.Factory;
import patterns.factory.factory.RedWineFactory;
import patterns.factory.factory.SparklingWineFactory;
import patterns.factory.product.Wine;

public class Main {

    public static void main(final String[] args) {
        // create wine object with factory according to GoF definition
        final Factory redWineFactory = new RedWineFactory();
        final Wine wine = redWineFactory.createWine();
        wine.drink();

        // create wine object with static factory method. It is not the same as Factory Method
        final Wine sparklingWine = SparklingWineFactory.createWine();
        sparklingWine.drink();
    }
}
