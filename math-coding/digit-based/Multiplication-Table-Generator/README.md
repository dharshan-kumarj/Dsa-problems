# 📊 Multiplication Table Generator

> Print the complete multiplication table for a given number up to 10 multiples.

---

## 🧩 Problem Statement

Given a number `N`, print its multiplication table from `1` to `10`.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print 10 lines, each in the format:
```
N * i = result
```
where `i` ranges from `1` to `10`.

---

## 🔒 Constraints

| Variable | Range          |
|----------|----------------|
| `N`      | 1 ≤ N ≤ 1000   |

---

## 💡 Examples

### Example 1
```
Input:  5
Output:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
```

### Example 2
```
Input:  1
Output:
1 * 1 = 1
1 * 2 = 2
...
1 * 10 = 10
```

---

## 🧠 Approach

- Loop `i` from `1` to `10`
- Print `N * i = N*i` on each line

**Time Complexity:** O(1) — always exactly 10 iterations  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
```
