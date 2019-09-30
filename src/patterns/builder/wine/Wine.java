package patterns.builder.wine;

import patterns.builder.components.*;

public class Wine {

    private final GrapeType grapeType;
    private final double alcoholVol;
    private final Type type;
    private final double sugar;
    private final double acidity;
    private final Barrique barrique;
    private final WineMaker wineMaker;

    public Wine(final GrapeType grapeType, final double alcoholVol, final Type type, final double sugar, final double acidity,
            final Barrique barrique, final WineMaker wineMaker) {

        this.grapeType = grapeType;
        this.alcoholVol = alcoholVol;
        this.type = type;
        this.sugar = sugar;
        this.acidity = acidity;
        this.barrique = barrique;
        this.barrique.setWine(this);
        this.wineMaker = wineMaker;
    }

    public GrapeType getGrapeType() {
        return grapeType;
    }

    public double getSugar() {
        return sugar;
    }

    public double getAcidity() {
        return acidity;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    public Type getType() {
        return type;
    }

    public Barrique getBarrique() {
        return barrique;
    }

    public WineMaker getWineMaker() {
        return wineMaker;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "grapeType=" + grapeType +
                ", type=" + type +
                '}';
    }
}