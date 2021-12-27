package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public final static List<Person> personList = PersonDatabase.getPersonList();

    // BiConsumer will take two arguments as input and returns nothing

    BiConsumer<String, String>  concatStringsConsumer = (value1, value2) ->System.out.println( value1.concat(value2));

    //  concatStringsConsumer.accept("Ram","Charan");

    static BiConsumer<String, List<String>> personNameAndActivitiesConsumer = (name, activities) -> System.out.println(name + " : " + activities);

  public static void main(String[] args) {
    printNameAndActivities();
  }

  public static void printNameAndActivities(){
      personList.forEach(person -> personNameAndActivitiesConsumer.accept(person.getFirstName(), person.getActivities()));
  }
}
