package org.prvn.app.model;

/*
Single Responsibility

Class should deal with single Responsibility and have only one reason to change the class

Benefits:
   1) Testing :  testing will be Easy because of having single Responsibility of the class.
   2) Loos Coupling : less dependencies required to achieve.
   3) Organizing : small and well Organised classes will give more flexibility to maintain the app

 */

import lombok.Data;

@Data
public class Book {

    private String name;
    private String author;
    private Integer pageCount;
    private Double cost;

}
