# 🔢 Number Pyramid

> A centred pyramid where row i contains numbers 1 through i, separated by spaces.

---

## 🧩 Problem Statement

Given an integer `n`, print a **number pyramid** with `n` rows where:
- Row 1 contains: `1`
- Row 2 contains: `1 2`
- Row `i` contains: `1 2 3 ... i`

Numbers on each row are separated by a space, and each row is right-shifted with leading spaces to form a pyramid shape.

---

## 📥 Input Format

A single integer `n` — the number of rows.

## 📤 Output Format

A centred number pyramid of `n` rows.

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
  1 2
 1 2 3
1 2 3 4
```

### Example 2
```
Input:  5
Output:
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
```

---

## 🧠 Approach

For each row `i` (0-indexed, 0 to n−1):
1. **Leading spaces:** print `n − i − 1` spaces
2. **Numbers:** print `1` through `i+1`, each followed by a space

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
            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Numbers 1 to i+1
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
```