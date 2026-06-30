# ⭐ Star Pyramid

> Print a centred star pyramid — row i has (2i−1) stars, padded with leading spaces to form a triangle.

---

## 🧩 Problem Statement

Given an integer `n`, print a **centred star pyramid** with `n` rows.

- Row 1 has **1** star
- Row 2 has **3** stars
- Row `i` has **2i − 1** stars
- Each row is right-padded with leading spaces so the pyramid is centred.

---

## 📥 Input Format

A single integer `n` — the number of rows.

## 📤 Output Format

A centred star pyramid of `n` rows.

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
  ***
 *****
*******
```

### Example 2
```
Input:  5
Output:
    *
   ***
  *****
 *******
*********
```

---

## 🧠 Approach

For each row `i` (0-indexed, 0 to n−1):
1. **Leading spaces:** print `n − i − 1` spaces
2. **Stars:** print `2*i + 1` stars
3. Move to next line

**Key formula:**
- Spaces on row `i` = `n − i − 1`
- Stars on row `i` = `2 * i + 1`

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
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```