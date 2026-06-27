import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        int sol = 1;
        for (int i = 1; i <= expo; i++) {
            sol = sol * base;
        }
        System.out.print(sol);
    }
}
