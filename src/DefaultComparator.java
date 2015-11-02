/**
 * Компаратор по-умолчанию. Формируется за счёт цепи CompareChain.
 * Предполагает сравнение книг по дате публикации класса Book (Книга)
 *
 * Основной компаратор для задания
 */

import java.util.Comparator;

public class DefaultComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {

        return CompareChain.newChain()
                .comparePublishDate(bookOne, bookTwo)
                .buildResult();
    }

}
