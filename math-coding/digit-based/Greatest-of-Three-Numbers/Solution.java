import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print(num1 + " is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2 + " is the greatest");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.print("There is a tie for the greatest number");
        } else {
            System.out.print(num3 + " is the greatest");
        }
    }
}