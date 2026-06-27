import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        if (num < 0) {
            num = num * -1;
        }
        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;

        }
        System.out.print(sum);

    }
}
