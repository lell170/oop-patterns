package patterns.factory.factory;

import patterns.factory.product.WhiteWine;
import patterns.factory.product.Wine;

public class WhiteWineFactory implements Factory {
    @Override
    public Wine createWine() {
        return new WhiteWine();
    }
}
