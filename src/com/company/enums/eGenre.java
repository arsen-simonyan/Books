package com.company.enums;

import java.util.List;

public enum eGenre {
    NOVEL("novel"),
    STORY("story"),
    DETECTIVE("detective"),
    ADVENTURE("adventure"),
    ACTION("action"),
    FANTASY("Fantasy"),
    MYSTIC("Mystic");

    private String genre;
    eGenre(String genre) {
        this.genre = genre;
    }

    public String get() {
        return genre;
    }

    public static String toString(List<eGenre> eGenres)
    {
        StringBuilder strRet = new StringBuilder();
        for(eGenre eG : eGenres)
        {
            strRet.append(eG.get());
            strRet.append(", ");
        }
        if(strRet.substring(strRet.length() - 2, strRet.length() - 1).equals(","))
            strRet = new StringBuilder(strRet.substring(0, strRet.length() - 2));

        return strRet.toString();
    }

    public static String toStringAll()
    {
        return "\n\t 1. " +
                NOVEL.get() +
                "\n\t 2. " +
                STORY.get() +
                "\n\t 3. " +
                DETECTIVE.get() +
                "\n\t 4. " +
                ADVENTURE.get() +
                "\n\t 5. " +
                ACTION.get() +
                "\n\t 6. " +
                FANTASY.get() +
                "\n\t 7. " +
                MYSTIC.get();
    }
}
