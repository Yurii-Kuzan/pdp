package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

    public static void main(String[] args) {

        Dog d1 = new Dog("d", 30);
        Dog d2 = new Dog("c", 20);
        Dog d3 = new Dog("b", 10);
        Dog d4 = new Dog("a", 40);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("-------Sorted-------");
        Collections.sort(dogs, new SortByColor());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }

    static class SortByColor implements Comparator<Dog> {
        @Override
        public int compare(Dog o1, Dog o2) {
            return o1.color.compareTo(o2.color);
        }
    }
}
