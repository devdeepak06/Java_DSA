//You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
//You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
//Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :
// m * x
//where m is total number of subscribers whose budget is greater than or equal to x.
//Input Format :
//Line 1 : N (No. of subscribers)
//Line 2 : Budget of subscribers (separated by space)
//Output Format :
// Maximum profit
//Constraints :
//1 <= N <= 10^6
//1<=budget[i]<=9999
//Sample Input 1 :
//4
//30 20 53 14
//Sample Output 1 :
//60

package Recursion;
import java.util.Scanner;
public class MaximumProfitOnApp {
    public static int maximumProfit(int budget[]) {
        return maximumProfit(budget, 0, 0);
    }
    private static int maximumProfit(int budget[], int index, int maxProfit) {
        if(index == budget.length) {
            return maxProfit;
        }
        int count = 0;
        for(int i = 0; i < budget.length; i++) {
            if(budget[i] >= budget[index]) {
                count++;
            }
        }
        int profit = count * budget[index];
        if(profit > maxProfit) {
            maxProfit = profit;
        }
        return maximumProfit(budget, index + 1, maxProfit);
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int budget[] = new int[n];
            for(int i = 0; i < n; i++) {
                budget[i] = s.nextInt();
            }
            System.out.println(maximumProfit(budget));
            s.close();
        }
    }
}