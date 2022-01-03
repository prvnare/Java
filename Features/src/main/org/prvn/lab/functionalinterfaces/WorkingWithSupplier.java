package org.prvn.lab.functionalinterfaces;

import org.prvn.lab.data.Person;
import org.prvn.lab.data.PersonDatabase;

import java.util.List;
import java.util.function.Supplier;

public class WorkingWithSupplier {
    //Supplier returns something
    static Supplier<List<Person>> personSupplier = ()-> PersonDatabase.getPersonList();
  public static void main(String[] args) {
    //
      final List<Person> people = personSupplier.get();
    System.out.println(people);
  }
}
