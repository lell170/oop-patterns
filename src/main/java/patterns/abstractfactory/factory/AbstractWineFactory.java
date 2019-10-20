package patterns.abstractfactory.factory;

import patterns.abstractfactory.product.AbstractRedWine;
import patterns.abstractfactory.product.AbstractWhiteWine;

public interface AbstractWineFactory {
    AbstractRedWine createRedWine();
    AbstractWhiteWine createWhiteWine();
}