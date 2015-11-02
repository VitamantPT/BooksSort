/**
 * Стратегия не предполагающая сортировку
 */

import java.util.Comparator;
import java.util.List;

public class NoSort implements SortStrategy {

    private Comparator<Book> comparator;

    public NoSort() {
        this.comparator = new DefaultComparator();
    }

    @Override
    public void setComparator(Comparator<Book> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(List<Book> books) {  }
}
