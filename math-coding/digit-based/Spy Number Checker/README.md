# 🕵️ Spy Number Checker

> A spy number's digit sum equals its digit product — a rare mathematical coincidence.

---

## 🧩 Problem Statement

A **Spy Number** is a number where the **sum of its digits** equals the **product of its digits**.

Given a number `N`, determine if it is a Spy Number.

> Examples:
> - **123** → Sum = 1+2+3 = 6 | Product = 1×2×3 = 6 → **Spy** ✅
> - **1** → Sum = 1 | Product = 1 → **Spy** ✅
> - **21** → Sum = 2+1 = 3 | Product = 2×1 = 2 → **Not Spy** ❌

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
Spy Number      ← if digit sum == digit product
Not a Spy Number ← otherwise
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
Input:  123
Output: Spy Number
```
> Sum = 1 + 2 + 3 = 6 | Product = 1 × 2 × 3 = 6 → Equal ✅

### Example 2
```
Input:  21
Output: Not a Spy Number
```
> Sum = 2 + 1 = 3 | Product = 2 × 1 = 2 → 3 ≠ 2 ❌

### Example 3
```
Input:  1
Output: Spy Number
```
> Sum = 1 | Product = 1 → Equal ✅

---

## 🧠 Approach

1. **Pass 1** — Extract each digit of `N` using `% 10` and `/ 10`, accumulate into `sum`
2. **Pass 2** — Reset `N`, extract each digit again, multiply into `product`
3. If `sum == product` → Spy Number, else → Not a Spy Number

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
        int original = num;

        // Pass 1: Sum of digits
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        // Pass 2: Product of digits
        num = original;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        if (sum == product) {
            System.out.print("Spy Number");
        } else {
            System.out.print("Not a Spy Number");
        }
    }
}
```