# 🔢 Digit Counter

> Count the number of digits in any integer, including negatives and zero.

---

## 🧩 Problem Statement

Given an integer `N` (which may be negative), count the number of digits in its **absolute value**.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print the count of digits in `|N|`.

---

## 🔒 Constraints

| Variable | Range               |
|----------|---------------------|
| `N`      | -10^9 ≤ N ≤ 10^9   |

---

## 💡 Examples

### Example 1
```
Input:  -12345
Output: 5
```
> |−12345| = 12345 → 5 digits

### Example 2
```
Input:  756
Output: 3
```

### Example 3
```
Input:  0
Output: 1
```
> Zero is a special case — it has **1** digit

---

## 🧠 Approach

- Handle special case: if `N == 0`, count = 1
- Convert to absolute value: `if N < 0 → N = -N`
- Repeatedly divide by 10 and increment counter until `N == 0`

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
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            if (num < 0) num = -num;
            while (num != 0) {
                count++;
                num = num / 10;
            }
        }
        System.out.print(count);
    }
}
```