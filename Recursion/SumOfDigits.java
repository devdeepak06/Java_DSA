package Recursion;

public class SumOfDigits {
    
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int smallInput = n / 10;
        int smallAns = sumOfDigits(smallInput);
        return n % 10 + smallAns;
        
        // return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfDigits(n));
    }
}
