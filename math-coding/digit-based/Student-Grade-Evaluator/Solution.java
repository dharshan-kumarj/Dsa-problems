import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 >= 90) {
            System.out.print("Grade A");
        } else if (num1 >= 80) {
            System.out.print("Grade B");
        } else if (num1 >= 70) {
            System.out.print("Grade C");
        } else if (num1 >= 60) {
            System.out.print("Grade D");
        } else if (num1 >= 50) {
            System.out.print("Grade E");
        } else {
            System.out.print("Fail");

        }
    }
}