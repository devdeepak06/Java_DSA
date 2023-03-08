//A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
// Implement the ComplexNumbers class that contains the following functions :
// 1. constructor
// You need to create the appropriate constructor.
// 2. plus -
// This function adds two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 3 + i4
// C1.plus(C2) results in C1 = 7 + i9 and C2 = 3 + i4
// 3. multiply -
// This function multiplies two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 1 + i2
// C1.multiply(C2) results in C1 = -6 + i14 and C2 = 1 + i2
// 4. print -
// This function prints the given complex number in the following format :
// a + ib
// Note : There is space before and after '+' (plus sign) and no space between 'i' and 'b'.
// Input Format :
// Line 1 : Two integers - real and imaginary part of 1st complex number
// Line 2 : Two integers - real and imaginary part of 2nd complex number
//Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)
// Output Format :
// Check details of 'print' function given above.
// Sample Input 1 :
// 4 5
// 6 7
// 1
// Sample Output 1 :
// 10 + i12
// Sample Input 2 :
// 4 5
// 6 7
// 2
// Sample Output 2 :
// -11 + i58



package OPPS;

import java.util.Scanner;

public class CompNum {
    int real;
    int imaginary;
    CompNum(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void plus(CompNum c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void multiply(CompNum c2) {
        int real = this.real * c2.real - this.imaginary * c2.imaginary;
        int imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int real = sc.nextInt();
            int imaginary = sc.nextInt();
            CompNum c1 = new CompNum(real, imaginary);
            real = sc.nextInt();
            imaginary = sc.nextInt();   
            CompNum c2 = new CompNum(real, imaginary);
            int choice = sc.nextInt();
            if(choice == 1) {
                c1.plus(c2);
                c1.print();
            } else if(choice == 2) {
                c1.multiply(c2);
                c1.print();
            }
        }
    }
    
}
