package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.Predicate;

public class WorkingWithPredicateOne {

    static List<Person> personList = PersonDatabase.getPersonList();

    //check eligibility of person to vote
    static Predicate<Person> voteEligibilityPredicate = person -> person.getAge() >= 18 ;

    // check passport number Length
    static Predicate<Person> checkPassportNumber =  person -> person.getPassport().length() == 9 ;

    //check Female gender person
    static Predicate<Person> femaleGenderPredicate = person -> person.getGender().equals("FeMale");

    //check person who is having salary > 100000
    static  Predicate<Person> personSalaryPredicate = person -> person.getIncome() >= 100000;

    public static void checkVoteEligibility(){
        for(Person person : personList){
            System.out.println("IS  " + person.getFirstName() + " eligible for vote ?  -->  " + voteEligibilityPredicate.test(person));
        }
    }

  public static void main(String[] args) {
    //
      checkVoteEligibility();
      //printPersonWhoIsHavingValidPassport();
      printFemalePersonWhoIsHavingValidPassport();
      printFemalePersonWhoIsHavingValidPassportAndSalaryGreaterThan100000();
  }

  public static void printPersonWhoIsHavingValidPassport (){
    System.out.println("*****printPersonWhoIsHavingValidPassport******");
       personList.forEach( person ->  {
                if(checkPassportNumber.test(person)){
                    System.out.println(person.getFirstName()  +  " is having valid passport Number with :  " +  person.getPassport());
                }
        });
    }

    public static void printFemalePersonWhoIsHavingValidPassport (){
        System.out.println("*****printFemalePersonWhoIsHavingValidPassport******");
        personList.forEach( person ->  {
            if(femaleGenderPredicate.and(checkPassportNumber).test(person)){
                System.out.println(person.getFirstName()  +  " is FEMALE having valid passport Number with :  " +  person.getPassport());
            }
        });
    }

    public static void printFemalePersonWhoIsHavingValidPassportAndSalaryGreaterThan100000 (){
        System.out.println("*****printFemalePersonWhoIsHavingValidPassportAndSalaryGreaterThan100000******");
        personList.forEach( person ->  {
            if(femaleGenderPredicate.and(checkPassportNumber).and(personSalaryPredicate).test(person)){
                System.out.println(person.getFirstName()  +  " is FEMALE having salary greater than 100000 and valid passport Number with " +  person.getPassport() );
            }
        });
    }

}
