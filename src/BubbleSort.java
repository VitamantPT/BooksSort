/**
 * Стратегия сортировки пузырьком
 */

import java.util.Comparator;
import java.util.List;

public class BubbleSort implements SortStrategy {

    private Comparator<Book> comparator;

    public BubbleSort() {
        this.comparator = new DefaultComparator();
    }

    @Override
    public void setComparator(Comparator<Book> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(List<Book> books) {
        bubbleSort(books);
    }

    private void bubbleSort(List<Book> books) {

        int listSize = books.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (comparator.compare(books.get(j), books.get(j+1)) > 0) {
                    Book swap = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, swap);
                }
            }
        }

    }
}
