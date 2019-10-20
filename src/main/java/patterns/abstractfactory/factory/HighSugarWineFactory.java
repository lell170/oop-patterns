package patterns.abstractfactory.factory;

import patterns.abstractfactory.product.AbstractRedWine;
import patterns.abstractfactory.product.AbstractWhiteWine;
import patterns.abstractfactory.product.HighSugarRedWine;
import patterns.abstractfactory.product.HighSugarWhiteWine;

public class HighSugarWineFactory implements AbstractWineFactory {

    @Override
    public AbstractRedWine createRedWine() {
        return new HighSugarRedWine();
    }

    @Override
    public AbstractWhiteWine createWhiteWine() {
        return new HighSugarWhiteWine();
    }
}
