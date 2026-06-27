# 🔄 Palindrome Number

> Check if an integer reads the same forwards and backwards — negatives are never palindromes.

---

## 🧩 Problem Statement

Given an integer `N`, check whether it is a **palindrome number**.  
A palindrome number reads the same backward as forward.

> **Rule:** If `N` is negative, it is **never** a palindrome → print `false`.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

```
true   ← if N is a palindrome
false  ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `N` | -10^9 ≤ N ≤ 10^9 |

---

## 💡 Examples

### Example 1
```
Input:  121
Output: true
```
> Reverse of 121 = 121 → Palindrome ✅

### Example 2
```
Input:  -121
Output: false
```
> Negative number → Not a palindrome ❌

### Example 3
```
Input:  100
Output: false
```
> Reverse of 100 = 001 = 1 ≠ 100 → Not a palindrome ❌

---

## 🧠 Approach

1. If `N < 0` → print `false` immediately
2. Store `original = N`
3. Reverse `N` digit-by-digit using `% 10` and `/ 10`
4. If `original == reversed` → `true`, else `false`

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
        int original = num;

        if (num < 0) {
            System.out.print("false");
        } else {
            int digit = 0, rev = 0;
            while (num != 0) {
                digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            System.out.print(original == rev ? "true" : "false");
        }
    }
}
```