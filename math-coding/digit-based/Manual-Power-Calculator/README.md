# ⚡ Manual Power Calculator

> Calculate `base^exponent` using loop-based multiplication — no `Math.pow()` allowed.

---

## 🧩 Problem Statement

Given two positive integers `base` and `exponent`, compute the value of **base raised to the power exponent** using repeated multiplication via a loop.

---

## 📥 Input Format

A single line with two space-separated integers:
```
base exponent
```

## 📤 Output Format

Print a single integer — the result of `base^exponent`.

---

## 🔒 Constraints

| Variable   | Range         |
|------------|---------------|
| `base`     | 1 ≤ base ≤ 100 |
| `exponent` | 0 ≤ exponent ≤ 10 |

---

## 💡 Examples

### Example 1
```
Input:  2 3
Output: 8
```
> 2 × 2 × 2 = **8**

### Example 2
```
Input:  2 0
Output: 1
```
> Any number raised to the power 0 is **1**

---

## 🧠 Approach

- Initialize `result = 1`
- Loop from `i = 1` to `exponent`, multiplying `result` by `base` each iteration
- Print `result`

**Time Complexity:** O(exponent)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        int sol = 1;
        for (int i = 1; i <= expo; i++) {
            sol = sol * base;
        }
        System.out.print(sol);
    }
}
```
