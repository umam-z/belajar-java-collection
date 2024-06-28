package zuper.programmer;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE, Gender.FEMALE);

        for (Gender gender : genders) {
            System.out.println(gender);
        }

        System.out.println("ALL GENDER");

        Gender[] values = Gender.values();

        for (Gender gender : values) {
            System.out.println(gender);
        }
    }
}
