package patterns.builder;

import patterns.builder.builders.WineBuilder;
import patterns.builder.builders.WineLabelBuilder;
import patterns.builder.wine.Wine;
import patterns.builder.director.Director;
import patterns.builder.wine.WineLabel;

public class Main {

    public static void main(final String[] args) {
        final Director director = new Director();
        final WineBuilder builder = new WineBuilder();
        final WineLabelBuilder wineLabelBuilder = new WineLabelBuilder();

        // set for director concrete builder
        director.produceRedWine(builder);
        final Wine wine = builder.getResult();

        // produce Label for red wine
        director.produceRedWine(wineLabelBuilder);
        final WineLabel wineLabel = wineLabelBuilder.getResult();

        System.out.println("Wine produced:\n" + wine);
        System.out.println("Wine Label: " + wineLabel);
    }
}
