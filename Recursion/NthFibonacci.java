package Recursion;

import java.util.Scanner;

public class NthFibonacci {
    public static int fibo(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        int smallOutput1 = fibo(n - 1);
        int smallOutput2 = fibo(n - 2);
        return smallOutput1 + smallOutput2;

    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(fibo(n));
        }
    }
}