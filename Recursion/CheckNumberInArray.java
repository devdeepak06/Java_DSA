package Recursion;

import java.util.Scanner;

public class CheckNumberInArray {
    public static boolean checkNumber(int input[], int x) {
        if(input.length == 0){
            return false;
        }
        if(input[0] == x){
            return true;
        }
        int[] smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = checkNumber(smallInput, x);
        return smallAns;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] input = new int[n];
            for(int i = 0; i < n; i++) {
                input[i] = s.nextInt();
            }
            int x = s.nextInt();

            // int[] arr = {9, 8, 10, 7};
            System.out.println(checkNumber(input, x));
        }
    }
}
