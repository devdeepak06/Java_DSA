//Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
//That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}.
//The output will be 1, as 1 is the minimum count of numbers required.
//Note : x^y represents x raise to the power y.
//Input format :
//The first and the only line of input contains an integer value, 'N'.
//Output format :
//Print the minimum count of numbers.
//Constraints :
//0 <= n <= 10 ^ 4
//Time Limit: 1 sec
//Sample Input 1 :
//12
//Sample Output 1 :
//3
//Sample Input 2 :
//9
//Sample Output 2 :
//1


package Recursion;
import java.util.Scanner;

public class MinimumCount {
        public static int minimumCount(int n) {
            return minimumCount(n, 1);
        }
        private static int minimumCount(int n, int count) {
            if(n == 0) {
                return 0;
            }
            if(n < 0) {
                return Integer.MAX_VALUE;
            }
            int min = Integer.MAX_VALUE;
            for(int i = 1; i <= n; i++) {
                int ans = minimumCount(n - i * i, count + 1);
                if(ans < min) {
                    min = ans;
                }
            }
            return min + 1;
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println(minimumCount(n));
            s.close();
        }
}
