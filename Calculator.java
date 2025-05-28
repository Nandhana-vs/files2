

import java.util.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        // Two integers
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result (int + int): " + obj.add(a, b));

        // Three integers
        System.out.println("Enter third integer:");
        int c = sc.nextInt();
        System.out.println("Result (int + int + int): " + obj.add(a, b, c));

        // Two doubles
        System.out.println("Enter two double numbers:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Result (double + double): " + obj.add(d1, d2));

        sc.close();
    }
}


