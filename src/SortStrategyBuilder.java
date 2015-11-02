/**
 * Билтер для построения стратеги сортировки
 *
 * По-умолчанию выбраны стратегия и компаратор необходимые для задания
 */

import java.util.Comparator;

public class SortStrategyBuilder {
    private SortStrategy strategy = new BubbleSort();
    private Comparator<Book> comparator = new DefaultComparator();

    private SortStrategyBuilder() {  }

    public static SortStrategyBuilder newStrategy() {
        return new SortStrategyBuilder();
    }

    public SortStrategyBuilder useNoSort() {
        this.strategy = new NoSort();
        return this;
    }

    public SortStrategyBuilder useBubbleSort() {
        this.strategy = new BubbleSort();
        return this;
    }

    public SortStrategyBuilder useDefaultComparator() {
        this.comparator = new DefaultComparator();
        return this;
    }

    public SortStrategyBuilder useBaseComparator() {
        this.comparator = new BaseComparator();
        return this;
    }

    public SortStrategyBuilder useFullComparator() {
        this.comparator = new FullComparator();
        return this;
    }

    public SortStrategy buildStrategy() {
        strategy.setComparator(comparator);
        return strategy;
    }

}
