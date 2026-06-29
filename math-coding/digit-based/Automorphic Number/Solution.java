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
        int c = 0;
        while (num != 0) {
            c++;
            num = num / 10;
        }
        num = original;
        int square = num * num;
        int value = 1;
        for (int i = 1; i <= c; i++) {
            value = value * 10;
        }
        int check_value = square % value;
        if (check_value == original)
            System.out.print("Automorphic");
        else
            System.out.print("Not Automorphic");
    }
}
