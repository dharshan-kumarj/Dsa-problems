# ⬛ Square Pattern

> Print a filled square of stars — the simplest 2D nested loop pattern.

---

## 🧩 Problem Statement

Given a single integer `n`, print a **square pattern** of `*` symbols with `n` rows and `n` columns.

This problem is the foundation for understanding nested loops and 2D printing.

---

## 📥 Input Format

A single integer `n` — both the number of rows and columns.

## 📤 Output Format

Print an `n × n` grid of `*` symbols, one row per line, with no trailing spaces.

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
****
****
****
```

### Example 2
```
Input:  2
Output:
**
**
```

---

## 🧠 Approach

- Outer loop runs `n` times → each iteration = one row
- Inner loop runs `n` times → prints `n` stars on the current row
- `println()` after the inner loop moves to the next line

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
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```