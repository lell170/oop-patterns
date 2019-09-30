package patterns.builder.wine;

import patterns.builder.components.Barrique;
import patterns.builder.components.GrapeType;
import patterns.builder.components.WineMaker;

public class WineLabel {

    private final GrapeType grapeType;
    private final double alcoholVol;
    private final Type type;
    private final double sugar;
    private final double acidity;
    private final Barrique barrique;
    private final WineMaker wineMaker;

    public WineLabel(final GrapeType grapeType, final double alcoholVol, final Type type, final double sugar, final double acidity,
            final Barrique barrique, final WineMaker wineMaker) {

        this.grapeType = grapeType;
        this.alcoholVol = alcoholVol;
        this.type = type;
        this.sugar = sugar;
        this.acidity = acidity;
        this.barrique = barrique;
        this.wineMaker = wineMaker;
    }

    @Override
    public String toString() {
        return "WineLabel{" +
                "grapeType=" + grapeType +
                ", alcoholVol=" + alcoholVol +
                ", type=" + type +
                ", sugar=" + sugar +
                ", acidity=" + acidity +
                ", barrique=" + barrique +
                ", wineMaker=" + wineMaker +
                '}';
    }
}
