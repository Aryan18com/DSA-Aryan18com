package MATHS;

public class DAY01 {

    // Method to count digits in a number
    public static void countDigit(int n) {
        int r = 0;
        int temp = n;
        while (n > 0) {
            n = n / 10;
            r++;
        }
        System.out.println("The number of digits in " + temp + " is: " + r);
    }

    // Method to check if a number is a palindrome
    public static void palindrome(int n) {
        int re = 0;
        int temp = n;
        while (temp != 0) {
            int last_digit = temp % 10;
            re = re * 10 + last_digit;
            temp = temp / 10;
        }
        if (re == n) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

    // Method to find trailing zeros in factorial of a number
    public static void zeroInFactorial(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res += n / i;
        }
        System.out.println("The number of trailing zeros in " + n + "! is: " + res);
    }

    
    public static void gcd(int a, int b) {
        int resu = Math.min(a, b);
        while (resu > 0) {
            if (a % resu == 0 && b % resu == 0) {
                break;
            }
            resu--;
        }
        System.out.println("The GCD of " + a + " and " + b + " is: " + resu);
    }

    public static void main(String[] args) {
        // Execute Problem 1: Count Digits
        System.out.println("Executing Problem 1: Counting Digits");
        countDigit(123456);

        // Execute Problem 2: Check Palindrome
        System.out.println("\nExecuting Problem 2: Checking if a number is a Palindrome");
        palindrome(121);  // Example: palindrome number
        palindrome(123);  // Example: not a palindrome number

        // For demonstration: Zero in Factorial
        System.out.println("\nExecuting Problem 3: Finding trailing zeros in Factorial");
        zeroInFactorial(100);

        // For demonstration: GCD
        System.out.println("\nExecuting Problem 4: Calculating GCD");
        gcd(55, 110);
    }
}

