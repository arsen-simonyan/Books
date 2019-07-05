package com.company.newway;

import com.company.enums.eGenre;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int pageSize;
    private List<eGenre> bookGenre;
    private String bookAuthor;
    private String bookName;
    private int bookYear;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<eGenre> getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(List<eGenre> bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "Book :" +
                "\nbookName \t= '" + bookName + '\'' +
                "\nbookAuthor \t= '" + bookAuthor + '\'' +
                "\nbookYear \t= " + bookYear +
                "\nbookGenre \t= " + eGenre.toString(bookGenre) +
                "\npageSize \t= " + pageSize +
                "\n\n";
    }

    Book(int pageSize, List<eGenre> bookGenre, String bookAuthor, String bookName, int bookYear) {
        this.pageSize = pageSize;
        this.bookGenre = bookGenre;
        this.bookGenre = new ArrayList<>(bookGenre);
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookYear = bookYear;
    }
}