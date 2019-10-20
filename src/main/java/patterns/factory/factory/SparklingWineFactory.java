package patterns.factory.factory;

import patterns.factory.product.SparklingWine;
import patterns.factory.product.Wine;

public class SparklingWineFactory {
    public static Wine createWine() {
        return new SparklingWine();
    }
}
