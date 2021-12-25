package org.prvn.lab.imperativevsdecalrative;

import java.util.logging.Logger;
import java.util.stream.IntStream;

import static java.text.MessageFormat.format;

public class ImperativeVSDeclarativeExample {
    static Logger log = Logger.getLogger("Class");
    public static void main(String[] args) {

       // Imperative Programming -->  is kind "HOW" type of programming
        int sum = 0;
        for(int i =0;  i<=100;  i++){
            sum += i;
        }
         String msgFormat = format("Sum of 100 numbers using Imperative is  : {0}", sum);
        log.info(msgFormat);

        // Declarative Programming -->  is kind "WHAT" type of programming
        sum = IntStream.rangeClosed(1, 100).sum();
        msgFormat = format("Sum of 100 numbers using Declarative is  : {0}", sum);
        log.info(msgFormat);
     }
}
