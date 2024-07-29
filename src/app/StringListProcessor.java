package app;

public class StringListProcessor {
    public static int countUppercase(String s){
        int uppers = 0;
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c))
                ++uppers;
        }
        return uppers;
    }
}