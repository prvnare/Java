package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class WorkingWithFunction1 {

    public static Function<Person, List<String>> getPersonsActivitiesFunction = person -> person.getActivities();

    public static Function<List<Person>, Map<String, List<String>>> personMapFunction =  personList -> {
        Map<String, List<String>> mapString = new HashMap<>();
        personList.forEach( person -> {
            mapString.put(person.getFirstName(),person.getActivities());
        });
        return mapString ;
    };

    public static void main(String[] args) {
    //
        final List<Person> personList = PersonDatabase.getPersonList();
    //    System.out.println(personMapFunction.apply(personList));
    personList.forEach(person -> System.out.println(person.getFirstName()+ " :  "+getPersonsActivitiesFunction.apply(person)));
    }

}
