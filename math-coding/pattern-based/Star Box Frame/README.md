# 🖼️ Star Box Frame

> Print an n×n hollow square — stars on the outer border, spaces inside.

---

## 🧩 Problem Statement

Given an integer `n`, print an **n × n** pattern where:
- `*` appears on the **border** — first row, last row, first column, last column
- All **inner** positions are filled with spaces

Each cell (star or space) is followed by a single space for neat alignment.

---

## 📥 Input Format

A single integer `n` — the size of the square frame.

## 📤 Output Format

An `n × n` grid with stars on the border and spaces inside.  
Each symbol (`*` or ` `) is followed by a space.

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
* * * 
*   * 
* * * 
```

### Example 2
```
Input:  6
Output:
* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 
```

---

## 🧠 Approach

- Outer loop: row `i` from `0` to `n-1`
- Inner loop: column `j` from `0` to `n-1`
  - If `i == 0` **or** `i == n-1` **or** `j == 0` **or** `j == n-1` → print `"* "`
  - Else → print `"  "` (two spaces for alignment)
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
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
```