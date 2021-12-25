package org.prvn.lab;

import java.text.MessageFormat;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class Main {
    static  Logger log = Logger.getLogger("Main");
    public static void main(String[] args) {
      Main main = new Main();
        final boolean validate = main.validate(String::isEmpty, "");
        // New One ---> MessageFormat
        final String format = MessageFormat.format("{0}", validate );
        log.info(format);
    }

    public boolean validate(Predicate<String> predicate, String value){
            return predicate.test(value);
    }

}
