package Recursion;
import java.util.Scanner;
public class SumofArray {
    public static int sum(int[] input){
        // return sum(input, 0);
        if(input.length == 0){
            return 0;
        }
        int[] smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }
        int smallAns = sum(smallInput);
        return input[0] + smallAns;
    }


    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            System.out.println(sum(arr));
        }
    }

}
