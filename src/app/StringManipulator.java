package app;

import java.util.function.Consumer;

public interface StringManipulator {
    Consumer<String> toUpperCaseConsumer = s -> System.out.println(s.toUpperCase());
}