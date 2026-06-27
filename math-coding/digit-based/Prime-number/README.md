# 🔢 Prime Number Checker

> A number is prime if it has exactly two factors: 1 and itself.

---

## 🧩 Problem Statement

Given a number `N`, determine whether it is **prime** or **not prime**.

A **prime number** has exactly **two** distinct positive factors: `1` and `N` itself.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
Prime      ← if N is prime
Not Prime  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range         |
|----------|---------------|
| `N`      | 1 ≤ N ≤ 10^5  |

---

## 💡 Examples

### Example 1
```
Input:  10
Output: Not Prime
```
> Factors of 10: 1, 2, 5, 10 → 4 factors ❌

### Example 2
```
Input:  2
Output: Prime
```
> Factors of 2: 1, 2 → exactly 2 factors ✅

---

## 🧠 Approach

- Count divisors of `N` from `1` to `N`
- If count is exactly **2** → Prime
- Otherwise → Not Prime

> **Note:** 1 is not prime (only 1 factor). 2 is the smallest prime.

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
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print("Prime");
        } else {
            System.out.print("Not Prime");
        }
    }
}
```
