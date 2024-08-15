package MATHS;

import java.util.Scanner;

public class Day02 {

    public static int LCM(int a, int b) {
        int r = Math.max(a, b);
        while (true) {
            if (r % a == 0 && r % b == 0) {
                return r;
            }
            r++;
        }
    }

    public static boolean isPrime(int n) {
        // basic method with tc O(n)

        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }

        // efficient method with tc O(rootn)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }

        // more efficient
        if (n == 2 || n == 3) {
            return true;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }

    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }

        }
    }

    static void power(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // LCM Calculation
        System.out.println("Enter two numbers to find their LCM:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + LCM(num1, num2));

        // Prime Check
        System.out.println("\nEnter a number to check if it is prime:");
        int primeCheck = scanner.nextInt();
        System.out.println(primeCheck + " is prime: " + isPrime(primeCheck));

        // Printing Prime Numbers
        System.out.println("\nEnter a number to print all prime numbers up to that number:");
        int primeLimit = scanner.nextInt();
        System.out.println("Prime numbers up to " + primeLimit + ":");
        printPrime(primeLimit);

        // Power Calculation
        System.out.println("\nEnter base and exponent to calculate power:");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.print(base + " raised to the power of " + exponent + " is: ");
        power(base, exponent);
    }
}

