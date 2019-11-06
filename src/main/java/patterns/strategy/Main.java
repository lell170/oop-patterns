package patterns.strategy;

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
		context.setSortingAlgorithm(Main::selectionSort);
		System.out.println(context.executeStrategy(list));

		// using of bubble sorting strategy
		System.out.println(shuffleAndPrint(list));
		context.setSortingAlgorithm(Main::bubbleSort);
		System.out.println(context.executeStrategy(list));
	}

	private static List<Integer> shuffleAndPrint(final List<Integer> list) {
		System.out.println("randomized List");
		Collections.shuffle(list);
		return list;
	}

    private static List<Integer> selectionSort(final List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int least = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(least)) {
                    least = j;
                }
            }
            final Integer tmp = list.get(i);
            list.set(i, list.get(least));
            list.set(least, tmp);
        }
        return list;
    }

    private static List<Integer> bubbleSort(final List<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    final Integer temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
