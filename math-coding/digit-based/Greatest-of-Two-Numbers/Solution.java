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

        if (num1 == num2) {
            System.out.print("Both are equal");
        } else if (num1 < num2) {
            System.out.print(num2 + " is greater");
        } else {
            System.out.print(num1 + " is greater");
        }
    }
}