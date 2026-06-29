# 🔗 Greatest Common Divisor (GCD)

> Find the largest number that divides both integers evenly — using a loop, not recursion.

---

## 🧩 Problem Statement

Given two positive integers `a` and `b`, find their **GCD (Greatest Common Divisor)** — the largest positive integer that divides both `a` and `b` without a remainder.

> **Constraint:** Use a loop-based approach. Do **not** use recursion or any built-in method like `Math.gcd()`.

> Classic examples:
> - GCD(12, 18) = **6** (factors of 12: 1,2,3,4,6,12 | factors of 18: 1,2,3,6,9,18 → largest common = 6)
> - GCD(17, 13) = **1** (both are prime → only common factor is 1)

---

## 📥 Input Format

Two space-separated positive integers:
```
a b
```

## 📤 Output Format

Print a single integer — the GCD of `a` and `b`.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `a`, `b` | 1 ≤ a, b ≤ 10,000 |

---

## 💡 Examples

### Example 1
```
Input:  12 18
Output: 6
```
> Common factors of 12 and 18: {1, 2, 3, 6} → GCD = **6**

### Example 2
```
Input:  17 13
Output: 1
```
> Both are primes → only common factor is **1**

### Example 3
```
Input:  100 25
Output: 25
```
> 25 divides both 100 and 25 → GCD = **25**

---

## 🧠 Approach

- Iterate `i` from `1` to `a - 1`
- Whenever `a % i == 0` **and** `b % i == 0`, update `gcd = i`
- After the loop, `gcd` holds the largest common divisor

> 💡 **Optimization tip:** Use the **Euclidean algorithm** — `GCD(a, b) = GCD(b, a % b)` — for O(log(min(a, b))) time instead of O(a).

**Time Complexity:** O(min(a, b))  
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

        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
}
```