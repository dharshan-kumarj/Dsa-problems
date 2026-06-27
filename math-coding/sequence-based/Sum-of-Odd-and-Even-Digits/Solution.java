import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0, even = 0, odd = 0;

        if (num % 2 == 0) {
            while (num != 0) {
                digit = num % 10;
                even = even + digit;
                num = num / 10;
            }
        } else {
            while (num != 0) {
                digit = num % 10;
                odd = odd + digit;
                num = num / 10;
            }
        }

        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);
    }
}
