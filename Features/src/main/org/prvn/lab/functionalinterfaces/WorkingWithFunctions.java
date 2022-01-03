package org.prvn.lab.functionalinterfaces;

import java.util.function.Function;

public class WorkingWithFunctions {
    // convert given String to Upper case
    static Function<String, String> uppercaseFunction =  name -> name.toUpperCase();

    static Function<String, String> nationalityCheck = nationality -> nationality.equals("Indian") ? "Yes" :"No";
  public static void main(String[] args) {
    //
    System.out.println(uppercaseFunction.apply("Hello World"));
    System.out.println("Indian ? : " +nationalityCheck.apply("Indian"));
  }
}
