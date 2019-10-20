package patterns.factory.factory;

import patterns.factory.product.RedWine;
import patterns.factory.product.Wine;

public class RedWineFactory implements Factory {
    @Override
    public Wine createWine() {
        return new RedWine();
    }
}
