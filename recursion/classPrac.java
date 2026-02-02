import java.util.*;

public class classPrac {

    public static void printN(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printN(n - 1);

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static int power(int base, int pow) {
        if (pow == 1) {
            return base * 1;
        }

        int res = power(base, pow - 1);
        return base * res;
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void subSeq(String s, String ans, int i) {
        if (s.length() == i) {
            System.out.println(ans);
            return;
        }

        subSeq(s, ans + s.charAt(i), i + 1);
        subSeq(s, ans, i + 1);

    }

    public static int countZeroes(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            count++;
        }
        return countZeroes(n / 10, count);
    }

    public static int sumOfDigit(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        sum += n % 10;
        return sumOfDigit(n / 10, sum);
    }

    public static void reverse(int n, int rev) {
        if (n == 0) {
            System.out.println(rev);
            return;
        }

        reverse(n / 10, rev * 10 + (n % 10));
    }

    public static int product(int n, int prod) {
        if (n == 0) {
            return prod;
        }

        return product(n / 10, prod * (n % 10));
    }

    static int moveCount = 0;

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            moveCount++;
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        
        solveHanoi(n - 1, source, destination, auxiliary);

        
        moveCount++;
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        // System.out.println(countZeroes(1020, 0));
        // System.out.println(sumOfDigit(123, 0));

        // reverse(123, 0);

        System.out.println(product(224, 1));
    }
}
