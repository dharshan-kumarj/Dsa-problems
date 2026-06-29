# 🌟 Harshad Number

> A number is Harshad if it is divisible by the sum of its own digits.

---

## 🧩 Problem Statement

A number is called a **Harshad number** (also known as a **Niven number**) if it is **divisible by the sum of its digits**.

> Example: **18** → digit sum = 1 + 8 = **9** → 18 ÷ 9 = 2 → **Harshad** ✅

Given an integer `N`, determine whether it is a Harshad number.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
Harshad Number      ← if N is divisible by its digit sum
Not Harshad Number  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | 1 ≤ N ≤ 10⁹ |

---

## 💡 Examples

### Example 1
```
Input:  18
Output: Harshad Number
```
> Digit sum = 1 + 8 = 9 → 18 % 9 == 0 ✅

### Example 2
```
Input:  23
Output: Not Harshad Number
```
> Digit sum = 2 + 3 = 5 → 23 % 5 = 3 ≠ 0 ❌

### Example 3
```
Input:  1729
Output: Harshad Number
```
> Digit sum = 1 + 7 + 2 + 9 = 19 → 1729 % 19 == 0 ✅

---

## 🧠 Approach

1. Extract each digit of `N` using `% 10` and `/ 10`, accumulate into `sum`
2. Check if `N % sum == 0`
3. Print result accordingly

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

        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (num % sum == 0) {
            System.out.print("Harshad Number");
        } else {
            System.out.print("Not Harshad Number");
        }
    }
}
```