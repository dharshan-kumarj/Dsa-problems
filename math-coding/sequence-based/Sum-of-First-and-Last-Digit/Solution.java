import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        if (num == 0)
            num = 0;
        if (num < 0) {
            num = -num;
        }

        int last_digit = num % 10;

        while (num >= 10) {
            num = num / 10;
        }
        // System.out.print("number"+num);
        sum = last_digit + num;
        System.out.print(sum);
    }
}