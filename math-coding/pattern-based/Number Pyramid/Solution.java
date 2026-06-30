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
            int num = i + 1;
            for (int k = 1; k <= num; k++) {

                System.out.print(k + " ");

            }
            System.out.println();
        }
    }
}
