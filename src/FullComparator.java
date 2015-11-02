/**
 * Компаратор, формируется за счёт цепи CompareChain.
 * Предполагает сравнение книг по дате публикации, наванию книги
 * и имени автора класса Book (Книга)
 *
 * Второстепенный компаратор, для экспериментов
 */

import java.util.Comparator;

public class FullComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        return CompareChain.newChain()
                .comparePublishDate(bookOne, bookTwo)
                .compareAuthorNames(bookOne, bookTwo)
                .compareNames(bookOne, bookTwo)
                .buildResult();
    }

}
