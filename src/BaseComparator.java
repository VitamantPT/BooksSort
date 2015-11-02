/**
 * Компаратор, формируется за счёт цепи CompareChain.
 * Предполагает сравнение книг по дате публикации и наванию книги
 * класса Book (Книга)
 *
 * Второстепенный компраратор, для экспериментов
 */

import java.util.Comparator;

public class BaseComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        return CompareChain.newChain()
                .comparePublishDate(bookOne, bookTwo)
                .compareAuthorNames(bookOne, bookTwo)
                .buildResult();
    }

}
