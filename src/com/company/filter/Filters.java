package com.company.filter;

import com.company.enums.eFilter;
import com.company.enums.eGenre;
import com.company.enums.eLogical;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class  Filters {
    private static List<filterParent> filter = new ArrayList<>();

    public Filters() {
    }

    public void createFilter(eFilter eFil) {
        switch (eFil) {
            case YEAR:
                filter.add(new filterYear());
                break;
            case PAGE:
                filter.add(new filterPage());
                break;
            case GENRE:
                filter.add(new filterGenre());
                break;
        }
    }

    public void getFilter(int eFil) {
        filter.get(eFil);
    }

    public int size() {
        return filter.size();
    }

    public static void addValue(Object obj) {
        //filterYear fYear;
        //filterPage fPage;
        //filterGenre fGenre;
        switch (filter.get(filter.size() - 1).geteFilterType())
        {
            case YEAR:
                ((filterYear) filter.get(filter.size() - 1)).setYear((int)obj); break;
            case PAGE:
                ((filterPage) filter.get(filter.size() - 1)).setPage((int)obj); break;
            case GENRE:
                ((filterGenre) filter.get(filter.size() - 1)).setBookGenre((List<eGenre>)obj); break;
        }
    }

    public void addLogic(@Nullable eLogical eLog) {
        switch (filter.get(filter.size() - 1).geteFilterType())
        {
            case YEAR:
                ((filterYear) filter.get(filter.size() - 1)).seteLogic(eLog); break;
            case PAGE:
                ((filterPage) filter.get(filter.size() - 1)).seteLogic(eLog); break;
        }
    }

    public void clearFilter() {
        filter.clear();
    }
}
