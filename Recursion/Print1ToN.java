package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            print(n);
        }

    }
}
