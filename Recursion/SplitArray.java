//Given an integer array A of size N, check if the input array can be splitted in two parts such that -
//Sum of both parts is equal
//All elements in the input, which are divisible by 5 should be in same group.
//All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
//Elements which are neither divisible by 5 nor by 3, can be put in any group.
//Note : You will get marks only if all the test cases are passed.
//Input Format :
//Line 1 : Integer N (size of array)
//Line 2 : Array A elements (separated by space)
//Output Format :
//true or false
//Constraints :
//1 <= N <= 50
//Sample Input 1 :
//2
//1 2
//Sample Output 1 :
//false
//Sample Input 2 :
//3
//1 4 3
//Sample Output 2 :
//true


package Recursion;
import java.util.Scanner;


public class SplitArray {
            public static boolean splitArray(int input[]) {
                return splitArray(input, 0, 0, 0);
            }
            public static boolean splitArray(int input[], int index, int sum1, int sum2) {
                if(index == input.length) {
                    return sum1 == sum2;
                }
                if(input[index] % 5 == 0) {
                    sum1 += input[index];
                } else if(input[index] % 3 == 0) {
                    sum2 += input[index];
                } else {
                    return splitArray(input, index + 1, sum1 + input[index], sum2) || splitArray(input, index + 1, sum1, sum2 + input[index]);
                }
                return splitArray(input, index + 1, sum1, sum2);
            }
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                int input[] = new int[n];
                for(int i = 0; i < n; i++) {
                    input[i] = s.nextInt();
                }
                System.out.println(splitArray(input));
                s.close();
            }
}