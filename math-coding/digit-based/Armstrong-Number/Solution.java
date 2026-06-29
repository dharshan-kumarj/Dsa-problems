import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
