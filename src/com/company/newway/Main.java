package com.company.newway;

import com.company.enums.eAction;
import com.company.enums.eFilter;
import com.company.enums.eGenre;
import com.company.filter.Filters;

import java.util.*;

public class Main {
    private static List<Book> book = new ArrayList<>();
    private static Scanner scanner;
    private static Filters filters = new Filters();

    public static void main(String[] args) {
        readBooksInfo();

        System.out.println("welcome to the electronic library");
        System.out.println(String.format("there are %d books in the library", book.size()));
        scanner = new Scanner(System.in);

        makeMenu(eAction.HOME);
    }

    private static void makeMenu(eAction nAction) {
        switch (nAction) {
            case HOME:
                filters.clearFilter();
                System.out.println("\nPlease select action\n\t 1. All book list\n\t 2. Filter\n\t 3. Exit");
                break;
            case READBOOKS:
                for (Book books : book)
                    System.out.println(books.toString());
                System.out.println("\nPlease select action\n\t 0. Home\n\t - - - \n\t 1. Search");
                break;
            case EXIT:
                System.out.println("\nWelcome again");
                return;
            case FILTER:
                System.out.println("\nPlease select filter\n\t 0. Home\n\t - - - \n\t 1. Year\n\t 2. Page Size\n\t 3. Genre");
                break;
            case FYEAR:
                filters.createFilter(eFilter.YEAR);
                System.out.println("\n\t 1. Larger\n\t 2. Smaller\n\t 3. Equal");
                break;
            case FPAGE:
                filters.createFilter(eFilter.PAGE);
                System.out.println("\n\t 0. Home\n\t - - - \n\t 1. Larger\n\t 2. Smaller\n\t 3. Equal");
                break;
            case FGENRE:
                filters.createFilter(eFilter.GENRE);
                System.out.println("\nPlease select genre\n\t 0. Home\n\t - - - " + eGenre.toStringAll());
                break;
            case FMORE:
            case FLESS:
            case FEQUALLY:
                System.out.println("\nPlease enter value : _");
                break;
            case FCOMPLETE:
                int nValue = eAction.getStep();
                if(filters.size() > 0)
                    System.out.println("Selected filters count " + filters.size());
                System.out.println("\n\t 1. New filter\n\t 2. Make filter");
                break;
            case FADDGENRE:
                //int nValue = eAction.getStep();
                System.out.println("\n\t 0. Home\n\t - - - \n\t 1. New genre\n\t 2. Back");
                break;
            case MAKEFILTER:
                int nValue2 = eAction.getStep();
                makeFilter(nValue2);
                break;
            default: {
                System.out.println("\nWrong menu");
                System.out.println("\nPlease select action\n\t 1. All book list\n\t 2. Filter\n\t 3. Exit");
                nAction = eAction.HOME;
                break;
            }
        }

        makeMenu(eAction.get(nAction, scanner.nextInt()));
    }


    private static void makeFilter(int nValue) {
        System.out.println("ok");
        List<Book> newList = new ArrayList<>();
        Collections.copy(book, newList);
        for (Book list : newList) {

        }
        filters.clearFilter();

    }

    //add books to array list
    private static void readBooksInfo() {
        List<eGenre> arrBook = new ArrayList<>();

        //  1   //
        arrBook.add(eGenre.FANTASY);
        arrBook.add(eGenre.ADVENTURE);
        book.add(new Book(1200, arrBook, "Верн Жюль", "Таинственный остров", 1875));
        arrBook.clear();
        //  2   //
        arrBook.add(eGenre.FANTASY);
        arrBook.add(eGenre.MYSTIC);
        book.add(new Book(425, arrBook, "Григоренко Виталий", "Иван-душитель", 1953));
        arrBook.clear();
        //  3   //
        arrBook.add(eGenre.DETECTIVE);
        arrBook.add(eGenre.MYSTIC);
        book.add(new Book(360, arrBook, "Сейгер Райли", "Последние Девушки", 1992));
        arrBook.clear();
        //  4   //
        arrBook.add(eGenre.DETECTIVE);
        book.add(new Book(385, arrBook, "Ольга Володарская", "То ли ангел, то ли бес", 1995));
        arrBook.clear();
        //  5   //
        arrBook.add(eGenre.NOVEL);
        arrBook.add(eGenre.ACTION);
        book.add(new Book(180, arrBook, "Лихэйн Деннис", "Закон ночи", 1944));
        arrBook.clear();
        //  6   //
        arrBook.add(eGenre.NOVEL);
        book.add(new Book(224, arrBook, "Мураками Харуки", "Страна Чудес без тормозов и Конец Света", 1985));
        arrBook.clear();
        //  7   //
        arrBook.add(eGenre.STORY);
        book.add(new Book(1200, arrBook, "Джон Хейвуд", "Люди Севера: История викингов, 793–1241", 2017));
        arrBook.clear();
        //  8   //
        arrBook.add(eGenre.ACTION);
        arrBook.add(eGenre.MYSTIC);
        arrBook.add(eGenre.DETECTIVE);
        book.add(new Book(415, arrBook, "Линдквист Юн", "Впусти меня", 2017));
        arrBook.clear();
        //  9   //
        arrBook.add(eGenre.ACTION);
        book.add(new Book(202, arrBook, "Сухов Евгений", "Таежная месть", 2016));
        arrBook.clear();
        //  10   //
        arrBook.add(eGenre.DETECTIVE);
        arrBook.add(eGenre.MYSTIC);
        book.add(new Book(231, arrBook, "Винд Кристиан", "Призраки глубин", 2019));
        arrBook.clear();
    }
}
