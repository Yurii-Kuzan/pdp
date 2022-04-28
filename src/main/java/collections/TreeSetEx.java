package collections;

import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }
    }
}
