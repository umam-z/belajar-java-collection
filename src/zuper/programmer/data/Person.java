package zuper.programmer.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        /**
         * fungsi unmodifiableList memungkinkan setiap return dari list
         * tidak dapat dimodifikasi kembali. jika tetap dilakukan akan membuat
         * kode menjadi error
        */ 
        return Collections.unmodifiableList(hobbies);
    }
}
