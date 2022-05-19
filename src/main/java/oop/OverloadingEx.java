package oop;

public class OverloadingEx {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add("softServe", "inc"));
    }

    private static int add(int x, int y){
        return x + y;
    }

    private static String add(String a, String b){
        return a.concat(b);
    }
}
