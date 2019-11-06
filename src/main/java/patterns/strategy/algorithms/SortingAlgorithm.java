package patterns.strategy.algorithms;

import java.util.List;

@FunctionalInterface
public interface SortingAlgorithm {

    List<Integer> sort(List<Integer> list);

}
