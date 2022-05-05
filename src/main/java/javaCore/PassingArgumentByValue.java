package javaCore;

public class PassingArgumentByValue {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        modify(x, y);

        System.out.println("x=" + x + " y=" + y);
    }

    public static void modify(int x1, int y1) {
        x1 = x1 + 5;
        y1 = y1 + 10;
    }
}

