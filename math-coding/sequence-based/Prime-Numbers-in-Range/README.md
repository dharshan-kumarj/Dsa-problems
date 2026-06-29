# 🔢 Prime Numbers in Range

> Print all prime numbers within a given inclusive range — or report if none exist.

---

## 🧩 Problem Statement

Given two integers `start` and `end`, print all **prime numbers** in the range `[start, end]` (inclusive).

A **prime number** has exactly two factors: **1** and **itself**.  
Numbers less than 2 are never prime.

If no prime numbers exist in the range, print `No prime numbers`.

---

## 📥 Input Format

Two space-separated integers:
```
start end
```

## 📤 Output Format

Print all prime numbers in the range separated by a space.  
If none found, print:
```
No prime numbers
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `start` | 1 ≤ start < end |
| `end` | start < end ≤ 10,000 |

---

## 💡 Examples

### Example 1
```
Input:  1 10
Output: 2 3 5 7
```
> Primes in [1, 10]: 2, 3, 5, 7

### Example 2
```
Input:  14 16
Output: No prime numbers
```
> 14 = 2×7, 15 = 3×5, 16 = 2⁴ — none are prime ❌

### Example 3
```
Input:  1 2
Output: 2
```
> Only 2 is prime in [1, 2]

---

## 🧠 Approach

- For each number `i` from `start` to `end`:
  - Skip if `i < 2`
  - Check divisibility from `2` to `i-1`; if any divisor found → not prime
  - If prime → print it and set `found = true`
- After the loop, if no prime was printed → print `No prime numbers`

**Time Complexity:** O((end - start) × end) — trial division for each number  
**Space Complexity:** O(1)

> 💡 **Optimization tip:** Check divisibility only up to `√i` for O(√i) per number, or use the **Sieve of Eratosthenes** for O(n log log n) overall.

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end   = sc.nextInt();
        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (i < 2) continue;

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No prime numbers");
        }
    }
}
```