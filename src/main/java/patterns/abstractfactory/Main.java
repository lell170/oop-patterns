package patterns.abstractfactory;

import patterns.abstractfactory.factory.AbstractWineFactory;
import patterns.abstractfactory.factory.HighAlcoholWineFactory;
import patterns.abstractfactory.factory.HighSugarWineFactory;

public class Main {

    public static void main(final String[] args) {
        final AbstractWineFactory highAlcoholWines = new HighAlcoholWineFactory();
        final Client client1 = new Client(highAlcoholWines);
        client1.execute();

        final AbstractWineFactory highSugarWines = new HighSugarWineFactory();
        final Client client2 = new Client(highSugarWines);
        client2.execute();
    }
}
