package org.prvn.lab.functionalinterfaces;

import java.util.function.Predicate;

public class WorkingWithPredicate {

  // Predicate takes an input and evaluates on this input and returns the boolean result
  // test(T t) --> is the method that Predicate uses.

  // it evaluates given integer is even or not
  static  Predicate<Integer>  evenNumberPredicate = value -> value %2 == 0;
  static Predicate<Integer>  isGivenNumberDivisibleBy5 =  value -> value%5 == 0;

  public static void main(String[] args) {
    System.out.println("given number is even ? :  " + evenNumberPredicate.test(10));
    System.out.println("given number is even ? :  " + evenNumberPredicate.test(11));
    System.out.println("given number is even and divisible by 5 : " + evenNumberPredicate.and(isGivenNumberDivisibleBy5).test(10));
    System.out.println("given number is even and divisible by 5 : " + evenNumberPredicate.and(isGivenNumberDivisibleBy5).test(11));
    System.out.println("given number is even Or divisible by 5 : " + evenNumberPredicate.or(isGivenNumberDivisibleBy5).test(10));
    System.out.println("given number is even Or divisible by 5 : " + evenNumberPredicate.or(isGivenNumberDivisibleBy5).test(11));
    System.out.println("Negate given number is even and divisible by 5 : " + evenNumberPredicate.and(isGivenNumberDivisibleBy5).negate().test(11));
  }
}
