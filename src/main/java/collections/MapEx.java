package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String args[]) {
        //HASHMAP
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Ann");
        map.put(101, "Vitali");
        map.put(102, "Ruslan");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("---------------------");

        //COMPARING
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Ann");
        hashMap.put(101, "Vitali");
        hashMap.put(102, "Ruslan");
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println("---------------------");
        //BOOK MAP

        Map<Integer, Book> bookMap = new HashMap<>();

        Book b1 = new Book(101, "Let us Java", "Oleh", "SoftServe", 8);
        Book b2 = new Book(102, "Data Bases", "Andrii", "SoftServe", 4);
        Book b3 = new Book(103, "Operating System", "Ihor", "SoftServe", 6);

        bookMap.put(1, b1);
        bookMap.put(2, b2);
        bookMap.put(3, b3);


        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}


class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

