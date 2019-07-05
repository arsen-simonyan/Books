package com.company.enums;

public enum eAction {
    HOME ,
    READBOOKS ,
    EXIT ,
    FILTER ,
    SEARCH ,
    SORT ,
    FYEAR,
    FPAGE,
    FGENRE,
    FMORE,
    FLESS,
    FEQUALLY,
    FCOMPLETE,
    MAKEFILTER,
    FADDGENRE,
    ANOTHER;

    private static int nStepSave;

    public static int getStep() {
        return nStepSave;
    }

    public static eAction get(eAction eA, int nStep)
    {
        nStepSave = nStep;
        switch (eA)
        {
            case HOME:
                if(nStep == 1) return READBOOKS;
                if(nStep == 2) return FILTER;
                if(nStep == 3) return EXIT;
                return ANOTHER;
            case READBOOKS:
                if(nStep == 1) return HOME;
                if(nStep == 2) return SEARCH;
                if(nStep == 3) return SORT;
                return ANOTHER;
            case FILTER:
                if(nStep == 1) return FYEAR;
                if(nStep == 2) return FPAGE;
                if(nStep == 3) return FGENRE;
                return ANOTHER;
            case FYEAR:
            case FPAGE:
                if(nStep == 1) return FMORE;
                if(nStep == 2) return FLESS;
                if(nStep == 3) return FEQUALLY;
                return ANOTHER;
            case FGENRE:
                return nStep > 0 && nStep < 8 ? FADDGENRE : ANOTHER;
            case FADDGENRE:
                if(nStep == 0) return HOME;
                if(nStep == 1) return FGENRE;
                if(nStep == 2) return FCOMPLETE;
            case FMORE:
            case FLESS:
            case FEQUALLY:
                return FCOMPLETE;
            case FCOMPLETE:
                if(nStep == 1) return FILTER;
                if(nStep == 2) return MAKEFILTER;
            case ANOTHER:
                return HOME;
        }
        return ANOTHER;
    }
}
