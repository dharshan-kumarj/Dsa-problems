# 🪜 Staircase of Stars

> Print a growing right-angled triangle — row i has exactly i stars.

---

## 🧩 Problem Statement

Given an integer `n`, print a **right-angled triangle** of `*` symbols where:
- Row 1 has **1** star
- Row 2 has **2** stars
- Row `n` has **n** stars

The pattern grows from top to bottom, aligned to the left.

---

## 📥 Input Format

A single integer `n` — the number of rows.

## 📤 Output Format

A left-aligned right-angled triangle of `*` symbols with `n` rows.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `n` | 1 ≤ n ≤ 100 |

---

## 💡 Examples

### Example 1
```
Input:  4
Output:
*
**
***
****
```

### Example 2
```
Input:  2
Output:
*
**
```

---

## 🧠 Approach

- Outer loop: `i` from `0` to `n-1` (row index)
- Inner loop: `j` from `0` to `i` (inclusive) → prints `i+1` stars on row `i`
- `println()` after each row

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
