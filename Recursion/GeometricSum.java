// Purpose: To calculate the geometric sum of a number
package Recursion;
// public class GeometricSum {
//     public static double geometricSum(int k){
//         if(k == 0){
//             return 1;
//         }
//         double smallOutput = geometricSum(k - 1);
//         return smallOutput + 1/Math.pow(2, k);
//     }
//     public static void main(String[] args) {
//         int k = 3;
//         System.out.println(geometricSum(k));
//     }
// }

import java.util.Scanner;


public class GeometricSum {
    public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0){
            return 1.00000;
        }
        if(k == 1){
            return 1.50000;
        }
        
        double a = findGeometricSum(k - 1);
        // double ans = (a + 1 / (2^k));
        return a + 1 / Math.pow(2, k);
	}
	public static void main(String[] args){
		try (Scanner s = new Scanner(System.in)) {
            int k = s.nextInt();
            System.out.println(findGeometricSum(k));
        }

	}
}
