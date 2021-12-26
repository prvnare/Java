package org.prvn.lab.functionalinterfaces;

import java.util.function.Consumer;
import java.util.logging.Logger;

public class ConsumerExampleOne {
  public static void main(String[] args) {

      Logger log = Logger.getLogger("ConsumerExampleOne");

      /*
        Consumer is a functional interface introduced in java 1.8
        Functionality of the consumer interface is to take something and return nothing
        Represents an operation that accepts a single input argument and returns no result.

        void accept(T t);  --> Takes Something and returns nothing
       */

      // Consumer Lambda --> converts the given string to uppercase
      Consumer<String> upperCaseConsumer =  value -> log.info(value.toUpperCase());
      upperCaseConsumer.accept("praveen");

      Consumer<String> splitConsumer =  value -> {
            final String[] s = value.split(" ");
            for (String data : s ) {
                log.info(data);
                }
            };
      splitConsumer.accept("praveen are");

      //using consumer andThen() default method
      // it will convert the String to uppercase and splits the string based on " "

      upperCaseConsumer.andThen(splitConsumer).accept("praveen are");
  }
}
