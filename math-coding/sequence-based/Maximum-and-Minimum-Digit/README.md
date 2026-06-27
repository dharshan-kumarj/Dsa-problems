# 📈📉 Maximum and Minimum Digit

> Find the largest and smallest digit in any integer.

---

## 🧩 Problem Statement

Given an integer `N`, find the **maximum** and **minimum** digit in the absolute value of `N`.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print two space-separated integers:
```
max_digit min_digit
```

---

## 🔒 Constraints

| Variable | Range              |
|----------|--------------------|
| `N`      | -10^9 ≤ N ≤ 10^9  |

---

## 💡 Examples

### Example 1
```
Input:  12345
Output: 5 1
```
> Digits: {1,2,3,4,5} → Max = **5**, Min = **1**

### Example 2
```
Input:  -907
Output: 9 0
```
> |−907| = 907 → Digits: {9,0,7} → Max = **9**, Min = **0**

### Example 3
```
Input:  4873
Output: 8 3
```

---

## 🧠 Approach

- Convert to absolute value if negative
- Special case: if `N == 0`, both max and min are 0
- Initialize `max = -1`, `min = 9`
- Extract digits one by one with `% 10` and update max/min
- Divide by 10 to strip last digit

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
        int max = -1, min = 9;
        if (num == 0) { min = 0; max = 0; }
        while (num != 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            if (digit < min) min = digit;
            num = num / 10;
        }
        System.out.print(max + " " + min);
    }
}
```