package patterns.strategy.algorithms;

import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public List<Integer> sort(final List<Integer> list) {

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
