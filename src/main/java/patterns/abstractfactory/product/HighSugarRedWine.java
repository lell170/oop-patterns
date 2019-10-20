package patterns.abstractfactory.product;

public class HighSugarRedWine implements AbstractRedWine {
    @Override
    public void interact(final AbstractWhiteWine whiteWine) {
        System.out.println(this.getClass().getName() + " interacts with " + whiteWine.getClass().getName());
    }
}
