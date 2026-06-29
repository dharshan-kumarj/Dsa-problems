import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        if (sum == num) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
