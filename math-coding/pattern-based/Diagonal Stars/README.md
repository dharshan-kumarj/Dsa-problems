# ↘️ Diagonal Stars

> Print an n×n grid where only the main diagonal (top-left to bottom-right) has stars.

---

## 🧩 Problem Statement

Given an integer `n`, print an **n × n** grid where:
- A `*` appears only at positions where **row index == column index** (the main diagonal)
- All other positions are filled with **spaces**

---

## 📥 Input Format

A single integer `n` — the size of the square grid.

## 📤 Output Format

An `n × n` grid with `*` on the main diagonal and spaces elsewhere.

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
 *  
  * 
   *
```

### Example 2
```
Input:  5
Output:
*    
 *   
  *  
   * 
    *
```

---

## 🧠 Approach

- Outer loop: row index `i` from `0` to `n-1`
- Inner loop: column index `j` from `0` to `i` (grows each row to maintain alignment)
  - If `i == j` → print `*`
  - Else → print space `" "`
- `println()` after each row

> **Key insight:** The inner loop only goes up to `j <= i` (not `j < n`), so trailing spaces are naturally omitted per row.

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
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
```
