package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class WorkingWithBiPredicate {

    //Checking Person is female and Nationality is Indian
    BiPredicate<String, String> personBiPredicate = (gender, nationality) -> gender.equals("FeMale") && nationality.equals("Indian");

  Consumer<Person> printPersonConsumer =
      person -> {
        if (personBiPredicate.test(person.getGender(), person.getNationality())) {
          System.out.println("Person Details : " + person);
        }
      };

  public static void main(String[] args) {
    //
      WorkingWithBiPredicate object =  new WorkingWithBiPredicate();
      final List<Person> personList = PersonDatabase.getPersonList();

      personList.forEach(object.printPersonConsumer);
  }
}
