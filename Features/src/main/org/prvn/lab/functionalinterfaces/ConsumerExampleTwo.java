package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleTwo {

    // Get List Of Persons
  static List<Person> personList = PersonDatabase.getPersonList();

    // Using Consumer to print the person details
  static Consumer<Person> printPersonConsumer =  person -> System.out.println(person);

  // Using Consumer to print the person name and his activities
  static Consumer<Person> printPersonFirstNameConsumer =  person -> System.out.println(person.getFirstName());
  static Consumer<Person> printPersonLastConsumer =  person -> System.out.println(person.getLastName());
  static Consumer<Person> printPersonActivitiesConsumer =  person -> System.out.println(person.getActivities());


  public static void main(String[] args) {
      printPersonDetails();
      printNameAndHisActivities();
      printPersonDetailsWhoisHavingAgeGreaterThan30();
  }

  //Printing the Person details
  public static void printPersonDetails(){
      System.out.println("***** printPersonDetails ****");
      //calling the forEach on List<Person> , which takes consumer as a parameter
      personList.forEach(printPersonConsumer);
  }

  //Print Person firstName .Last Name and list of activities
  public static void printNameAndHisActivities(){
      System.out.println("***** printNameAndHisActivities ****");
     //calling the forEach on List<Person> , which takes consumer as a parameter using chaining ..
     personList.forEach(printPersonFirstNameConsumer.andThen(printPersonLastConsumer).andThen(printPersonActivitiesConsumer));
    }

  public static void printPersonDetailsWhoisHavingAgeGreaterThan30(){
    System.out.println("***** printPersonDetailsWhoisHavingAgeGreaterThan30 ****");
     personList.forEach(person -> {
         if(person.getAge()>=30){
             // reusing the code
             printPersonFirstNameConsumer.andThen(printPersonLastConsumer).accept(person);
         }
     });
  }
}
