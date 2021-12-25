package org.prvn.lab.lambda;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class LambdaWithComparator {
  public static void main(String[] args) {

      Logger log = Logger.getLogger("LambdaWithComparator");

      // Comparator anonymous class Before java 8
      Comparator<String> comparatorAnonymous =  new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
              return o1.compareTo(o2);
          }
      };

      List<String> stringList = Arrays.asList("Praveen","Ram", "Seetha", "Anil");

      Collections.sort(stringList,comparatorAnonymous);
      String msg = MessageFormat.format("Using Comparator with anonymous class : {0} ", stringList);
      log.info(msg);


      List<String> stringListWithLambda  = Arrays.asList("Praveen","Ram", "Seetha", "Anil");

      // Using Lambda Expression for Comparator in java 8
      Comparator<String> comparatorWithLambda  = (value1, value2) -> value1.compareTo(value2);
      Collections.sort(stringList,comparatorWithLambda);
      msg = MessageFormat.format("Using Comparator with Lambda expression  : {0} ", stringListWithLambda);
      log.info(msg);

  }

}
