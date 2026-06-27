# 🔢 Sum of First and Last Digit

> Extract the first and last digits of a number and return their sum.

---

## 🧩 Problem Statement

Given an integer `N`, find the **sum of the first (most significant) and last (least significant) digit** in the absolute value of `N`.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print a single integer — the sum of the first and last digit.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | -10^9 ≤ N ≤ 10^9 |

---

## 💡 Examples

### Example 1
```
Input:  12345
Output: 6
```
> First digit = 1, Last digit = 5 → 1 + 5 = **6**

### Example 2
```
Input:  -907
Output: 16
```
> |−907| = 907 → First digit = 9, Last digit = 7 → 9 + 7 = **16**

### Example 3
```
Input:  7
Output: 14
```
> Single digit number: First = Last = 7 → 7 + 7 = **14**

---

## 🧠 Approach

1. Convert to absolute value if `N < 0`
2. **Last digit:** `last = num % 10`
3. **First digit:** Keep dividing by 10 until `num < 10` — the remaining value is the first digit
4. Print `first + last`

**Time Complexity:** O(log₁₀ N)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) num = -num;

        int lastDigit = num % 10;

        while (num >= 10) {
            num = num / 10;
        }
        int firstDigit = num;

        System.out.print(firstDigit + lastDigit);
    }
}
```