package com.company.filter;

import com.company.enums.eFilter;
import com.company.enums.eLogical;

public class filterPage extends filterParent {
    private int Page;
    private eLogical eLogic;

    public filterPage() {
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public eLogical geteLogic() {
        return eLogic;
    }

    public void seteLogic(eLogical eLogic) {
        this.eLogic = eLogic;
    }

    @Override
    public eFilter geteFilterType() {
        return eFilter.PAGE;
    }
}
