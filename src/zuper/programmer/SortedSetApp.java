package zuper.programmer;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import zuper.programmer.data.Person;
import zuper.programmer.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        /**
         * TreeSet merupakan sebuah class implementasi dari NavigableSet
         * dimana NavigableSet mrupakan merupakan child dari SortedSet.
         * TreeSet sendiri memiliki lebih dari satu constructor. salah satunya
         * ialah harus menerima object dari sebuah class yang implements Comparator
         */
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        
        persons.add(new Person("Budi"));
        persons.add(new Person("Ahmad"));
        persons.add(new Person("Mustafa"));

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        SortedSet<Person> unmodifiablePerson = Collections.unmodifiableSortedSet(persons);
        unmodifiablePerson.add(new Person("Umam"));
    }
}
