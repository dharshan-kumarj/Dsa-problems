# 🔵🔴 Sum of Odd and Even Digits

> Separate a number's digits into odd and even groups and sum each group.

---

## 🧩 Problem Statement

Given an integer `N`, compute:
- The **sum of all odd digits** in `|N|`
- The **sum of all even digits** in `|N|`

A digit is **odd** if `digit % 2 != 0`, and **even** if `digit % 2 == 0`.

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Print two space-separated integers:
```
sum_of_odd_digits sum_of_even_digits
```

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
Output: 9 6
```
> Odd digits: {1, 3, 5} → 1+3+5 = **9**  
> Even digits: {2, 4} → 2+4 = **6**

### Example 2
```
Input:  -407
Output: 7 4
```
> |−407| = 407  
> Odd digits: {7} → **7** | Even digits: {4} → **4**  
> (0 is even but contributes 0 to the sum)

---

## 🧠 Approach

- Convert to absolute value if negative
- Extract each digit with `% 10`
- If `digit % 2 != 0` → add to `odd`, else → add to `even`
- Shrink with `/ 10` until zero

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
        int odd = 0, even = 0;
        if (num < 0) num = -num;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0)
                odd = odd + digit;
            else
                even = even + digit;
            num = num / 10;
        }
        System.out.println(odd + " " + even);
    }
}
```
