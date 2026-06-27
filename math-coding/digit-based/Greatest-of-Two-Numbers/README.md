# 🏆 Greatest of Two Numbers

> Compare two integers and determine which is greater — or if they're equal.

---

## 🧩 Problem Statement

You are given two integers `a` and `b`. Determine which number is greater and print it.  
If both numbers are equal, print a message stating they are equal.

---

## 📥 Input Format

Two lines, each containing one integer:
```
a
b
```

## 📤 Output Format

```
a is greater     ← if a > b
b is greater     ← if b > a
Both are equal   ← if a == b
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `a`, `b` | -1000 ≤ a, b ≤ 1000 |

---

## 💡 Examples

### Example 1
```
Input:
10
20
Output: 20 is greater
```

### Example 2
```
Input:
45
12
Output: 45 is greater
```

### Example 3
```
Input:
-5
-5
Output: Both are equal
```

---

## 🧠 Approach

- Read two integers `a` and `b`
- Use `if-else` to compare:
  - If `a == b` → `Both are equal`
  - If `a < b` → print `b is greater`
  - Else → print `a is greater`

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

        if (a == b) {
            System.out.print("Both are equal");
        } else if (a < b) {
            System.out.print(b + " is greater");
        } else {
            System.out.print(a + " is greater");
        }
    }
}
```