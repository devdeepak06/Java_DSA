package Recursion;

public class StringToInt {
    public static int convertStringToInt(String input) {
        if (input.length() == 1) {
            return input.charAt(0) - '0';
        }
        int smallAns = convertStringToInt(input.substring(1));
        int a = input.charAt(0) - '0';
        return a * (int)Math.pow(10, input.length() - 1) + smallAns;
    }
    public static void main(String[] args) {
        System.out.println(convertStringToInt("1234"));
    }
    
}
