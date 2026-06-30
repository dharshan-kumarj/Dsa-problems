# 💎 Diamond Star Pattern

> A full diamond — a centred star pyramid on top joined with its upside-down mirror below.

---

## 🧩 Problem Statement

Given an integer `n`, print a **diamond pattern** of `*` symbols with `2n − 1` total rows:

- The **top half** (rows 1 to n) is an increasing centred pyramid: row `i` has `2i − 1` stars
- The **bottom half** (rows n+1 to 2n−1) is a decreasing inverted pyramid: mirroring the top

Each row is centre-aligned with appropriate leading spaces.

---

## 📥 Input Format

A single integer `n` — the number of rows in the **top half** (including the widest middle row).

## 📤 Output Format

A centred diamond of `2n − 1` rows.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `n` | 1 ≤ n ≤ 100 |

---

## 💡 Examples

### Example 1
```
Input:  3
Output:
  *
 ***
*****
 ***
  *
```

### Example 2
```
Input:  4
Output:
   *
  ***
 *****
*******
 *****
  ***
   *
```

---

## 🧠 Approach

**Top half** — loop `i` from `0` to `n−1`:
- Spaces = `n − i − 1`
- Stars = `2*i + 1`

**Bottom half** — loop `i` from `n−2` down to `0`:
- Spaces = `n − i − 1`
- Stars = `2*i + 1`

> The bottom half starts from `n−2` (one row before the middle) and mirrors the top.

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

        // Top half (including middle)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++) System.out.print("*");
            System.out.println();
        }

        // Bottom half (mirror, excluding middle)
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
```
