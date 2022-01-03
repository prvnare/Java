package org.prvn.lab.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class WorkingWithUneryAndBinaryOperators {
    //Unary Operator used to takes T type and Returns T type
    static UnaryOperator<String>  unaryOperator  = name -> name.toUpperCase();

    //Binary Operator takes two T types and returns T Type
    static BinaryOperator<String> binaryOperator = (firstName, lastName) -> firstName.concat(lastName);


    public static void main(String[] args) {
    //
    System.out.println(unaryOperator.apply("praveen"));
    System.out.println(binaryOperator.apply("praveen", "Are"));
    }

}
