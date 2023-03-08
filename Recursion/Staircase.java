package Recursion;

public class Staircase {
    public static int staircase(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int count = staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(staircase(n));
    }
}
