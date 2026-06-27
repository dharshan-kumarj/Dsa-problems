import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int fact = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {

                sum = sum + i;
            }
        }
        if (sum == num)
            System.out.print("Perfect Number");
        else
            System.out.print("Not a Perfect Number");
    }
}
