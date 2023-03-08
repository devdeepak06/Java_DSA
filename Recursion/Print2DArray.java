//Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
//Input Format :
//Line 1 : No of rows(n) & No of columns(m) (separated by space)
//Line 2 : Row 1 elements (separated by space)
//Line 3 : Row 2 elements (separated by space)
//Line 4 : and so on
//Output Format :
//Updated array 
//Sample Input :
//3 3
//1 2 3
//4 5 6
//7 8 9
//Sample Output :
//1 2 3
//1 2 3
//1 2 3
//4 5 6
//4 5 6
//7 8 9

package Recursion;

import java.util.Scanner;

public class Print2DArray {
    
    public static void print2DArray(int input[][]) {
        print2DArray(input, 0, 0);
    }
    private static void print2DArray(int input[][], int row, int col) {
        if(row == input.length) {
            return;
        }
        if(col == input[row].length) {
            System.out.println();
            print2DArray(input, row + 1, 0);
            return;
        }
        for(int i = 0; i < input.length - row; i++) {
            System.out.print(input[row][col] + " ");
        }
        print2DArray(input, row, col + 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int input[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                input[i][j] = s.nextInt();
            }
        }
        print2DArray(input);
        s.close();
    }
}