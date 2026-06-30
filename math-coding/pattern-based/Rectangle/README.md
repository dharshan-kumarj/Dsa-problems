# 📐 Rectangle Pattern

> Print a filled rectangle of stars with user-defined rows and columns.

---

## 🧩 Problem Statement

Given the number of `rows` and `columns`, print a **rectangle pattern** using `*` symbols.

Unlike the square, the width and height can differ — making this a natural generalisation of the square problem.

---

## 📥 Input Format

Two space-separated integers:
```
rows columns
```

## 📤 Output Format

Print a `rows × columns` rectangle of `*` symbols, one row per line.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `rows` | 1 ≤ rows ≤ 100 |
| `columns` | 1 ≤ columns ≤ 100 |

---

## 💡 Examples

### Example 1
```
Input:  3 5
Output:
*****
*****
*****
```

### Example 2
```
Input:  2 4
Output:
****
****
```

---

## 🧠 Approach

- Outer loop runs `rows` times → one row per iteration
- Inner loop runs `columns` times → prints that many stars per row
- `println()` after the inner loop moves to the next line

**Time Complexity:** O(rows × columns)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols  = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
