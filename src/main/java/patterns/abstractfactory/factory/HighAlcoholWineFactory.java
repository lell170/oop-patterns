package patterns.abstractfactory.factory;

import patterns.abstractfactory.product.AbstractRedWine;
import patterns.abstractfactory.product.AbstractWhiteWine;
import patterns.abstractfactory.product.HighAlcoholRedWine;
import patterns.abstractfactory.product.HighAlcoholWhiteWine;

public class HighAlcoholWineFactory implements AbstractWineFactory {

    @Override
    public AbstractRedWine createRedWine() {
        return new HighAlcoholRedWine();
    }

    @Override
    public AbstractWhiteWine createWhiteWine() {
        return new HighAlcoholWhiteWine();
    }
}
