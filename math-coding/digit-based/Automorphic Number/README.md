# 🔁 Automorphic Number

> A number is automorphic if its square ends with the same digits as the number itself.

---

## 🧩 Problem Statement

Given an integer `N`, check whether it is an **Automorphic number** (also called a **Circular number**).

A number `N` is automorphic if the last `d` digits of `N²` are equal to `N`, where `d` is the number of digits in `N`.

> Classic examples:
> - **5** → 5² = **2_5_** ✅
> - **76** → 76² = **57_76_** ✅
> - **376** → 376² = **141_376_** ✅

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
Automorphic      ← if N is automorphic
Not Automorphic  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | 1 ≤ N ≤ 10⁶ |

---

## 💡 Examples

### Example 1
```
Input:  76
Output: Automorphic
```
> 76² = 5776 → last 2 digits = **76** == 76 ✅

### Example 2
```
Input:  13
Output: Not Automorphic
```
> 13² = 169 → last 2 digits = **69** ≠ 13 ❌

### Example 3
```
Input:  5
Output: Automorphic
```
> 5² = 25 → last 1 digit = **5** == 5 ✅

---

## 🧠 Approach

1. **Count digits** `d` of `N` — loop `num / 10` until zero
2. **Compute** `square = N * N`
3. **Build divisor** `value = 10^d` (multiply 10 exactly `d` times in a loop)
4. **Check** if `square % value == N` → Automorphic, else → Not Automorphic

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

        // Step 1: Count digits
        int d = 0;
        while (num != 0) {
            d++;
            num = num / 10;
        }

        // Step 2: Compute square and divisor 10^d
        num = original;
        int square = num * num;
        int divisor = 1;
        for (int i = 1; i <= d; i++) {
            divisor = divisor * 10;
        }

        // Step 3: Compare last d digits of square with original
        if (square % divisor == original)
            System.out.print("Automorphic");
        else
            System.out.print("Not Automorphic");
    }
}
```