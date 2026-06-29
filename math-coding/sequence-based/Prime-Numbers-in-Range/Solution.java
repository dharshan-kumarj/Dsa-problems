import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean res = false;
        for (int i = n1; i <= n2; i++) {
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                res = true;
            }

        }
        if (!res) {
            System.out.print("No prime numbers");
        }

    }
}
