package patterns.builder.components;

import patterns.builder.wine.Wine;

public class Barrique {

    private Wine wine;
    private int size;

    public Barrique(final int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public Wine getWine() {
        return wine;
    }

    public void setWine(final Wine wine) {
        this.wine = wine;
    }

    public void showCurrentAlcoholVolume() {
        System.out.println("current alcohol volume " + wine.getAlcoholVol());
    }

    public void showAllCurrentWineValues() {
        System.out.println("current sugar " + wine.getSugar());
        System.out.println("current acidity " + wine.getAcidity());
        System.out.println("current alcohol volume " + wine.getAlcoholVol());
    }

    @Override
    public String toString() {
        return "Barrique{" +
                "size=" + size +
                '}';
    }
}
