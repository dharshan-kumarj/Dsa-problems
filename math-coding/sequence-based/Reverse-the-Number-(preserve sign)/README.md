# ↩️ Reverse the Number (Preserve Sign)

> Reverse the digits of an integer while keeping its original sign intact.

---

## 🧩 Problem Statement

Given an integer `N`, print the **reverse of the number**.  
If `N` is negative, the reversed number must also be **negative**.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print the reversed integer, preserving the sign.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | -10^9 ≤ N ≤ 10^9 |

---

## 💡 Examples

### Example 1
```
Input:  1234
Output: 4321
```

### Example 2
```
Input:  -907
Output: -709
```
> Sign is preserved: `-907` reversed → `-709`

### Example 3
```
Input:  100
Output: 1
```
> Leading zeros are dropped: `001` → `1`

---

## 🧠 Approach

- Java's `% 10` on a negative number yields a negative remainder (e.g., `-907 % 10 = -7`)
- This naturally propagates the sign through the reversal loop
- Use the standard digit-extraction loop: `digit = num % 10`, `rev = rev * 10 + digit`, `num /= 10`
- The sign is preserved automatically without extra handling

**Time Complexity:** O(log₁₀ |N|)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit = 0, rev = 0;
        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.print(rev);
    }
}
```