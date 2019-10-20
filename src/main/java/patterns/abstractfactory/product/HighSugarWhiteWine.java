package patterns.abstractfactory.product;


public class HighSugarWhiteWine implements AbstractWhiteWine {

    @Override
    public void interact(final AbstractRedWine redWine) {
        System.out.println(this.getClass().getName() + " interacts with " + redWine.getClass().getName());
    }

}
