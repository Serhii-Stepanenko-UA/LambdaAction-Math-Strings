package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    static int a, b;
    static String s;
    static String str;
    static int min, max;

    public static void main(String[] args) {

        a = 73; b = 24;
        final int res = MathOperation.mathOperation.operate(a, b);
        System.out.println("\n1) \nResult is: " + res);

        s = "Hello, Hillel!";
        System.out.println("\n2) ");
        StringManipulator.toUpperCaseConsumer.accept(s);

        str = "Hello My Hillel!";
        System.out.println("\n3)");
        Function<String, Integer> countUppers = StringListProcessor::countUppercase;
        final int result = countUppers.apply(str);
        System.out.println("Uppers: " + result);

        min = 1; max = 100;
        System.out.println("\n4)");
        Supplier<Integer> randomIntegerSupplier = () -> RandomNumberGenerator.generateRandomNumber(min, max);
        System.out.println("Random number: " + randomIntegerSupplier.get());

    }
}