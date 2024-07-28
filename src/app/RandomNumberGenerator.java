package app;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
//    public static int generateRandomNumber() {
//        Random rand = new Random();
//        return (int) (Math.random() * 100);
//    }
}