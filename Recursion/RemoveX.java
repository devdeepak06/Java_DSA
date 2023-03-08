package Recursion;

public class RemoveX {
    public static String removeX(String s) {
        if (s.length() == 0) {
            return s;
        }
        String smallString = removeX(s.substring(1));
        if (s.charAt(0) == 'x') {
            return smallString;
        } else {
            return s.charAt(0) + smallString;
        }
    }
    public static void main(String[] args) {
        String s = "axbxcx";
        System.out.println(removeX(s));
    }
}
