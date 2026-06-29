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
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        temp = num;
        if (temp % sum == 0) {
            System.out.print("Harshad Number");
        } else {
            System.out.print("Not Harshad Number");
        }

    }
}
