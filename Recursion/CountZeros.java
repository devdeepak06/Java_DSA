package Recursion;

public class CountZeros {
    
    public static int countZeros(int n) {
        if (n == 0) {
            return 1;
        }
        int smallInput = n / 10;
        int smallAns = countZeros(smallInput);
        if (n % 10 == 0) {
            return 1 + smallAns;
        }
        return smallAns;
    }
    public static void main(String[] args) {
        int n = 102030;
        System.out.println(countZeros(n));
    }
}
