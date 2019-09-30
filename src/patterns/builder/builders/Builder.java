package patterns.builder.builders;

import patterns.builder.components.Barrique;
import patterns.builder.components.GrapeType;
import patterns.builder.components.WineMaker;
import patterns.builder.wine.Type;

public interface Builder {

    void setGrapeType(GrapeType grapeType);
    void setAlcoholVol(double alcoholVol);
    void setType(Type type);
    void setSugar(double sugar);
    void setAcidity(double acidity);
    void setBarrique(Barrique barrque);
    void setWineMaker(WineMaker wineMaker);

}
