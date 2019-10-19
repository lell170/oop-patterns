package patterns.builder.director;

import patterns.builder.builders.Builder;
import patterns.builder.components.Barrique;
import patterns.builder.components.GrapeType;
import patterns.builder.components.WineMaker;
import patterns.builder.wine.Type;

public class Director {

    public void produceRedWine(final Builder builder) {
        builder.setGrapeType(GrapeType.PINOT_NOIR);
        builder.setAlcoholVol(14.5);
        builder.setType(Type.RED_WINE);
        builder.setBarrique(new Barrique(2500));
        builder.setSugar(0.3);
        builder.setWineMaker(new WineMaker("Müller", "Germany"));
    }

    public void produceWhiteWine(final Builder builder) {
        builder.setGrapeType(GrapeType.RIESLING);
        builder.setAlcoholVol(12.5);
        builder.setType(Type.WHITE_WINE);
        builder.setBarrique(new Barrique(1000));
        builder.setAcidity(10.0);
        builder.setSugar(5.0);
        builder.setWineMaker(new WineMaker("Gerl", "Austria"));
    }

    public void produceSparklingWine(final Builder builder) {
        builder.setGrapeType(GrapeType.SILVANER);
        builder.setAlcoholVol(13.0);
        builder.setType(Type.SPARKLING_WINE);
        builder.setAcidity(15.0);
        builder.setSugar(5.0);
        builder.setBarrique(new Barrique(75));
        builder.setWineMaker(new WineMaker("La Cache", "France"));
    }
}
