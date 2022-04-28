package collections;

import java.util.HashSet;

public class Set {


    public static void main(String[] args) {

        HashSet<String> states = new HashSet<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", states.size());

        for (String state : states) {

            System.out.println(state);
        }
        states.remove("Germany");

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for (Person p : people) {

            System.out.println(p.getName());
        }
    }
}
