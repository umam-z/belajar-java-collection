package zuper.programmer;

import java.util.List;

import zuper.programmer.data.Person;

public class MutableApp {
    public static void main(String[] args) {

        Person person  = new Person("Umam");

        person.addHobby("Catur");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Makan");
    }
}
