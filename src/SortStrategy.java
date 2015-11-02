/**
 * Интерфейс стратегии сортировки
 */

import java.util.Comparator;
import java.util.List;

public interface SortStrategy {

    public void setComparator(Comparator<Book> comparator);

    public void sort(List<Book> books);
}
