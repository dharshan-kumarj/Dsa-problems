# 🔍 Count of Factors

> Count how many positive integers divide N without a remainder.

---

## 🧩 Problem Statement

Given a number `N`, count how many positive integers are **factors** (divisors) of `N`.

A factor `i` satisfies: `N % i == 0`

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print a single integer — the total count of factors of `N`.

---

## 🔒 Constraints

| Variable | Range        |
|----------|--------------|
| `N`      | 1 ≤ N ≤ 10^4 |

---

## 💡 Examples

### Example 1
```
Input:  12
Output: 6
```
> Factors of 12: **1, 2, 3, 4, 6, 12** → Count = 6

### Example 2
```
Input:  7
Output: 2
```
> Factors of 7: **1, 7** → Count = 2 (7 is prime!)

---

## 🧠 Approach

- Iterate `i` from `1` to `N`
- If `N % i == 0`, increment `count`
- Print `count`

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

> 💡 **Optimization tip:** You can reduce to O(√N) by iterating only up to `√N` and counting pairs of factors.

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
            if (num % i == 0)
                count++;
        }
        System.out.print(count);
    }
}
```
