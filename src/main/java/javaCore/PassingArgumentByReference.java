package javaCore;

public class PassingArgumentByReference {
    int a = 10;

    void call(PassingArgumentByReference eg) {
        eg.a = eg.a + 10;
    }

    public static void main(String[] args) {

        PassingArgumentByReference eg = new PassingArgumentByReference();
        System.out.println("Before call-by-reference: " + eg.a);

        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);


    }
}
