# ➕ Sum of Digits

> Add up every individual digit of a number, regardless of sign.

---

## 🧩 Problem Statement

Given an integer `N` (positive, negative, or zero), compute the **sum of all digits** in its absolute value.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print the digit sum of `|N|`.

---

## 🔒 Constraints

| Variable | Range              |
|----------|--------------------|
| `N`      | -10^9 ≤ N ≤ 10^9  |

---

## 💡 Examples

### Example 1
```
Input:  12345
Output: 15
```
> 1 + 2 + 3 + 4 + 5 = **15**

### Example 2
```
Input:  -407
Output: 11
```
> |−407| = 407 → 4 + 0 + 7 = **11**

---

## 🧠 Approach

- If `N < 0`, negate it: `N = N * -1`
- Extract digits with `digit = N % 10`, add to `sum`
- Shrink N with `N = N / 10`
- Repeat until `N == 0`

**Time Complexity:** O(log₁₀ N)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num < 0) num = num * -1;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.print(sum);
    }
}
```