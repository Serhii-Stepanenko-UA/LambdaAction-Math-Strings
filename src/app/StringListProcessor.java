package app;

public class StringListProcessor {
    public static int countUppercase(String s){
        int uppers = 0;
//      int lowers =0;
//      int others = 0;
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c))
                ++uppers;
//          else if (Character.isLowerCase())
//              ++lowers;
//          else
//              ++others;
        }
        return uppers;
    }
}
