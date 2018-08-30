package collections;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        // pridedame eile elementu i kolekcija;
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // norim prideti elementa, kuris jau yra kolekcijoje;
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false
        System.out.println("---------");

        System.out.printf("Set contains %d elements \n", states.size());    // 3
        for (String state : states) {
            System.out.println(state);
        }

        // elemento naikinimas;
        states.remove("Germany");
        System.out.println("---------");
        System.out.printf("Set contains %d elements \n", states.size());    // 2
        for (String state : states) {
                System.out.println(state);
        }

            System.out.println("-----------");

            // HashSet objektai Person klaseje;
            HashSet<Person> people = new HashSet<Person>();
            people.add(new Person("Mike"));
            people.add(new Person("Tom"));
            people.add(new Person("Nick"));
            for (Person p : people) {

                System.out.println(p.getName());
            }
        }
    }

    class Person {

        private String name;

        public Person(String value) {
            name = value;
        }
        String getName() {
            return name;
        }
    }

