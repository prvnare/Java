package org.prvn.lab.imperativevsdecalrative;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ImperativeVSDeclarativeExampleTwo {
  public static void main(String[] args) {
    Logger log = Logger.getLogger("ImperativeVSDeclarativeExample");

      /*
       * Imperative Way ---> removing the duplicated from the List
       */

      List<Integer>  integersList = Arrays.asList(1, 2, 3,4,4,5,5,6,6,7,7,8,8,8,9,10,0 ,0);

      List<Integer> uniqueIntegerList = new ArrayList<>();

      for (Integer number : integersList) {
          if(!uniqueIntegerList.contains(number)){
              uniqueIntegerList.add(number);
          }
      }
      String msg = MessageFormat.format("Imperative Result : {0}" , uniqueIntegerList );
      log.info(msg);


      /*
       * Declarative Way ---> removing the duplicated from the List
       */
      final List<Integer> collect = integersList.stream().distinct().collect(Collectors.toList());
      msg = MessageFormat.format("Declarative Way Result : {0}" , collect );
      log.info(msg);
  }
}
