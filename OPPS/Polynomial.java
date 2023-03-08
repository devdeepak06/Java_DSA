package OPPS;

import java.util.Scanner;

public class Polynomial {
    private int[] poly;
    private int maxDegree;

    public Polynomial() {
        poly = new int[10];
        maxDegree = 0;
    }

    public Polynomial(int degree) {
        poly = new int[degree];
        maxDegree = degree - 1;
    }
    // setCoefficient function sets the coefficient for a particular degree value
    public void setCoefficient(int degree, int coeff) {

        while (degree > poly.length - 1) {
            doubleCapacity();
        }
        if (maxDegree < degree) {
            maxDegree = degree;
        }
        poly[degree] = coeff;

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i <= maxDegree; i++) {
            if (poly[i] != 0) {
                System.out.print(poly[i] + "x^" + i + " ");
            }
        }

    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit;
        if (degree1 > degree2) {
            limit = degree1;
        } else {
            limit = degree2;
        }

        Polynomial polysum = new Polynomial(limit + 1);

        for (int i = 0; i <= limit; i++) {
            int sum = 0;
            if (i <= degree1) {
                sum = sum + (this.poly[i]);
            }
            if (i <= degree2) {
                sum = sum + (p.poly[i]);
            }
            polysum.setCoefficient(i, sum);
        }

        return polysum;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        int degree1 = this.maxDegree;
        int degree2 = p.maxDegree;
        int limit;
        if (degree1 > degree2) {
            limit = degree1;
        } else {
            limit = degree2;
        }

        Polynomial polydiff = new Polynomial(limit + 1);

        for (int i = 0; i <= limit; i++) {
            int diff = 0;
            if (i <= degree1) {
                diff = diff + (this.poly[i]);
            }
            if (i <= degree2) {
                diff = diff - (p.poly[i]);
            }
            polydiff.setCoefficient(i, diff);
        }

        return polydiff;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        int limit = this.maxDegree + p.maxDegree;
        Polynomial polymul = new Polynomial(limit + 1);

        for (int i = 0; i <= this.maxDegree; i++) {
            int product = 0;
            for (int j = 0; j <= p.maxDegree; j++) {
                product = polymul.poly[i + j];
                product = product + (this.poly[i] * p.poly[j]);
                polymul.setCoefficient(i + j, product);
            }

        }

        return polymul;

    }

    private void doubleCapacity() {
        int[] temp = poly;
        poly = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            poly[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of terms in the first polynomial");
            int n = s.nextInt(); // n is the number of terms in the first polynomial
            System.out.println("Enter the degree of each term in the first polynomial");
            int degree1[] = new int[n]; // this array stores the degrees of the first polynomial
            for (int i = 0; i < n; i++) {
                degree1[i] = s.nextInt();
            }
            System.out.println("Enter the coefficient of each term in the first polynomial");
            int coeff1[] = new int[n]; // this array stores the coefficients of the first polynomial
            for (int i = 0; i < n; i++) {
                coeff1[i] = s.nextInt();
            }
            Polynomial first = new Polynomial(); // create the first polynomial
            for (int i = 0; i < n; i++) {
                first.setCoefficient(degree1[i], coeff1[i]);
            }
            System.out.println("Enter the number of terms in the second polynomial");
            n = s.nextInt(); // n is the number of terms in the second polynomial
            System.out.println("Enter the degree of each term in the second polynomial");
            int degree2[] = new int[n]; // this array stores the degrees of the second polynomial
            for (int i = 0; i < n; i++) {
                degree2[i] = s.nextInt();
            }
            System.out.println("Enter the coefficient of each term in the second polynomial");
            int coeff2[] = new int[n]; // this array stores the coefficients of the second polynomial
            for (int i = 0; i < n; i++) {
                coeff2[i] = s.nextInt();
            }
            Polynomial second = new Polynomial(); // create the second polynomial
            for (int i = 0; i < n; i++) {
                second.setCoefficient(degree2[i], coeff2[i]);
            }
            System.out.println("Enter your choice:\n1. Add\n2. Subtract\n3. Multiply");
            int choice = s.nextInt(); // choice stores the choice of user
            Polynomial result;
            switch (choice) { // This switch statements tests the choice of the user
                // Add
                case 1:
                    result = first.add(second);
                    result.print();
                    break;
                // Subtract
                case 2:
                    result = first.subtract(second);
                    result.print();
                    break;
                // Multiply
                case 3:
                    result = first.multiply(second);
                    result.print();
                    break;
            }
        }
    }
}