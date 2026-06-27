import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int max = -1;
        int min = 9;

        if (num == 0) {
            min = 0;
            max = 0;
        }

        while (num != 0) {
            int digit = num % 10;

            if (digit > max)
                max = digit;

            if (digit < min)
                min = digit;

            num = num / 10;
        }

        System.out.print(max + " " + min);

    }
}
