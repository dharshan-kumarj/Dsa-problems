import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.next().charAt(0);

        if (num1 >= 'A' && num1 <= 'Z') {
            System.out.print("Uppercase Alphabet");
        } else if (num1 >= 'a' && num1 <= 'z') {
            System.out.print("Lowercase Alphabet");
        } else if (num1 >= '0' && num1 <= '9') {
            System.out.print("Digit");
        } else {
            System.out.print("Special Character");
        }
    }
}
