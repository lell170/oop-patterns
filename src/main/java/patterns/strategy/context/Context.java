package patterns.strategy.context;

import patterns.strategy.algorithms.SortingAlgorithm;

import java.util.List;

public class Context {

    private SortingAlgorithm sortingAlgorithm;

    // Set new strategy
    public void setSortingAlgorithm(final SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public List<Integer> executeStrategy(final List<Integer> list) {
        System.out.println("sorted List");

        return sortingAlgorithm.sort(list);
    }
}


