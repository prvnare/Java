package org.prvn.lab.lambda;

import java.util.logging.Logger;

public class LambdaExampleUsingRunnable {
  public static void main(String[] args) {
      Logger log  = Logger.getLogger("LambdaExampleUsingRunnable");

      // Before Lambdas  --->  Before JAVA 8 -- Using Anonymous classes

      Runnable runnableAnonymous =  new Runnable() {
          @Override
          public void run() {
              log.info("Run method invoked from anonymous class");
          }
      };

      Thread t = new Thread(runnableAnonymous);
      t.start();

      /*
          1)  Lambda is like an anonymous method which takes something and returns something
                -> Syntax ==>  (Something)   -> { return something }
                                    |         |            |
                                  parameters  operator   body of lambda

          2)  Lambdas will work on the Functional interfaces --> Single Abstract Method Interface is Functional Interface(SAM)

       */

      // Declaring Lambda for Runnable Functional Interface, which is having only single abstract method called run()
      //Lambda for Runnable
      Runnable runnableLambda = () -> log.info("Run method invoked from Lambda");

      Thread thread = new Thread(runnableLambda);
      thread.start();

  }
}
