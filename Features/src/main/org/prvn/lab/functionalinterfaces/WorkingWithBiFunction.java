package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class WorkingWithBiFunction {

    static BiFunction<List<Person>, Predicate<Person>, Map<String, List<String>>> femalePersonActivities = ((people, personPredicate) -> {

        Map<String,List<String>> femalePersonActivities = new HashMap<>();
        people.forEach(person -> {
            if(personPredicate.test(person)){
                femalePersonActivities.put(person.getFirstName() + " : "+ person.getGender(), person.getActivities());
            }
        });
        return femalePersonActivities;
    });

    public static void main(String[] args) {
    //
    System.out.println(
        femalePersonActivities.apply(PersonDatabase.getPersonList(), person -> person.getGender().equals("FeMale")));
  }
}
