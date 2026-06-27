import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 % 400 == 0) {
            System.out.print("Leap Year");
        } else if (num1 % 100 == 0) {
            System.out.print("Not a Leap Year");
        } else if (num1 % 4 == 0) {
            System.out.print("Leap Year");
        } else {

            System.out.print("Not a Leap Year");

        }
    }
}