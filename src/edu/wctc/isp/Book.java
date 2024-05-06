package edu.wctc.isp;

import java.time.LocalDate;

public interface Book extends Product {

    String getAuthor();


    String getFormattedReleaseDate();

    String getISBN();

    int getPages();

}

