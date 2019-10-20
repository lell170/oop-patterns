package patterns.abstractfactory;

import patterns.abstractfactory.factory.AbstractWineFactory;
import patterns.abstractfactory.product.AbstractRedWine;
import patterns.abstractfactory.product.AbstractWhiteWine;

class Client {
    private final AbstractRedWine redWine;
    private final AbstractWhiteWine whiteWine;

    Client(final AbstractWineFactory factory) {
        redWine = factory.createRedWine();
        whiteWine = factory.createWhiteWine();
    }

    void execute() {
        whiteWine.interact(redWine);
    }
}
