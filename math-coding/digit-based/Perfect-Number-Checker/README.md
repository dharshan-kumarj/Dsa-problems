# 💎 Perfect Number Checker

> A perfect number equals the sum of its proper divisors. Check if a given number is one.

---

## 🧩 Problem Statement

A **perfect number** is a positive integer that equals the sum of all its proper divisors (all positive divisors excluding itself).

Check whether a given number `N` is a perfect number.

> Classic examples: **6** (1+2+3=6), **28** (1+2+4+7+14=28)

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
Perfect Number        ← if N is perfect
Not a Perfect Number  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range            |
|----------|------------------|
| `N`      | 1 ≤ N ≤ 10^5     |

---

## 💡 Examples

### Example 1
```
Input:  6
Output: Perfect Number
```
> Divisors of 6 (excluding itself): 1, 2, 3 → Sum = **6** ✅

### Example 2
```
Input:  12
Output: Not a Perfect Number
```
> Divisors of 12 (excluding itself): 1, 2, 3, 4, 6 → Sum = 16 ≠ 12 ❌

---

## 🧠 Approach

- Iterate `i` from `1` to `N-1`
- If `N % i == 0`, add `i` to `sum`
- After loop: if `sum == N` → Perfect Number, else → Not a Perfect Number

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
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
```
