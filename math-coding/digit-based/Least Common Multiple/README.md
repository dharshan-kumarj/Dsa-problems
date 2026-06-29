# 🔢 Least Common Multiple (LCM)

> Find the smallest number divisible by both integers — using the GCD relationship.

---

## 🧩 Problem Statement

Given two positive integers `a` and `b`, compute their **LCM (Least Common Multiple)** — the smallest positive integer that is divisible by both `a` and `b`.

Use the well-known formula:
```
LCM(a, b) = (a × b) / GCD(a, b)
```

> **Constraint:** Find the GCD using a loop. Do **not** use recursion or any built-in method.

> Classic examples:
> - LCM(4, 6) = **12** → smallest number divisible by both 4 and 6
> - LCM(100, 25) = **100** → 100 is already divisible by 25

---

## 📥 Input Format

Two space-separated positive integers:
```
a b
```

## 📤 Output Format

Print a single integer — the LCM of `a` and `b`.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `a`, `b` | 1 ≤ a, b ≤ 10,000 |

---

## 💡 Examples

### Example 1
```
Input:  4 6
Output: 12
```
> GCD(4, 6) = 2 → LCM = (4 × 6) / 2 = **12**

### Example 2
```
Input:  100 25
Output: 100
```
> GCD(100, 25) = 25 → LCM = (100 × 25) / 25 = **100**

### Example 3
```
Input:  7 13
Output: 91
```
> GCD(7, 13) = 1 (both prime) → LCM = 7 × 13 = **91**

---

## 🧠 Approach

1. **Find GCD** — loop `i` from `1` to `a - 1`; if both `a % i == 0` and `b % i == 0`, update `gcd = i`
2. **Apply formula** — `lcm = (a * b) / gcd`
3. Print `lcm`

> 💡 **Optimization tip:** Use the Euclidean algorithm for GCD to achieve O(log(min(a,b))) per call.

**Time Complexity:** O(min(a, b)) for loop-based GCD  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;

        // Step 1: Find GCD using loop
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        // Step 2: Compute LCM using formula
        int lcm = (a * b) / gcd;
        System.out.print(lcm);
    }
}
```
