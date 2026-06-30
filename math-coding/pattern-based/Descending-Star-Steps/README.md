# 🔻 Descending Star Steps

> Print an inverted right-angled triangle — the first row is the widest, shrinking by one star each row.

---

## 🧩 Problem Statement

Given an integer `n`, print an **inverted right-angled triangle** of `*` symbols where:
- Row 1 has **n** stars
- Row 2 has **n-1** stars
- Last row has **1** star

The pattern shrinks from top to bottom, aligned to the left.

---

## 📥 Input Format

A single integer `n` — the number of rows.

## 📤 Output Format

A left-aligned inverted right-angled triangle of `*` symbols with `n` rows.

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
****
***
**
*
```

### Example 2
```
Input:  5
Output:
*****
****
***
**
*
```

---

## 🧠 Approach

- Outer loop: `i` from `n-1` down to `0`
- Inner loop: `j` from `0` to `i` (inclusive) → prints `i+1` stars, decreasing each row
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

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
