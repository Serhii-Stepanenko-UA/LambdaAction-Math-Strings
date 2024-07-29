package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    static int a, b;
    static String s;
    static String str;
    static int min, max;

    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return (a + b);
            }
        };

        a = 73;
        b = 24;
        final int res = mathOperation.operate(a, b);
        System.out.println("\n1) \nResult is: " + res);

        s = "Hello, Hillel!";
        StringManipulator stringManipulator = s -> s.toUpperCase();
        System.out.println("\n2) \n" + stringManipulator.toUpperCase(s));

        str = "Hello My Hillel!";
        System.out.println("\n3)");
        Function<String, Integer> countUppers = StringListProcessor::countUppercase;
        final int result = countUppers.apply(str);
        System.out.println("Uppers: " + result);

        min = 1; max = 100;
        System.out.println("\n4) ");
        Supplier<Integer> randomIntegerSupplier = () -> RandomNumberGenerator.generateRandomNumber(min, max);
        System.out.println("Random number: " + randomIntegerSupplier.get());

    }
}