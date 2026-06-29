# 💡 Neon Number

> A number is Neon if the sum of digits of its square equals the number itself.

---

## 🧩 Problem Statement

Given a positive integer `N`, check whether it is a **Neon Number**.

A number `N` is called a **Neon Number** if:
```
sum of digits of (N²) == N
```

> Examples:
> - **9** → 9² = 81 → 8 + 1 = **9** ✅ Neon
> - **1** → 1² = 1 → digit sum = **1** ✅ Neon
> - **10** → 10² = 100 → 1 + 0 + 0 = 1 ≠ 10 ❌ Not Neon

---

## 📥 Input Format

A single positive integer `N`.

## 📤 Output Format

```
true   ← if N is a Neon number
false  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | 0 ≤ N ≤ 10⁴ |

---

## 💡 Examples

### Example 1
```
Input:  9
Output: true
```
> 9² = 81 → 8 + 1 = 9 == 9 ✅

### Example 2
```
Input:  10
Output: false
```
> 10² = 100 → 1 + 0 + 0 = 1 ≠ 10 ❌

### Example 3
```
Input:  1
Output: true
```
> 1² = 1 → digit sum = 1 == 1 ✅

---

## 🧠 Approach

1. Compute `square = N * N`
2. Extract each digit of `square` using `% 10` and `/ 10`, accumulate into `sum`
3. If `sum == N` → `true`, else → `false`

**Time Complexity:** O(log₁₀ N²) = O(log₁₀ N)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        System.out.print(sum == num ? "true" : "false");
    }
}
```