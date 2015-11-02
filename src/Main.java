/**
 * Проверка работоспособности.
 * Примеры книг взяты частично из существующих, а частично являются вымыслом.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
            throws ParseException {

        // Список книг
        List<Book> books = new ArrayList<Book>() {{
            add(new Book("Java SE 8. Вводный курс", "Кей С. Хорстманн", new SimpleDateFormat("yyyy").parse("2014")));
            add(new Book("Объектно-ориентированное мышление", "Мэтт Вайсфельд", new SimpleDateFormat("yyyy").parse("2014")));
            add(new Book("Java EE 7 Основы", "Гупта Арун", new SimpleDateFormat("yyyy").parse("2014")));

            add(new Book("Java. Эффективное программирование", "Джошуа Блох", new SimpleDateFormat("yyyy").parse("2014")));
            add(new Book("Регулярные выражения", "Джеффри Фридл", new SimpleDateFormat("yyyy").parse("2008")));
            add(new Book("Pro Git 1st Edition", "Скот Чакон", new SimpleDateFormat("yyyy").parse("2008")));

            add(new Book("Nagios Core Administration Cookbook", "Tom Ryder", new SimpleDateFormat("yyyy").parse("2013")));
            add(new Book("Git Magic", "Ben Lynn", new SimpleDateFormat("yyyy").parse("2007")));
            add(new Book("Ansible Up and Running", "Lorin Hochstain", new SimpleDateFormat("yyyy").parse("2015")));
            add(new Book("Компьютерные сети", "Олифер", new SimpleDateFormat("yyyy").parse("2010")));

            // Вымысел. Вносит нотку хаоса, полезно.
            add(new Book("Изучаем SQL", "Джеффри Фридл", new SimpleDateFormat("yyyy").parse("2009")));
            add(new Book("Сетевое администрирование для самоваров", "Гупта Арун", new SimpleDateFormat("yyyy").parse("2010")));
            add(new Book("Компьютерные сети для самых маленьких", "Гупта Арун", new SimpleDateFormat("yyyy").parse("2010")));
        }};

        System.out.println("Оригинал: \t\t\t\t\t\t\t\t" + books + "\n");



        SortStrategy sortStrategy;

        /**
         * Стратегия сортировки книг пузырьком по дате публикации от меньшей к большей.
         * Основная цель задания
         *
         * Параметры .useBubbleSort() и .useDefaultComparator() приведены для наглядности и необязательны
         * т.к. по-умолчанию в билдере стратегии выбран способ сортировки пузырьком и компаратор на основе даты
         */
        sortStrategy = SortStrategyBuilder.newStrategy()
                .useBubbleSort()
                .useDefaultComparator()
                .buildStrategy();

        sortStrategy.sort(books);
        System.out.println("Сортировка по дате: \t\t\t\t\t" + books);


        /**
         * Стратегия сортировки книг пузырьком по дате и автору от меньшей к большей.
         * Второстепенна
         */
        sortStrategy = SortStrategyBuilder.newStrategy()
                .useBubbleSort()
                .useBaseComparator()
                .buildStrategy();

        sortStrategy.sort(books);
        System.out.println("Сортировка по дате и автору: \t\t\t" + Arrays.toString(books.toArray()));


        /**
         * Стратегия сортировки книг пузырьком по дате, автору и названию от меньшей к большей.
         * Второстепенна
         */
        sortStrategy = SortStrategyBuilder.newStrategy()
                .useBubbleSort()
                .useFullComparator()
                .buildStrategy();

        sortStrategy.sort(books);
        System.out.println("Сортировка по дате, автору и названию: \t" + Arrays.toString(books.toArray()));


        /**
         * Стратегия не предусматривает сортировки, создана для тестов
         * Второстепенна
         */
        sortStrategy = SortStrategyBuilder.newStrategy()
                .useNoSort()
                .useFullComparator()
                .buildStrategy();

        sortStrategy.sort(books);
        System.out.println("\nНе сортировано (список всё тот же): \t" + Arrays.toString(books.toArray()));

    }
}
