# 💪 Armstrong Number

> A number is Armstrong if the sum of its digits each raised to the power of the digit count equals the number itself.

---

## 🧩 Problem Statement

Given an integer `N`, check whether it is an **Armstrong number**.

An Armstrong number (also called a **narcissistic number**) of `n` digits satisfies:

```
d₁ⁿ + d₂ⁿ + ... + dₖⁿ = N
```

> Classic examples:
> - **153** → 1³ + 5³ + 3³ = 1 + 125 + 27 = **153** ✅
> - **9474** → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = **9474** ✅

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
true   ← if N is an Armstrong number
false  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | 0 ≤ N ≤ 10⁹ |

---

## 💡 Examples

### Example 1
```
Input:  153
Output: true
```
> 3 digits → 1³ + 5³ + 3³ = 153 ✅

### Example 2
```
Input:  123
Output: false
```
> 3 digits → 1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ≠ 123 ❌

### Example 3
```
Input:  9474
Output: true
```
> 4 digits → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 ✅

---

## 🧠 Approach

1. **Count digits** — loop `temp / 10` until zero, incrementing `count`
2. **Compute power sum** — for each digit, compute `digit^count` using a manual power loop, accumulate into `sum`
3. Compare `sum == original` → `true` or `false`

**Time Complexity:** O(log₁₀ N) for digit counting + O(log₁₀ N × digits) for power sum  
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
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Sum of digits^count
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }

        System.out.print(sum == original ? "true" : "false");
    }
}
```