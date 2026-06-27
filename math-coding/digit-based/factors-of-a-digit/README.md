# 📋 Factors of a Number

> Print all factors of N in ascending order.

---

## 🧩 Problem Statement

Given a number `N`, print **all factors** (divisors) of `N` in ascending order, separated by spaces.

A factor `i` satisfies: `N % i == 0`

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print all factors of `N` in ascending order, separated by a space.

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
Output: 1 2 3 4 6 12
```

### Example 2
```
Input:  7
Output: 1 7
```

---

## 🧠 Approach

- Iterate `i` from `1` to `N`
- If `N % i == 0`, print `i` followed by a space

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

> 💡 **Optimization tip:** Iterate up to `√N`, and for each factor `i`, also print `N/i` to achieve O(√N).

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
```
