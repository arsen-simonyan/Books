package com.company.filter;

import com.company.enums.eFilter;
import com.company.enums.eGenre;

import java.util.List;

public class filterGenre extends filterParent {
    private List<eGenre> bookGenre;

    public filterGenre() {
    }

    public List<eGenre> getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(List<eGenre> bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public eFilter geteFilterType() {
        return eFilter.GENRE;
    }
}
