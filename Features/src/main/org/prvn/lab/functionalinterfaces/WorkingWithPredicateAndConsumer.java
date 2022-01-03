package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class WorkingWithPredicateAndConsumer {

    //Predicate for check female
    Predicate<Person> femalePredicate = person -> person.getGender().equals("FeMale");

    //Check the Person from India
    Predicate<Person> countryPredicate = person -> person.getNationality().equals("Indian");

    //Print the Person Details
    Consumer<Person> personConsumer = person -> {
        if(femalePredicate.and(countryPredicate).test(person)){
            System.out.println("Details of Person : " + person);
        }
    };


    public static void main(String[] args) {
    //
        final List<Person> personList = PersonDatabase.getPersonList();
        WorkingWithPredicateAndConsumer object = new WorkingWithPredicateAndConsumer();

        // Print the Female person Details whose nationality is Indian
        personList.forEach(object.personConsumer);
  }
}
