package patterns.strategy;

import patterns.strategy.algorithms.BubbleSort;
import patterns.strategy.algorithms.SelectionSort;
import patterns.strategy.context.Context;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

        final List<Integer> list = Arrays.asList(4, 232, 45, 434, 67, 23, -34, 35);
        final Context context = new Context();

        // using of selection sorting strategy
        System.out.println(shuffleAndPrint(list));
        context.setSortingAlgorithm(new SelectionSort());
        System.out.println(context.executeStrategy(list));

        // using of bubble sorting strategy
        System.out.println(shuffleAndPrint(list));
        context.setSortingAlgorithm(new BubbleSort());
        System.out.println(context.executeStrategy(list));
    }

    private static List<Integer> shuffleAndPrint(final List<Integer> list) {
        System.out.println("randomized List");
        Collections.shuffle(list);
        return list;
    }
}
