# 🥇 Greatest of Three Numbers

> Find the greatest among three integers, with tie-detection for equal maximums.

---

## 🧩 Problem Statement

You are given three integers `a`, `b`, and `c`. Find and print the greatest number among them.  
If two or more numbers are equal and form the maximum, print a tie message.

---

## 📥 Input Format

Three lines, each containing one integer:
```
a
b
c
```

## 📤 Output Format

```
X is the greatest                     ← if one number is strictly greatest
There is a tie for the greatest number ← if the top value is shared
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `a`, `b`, `c` | -1000 ≤ a, b, c ≤ 1000 |

---

## 💡 Examples

### Example 1
```
Input:
10
20
30
Output: 30 is the greatest
```

### Example 2
```
Input:
100
100
50
Output: There is a tie for the greatest number
```

### Example 3
```
Input:
-5
-3
-3
Output: There is a tie for the greatest number
```

---

## 🧠 Approach

- Read three integers
- Check if `a` is strictly greater than both `b` and `c`
- Check if `b` is strictly greater than both `a` and `c`
- Check if any two are equal (tie at the top)
- Otherwise `c` is the greatest

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + " is the greatest");
        } else if (b > a && b > c) {
            System.out.print(b + " is the greatest");
        } else if (a == b || a == c || b == c) {
            System.out.print("There is a tie for the greatest number");
        } else {
            System.out.print(c + " is the greatest");
        }
    }
}
```