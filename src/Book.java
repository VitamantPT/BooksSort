/**
 * Класс Book (Книга)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    // Название книги
    private String name;
    // Имя автора
    private String authorName;
    // Дата публикации
    private Date publishDate;

    // Конструктор
    public Book(String name, String authorName, Date publishDate) {
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() { return name; }

    public String getAuthorName() { return authorName; }

    public Date getPublishDate() { return publishDate; }


    // Для удобного вывода
    @Override
    public String toString() {
        return new SimpleDateFormat("yyyy").format(publishDate) + " " + authorName + " " + name;
    }
}
