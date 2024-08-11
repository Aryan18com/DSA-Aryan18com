import java.util.Scanner;

import java.util.Scanner;

public class Loops {

    // Method for Question 1: Sum of even numbers up to n
    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of even numbers up to it: ");
        int n = sc.nextInt();
        int ans = 0;
        int i = 2;
        while (i <= n) {
            if (i % 2 == 0) {
                ans = ans + i;
            }
            i++;
        }
        System.out.println("Sum of even numbers up to " + n + " is: " + ans);
    }

    // Method for Question 2: Print multiplication table of a number
    public static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }
    }

    // Method for Question 3: Print reverse multiplication table of a number
    public static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for reverse multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Reverse multiplication table for " + n + ":");
        for (int i = 10; i > 0; i--) {
            System.out.println(i * n);
        }
    }

    // Method for Question 4: Calculate factorial using a for loop
    public static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " using for loop is: " + fact);
    }

    // Method for Question 5: Calculate factorial using a while loop
    public static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " using while loop is: " + fact);
    }

    // Method for Question 6: Sum of multiples of 8 from 1 to 10
    public static void question6() {
        int n = 8;
        int sum = 0;
        System.out.println("Sum of multiples of 8 from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            int p = i * n;
            if (p % 8 == 0) {
                sum += p;
            }
        }
        System.out.println("Sum of multiples of 8 is: " + sum);
    }

    // Method for Question 7: Print multiplication table with format n*X=i*n
    public static void question7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for formatted multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Formatted multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (i * n));
        }
    }

    public static void main(String[] args) {
        // Initialize all the methods here
        System.out.println("Executing Question 1:");
        question1();
        System.out.println("\nExecuting Question 2:");
        question2();
        System.out.println("\nExecuting Question 3:");
        question3();
        System.out.println("\nExecuting Question 4:");
        question4();
        System.out.println("\nExecuting Question 5:");
        question5();
        System.out.println("\nExecuting Question 6:");
        question6();
        System.out.println("\nExecuting Question 7:");
        question7();
    }
}
