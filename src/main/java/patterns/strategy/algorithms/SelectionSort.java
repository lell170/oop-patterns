package patterns.strategy.algorithms;

import java.util.List;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public List<Integer> sort(final List<Integer> list) {

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
}
