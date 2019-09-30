package patterns.builder.builders;

import patterns.builder.components.Barrique;
import patterns.builder.components.WineMaker;
import patterns.builder.wine.Type;
import patterns.builder.wine.Wine;
import patterns.builder.components.GrapeType;

public class WineBuilder implements Builder {

    private GrapeType grapeType;
    private double alcoholVol;
    private Type type;
    private double sugar;
    private double acidity;
    private Barrique barrique;
    private WineMaker wineMaker;

    public Wine getResult() {
        return new Wine(grapeType, alcoholVol, type, sugar, acidity, barrique, wineMaker);
    }

    @Override
    public void setGrapeType(final GrapeType grapeType) {
        this.grapeType = grapeType;
    }

    @Override
    public void setAlcoholVol(final double alcoholVol) {
        this.alcoholVol = alcoholVol;
    }

    @Override
    public void setType(final Type type) {
        this.type = type;
    }

    @Override
    public void setSugar(final double sugar) {
        this.sugar = sugar;
    }

    @Override
    public void setAcidity(final double acidity) {
        this.acidity = acidity;
    }

    @Override
    public void setBarrique(final Barrique barrique) {
        this.barrique = barrique;
    }

    @Override
    public void setWineMaker(final WineMaker wineMaker) {
        this.wineMaker = wineMaker;
    }


}
