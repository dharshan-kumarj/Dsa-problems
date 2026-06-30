import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sp = n - i - 1;
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            int star = 2 * i + 1;
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            int sp = n - i - 1;
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            int star = 2 * i + 1;
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
