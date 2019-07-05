package com.company.filter;

import com.company.enums.eFilter;
import com.company.enums.eLogical;

public class filterYear extends filterParent {
    private int Year;

    private eLogical eLogic;

    public filterYear() {
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public eLogical geteLogic() {
        return eLogic;
    }

    public void seteLogic(eLogical eLogic) {
        this.eLogic = eLogic;
    }

    @Override
    public eFilter geteFilterType() {
        return eFilter.YEAR;
    }
}
