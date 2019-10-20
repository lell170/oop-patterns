package patterns.abstractfactory.product;

public class HighAlcoholWhiteWine implements AbstractWhiteWine {

    @Override
    public void interact(final AbstractRedWine redWine) {
        System.out.println(this.getClass().getName() + " interacts with " + redWine.getClass().getName());
    }

}
