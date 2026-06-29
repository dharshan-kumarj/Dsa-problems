import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int org = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        num = org;
        int prdt = 1;
        while (num != 0) {
            int digit = num % 10;
            prdt = prdt * digit;
            num = num / 10;
        }
        if (sum == prdt) {
            System.out.print("Spy Number");
        } else {
            System.out.print("Not a Spy Number");
        }

    }
}