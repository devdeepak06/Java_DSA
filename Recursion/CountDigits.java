package Recursion;

import java.util.Scanner;

public class CountDigits {
    public static int count(int n ){
        if(n == 0){
            return 0;

        }
        int smallOutput = count(n / 10);
        int ans = 1 + smallOutput;
        return ans;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(count(n));
        }
    }
}
