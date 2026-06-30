# 🔁 Symmetric Number Pyramid

> A palindromic number pyramid — each row counts up to i then mirrors back down to 1.

---

## 🧩 Problem Statement

Given an integer `n`, print a **symmetric number pyramid** with `n` rows where:
- Row 1 contains: `1`
- Row 2 contains: `1 2 1`
- Row 3 contains: `1 2 3 2 1`
- Row `i` contains: `1 2 ... i ... 2 1`

Each row reads the same forwards and backwards (palindrome), and is centre-aligned with leading spaces.

---

## 📥 Input Format

A single integer `n` — the number of rows.

## 📤 Output Format

A centred symmetric number pyramid of `n` rows.

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
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
```

### Example 2
```
Input:  5
Output:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
```

---

## 🧠 Approach

For each row `i` (0-indexed, 0 to n−1):
1. **Leading spaces:** print `n − i − 1` double-spaces (`"  "`) for alignment
2. **Ascending part:** print `1` through `i+1`, each followed by a space
3. **Descending part:** print `i` down to `1`, each followed by a space
4. Move to next line

> **Key insight:** The leading indent uses two-character units (`"  "`) because each number occupies two characters (`digit + space`).

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
            // Leading double-spaces for centering
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Ascending: 1 to i+1
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            // Descending: i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```