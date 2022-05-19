package oop;

class NestedEx {

    public static void main(String[] args) {

        NestedEx.Factorial fact = NestedEx.getFactorial(6);
        System.out.printf("Factorial of number %d equal %d \n", fact.getKey(), fact.getResult());
    }

    public static class Factorial {

        private int result;
        private int key;

        public Factorial(int number, int x) {

            result = number;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }

    public static Factorial getFactorial(int x) {

        int result = 1;
        for (int i = 1; i <= x; i++) {

            result *= i;
        }
        return new Factorial(result, x);
    }
}
