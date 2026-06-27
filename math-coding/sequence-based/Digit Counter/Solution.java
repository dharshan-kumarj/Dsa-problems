import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {

                count++;
                num = num / 10;
            }
        }

        System.out.print(count);
    }
}
