# ➕✖️ Sum and Factorial Combo

> Compute both the sum of first N natural numbers and the factorial of N in one go.

---

## 🧩 Problem Statement

Given a number `N`, print:
1. The **sum** of the first N natural numbers: `1 + 2 + ... + N`
2. The **factorial** of N: `1 × 2 × ... × N`

---

## 📥 Input Format

A single integer `N`.

## 📤 Output Format

Two lines:
```
Line 1: Sum of first N natural numbers
Line 2: Factorial of N
```

---

## 🔒 Constraints

| Variable | Range       |
|----------|-------------|
| `N`      | 1 ≤ N ≤ 20  |

> ⚠️ N is bounded at 20 because 20! = 2,432,902,008,176,640,000 which is near the `long` limit.

---

## 💡 Examples

### Example 1
```
Input:  5
Output:
15
120
```
> Sum: 1+2+3+4+5 = **15** | Factorial: 1×2×3×4×5 = **120**

### Example 2
```
Input:  1
Output:
1
1
```

---

## 🧠 Approach

- Loop once to accumulate `sum = sum + i`
- Loop again to accumulate `product = product * i`
- Print both results

**Time Complexity:** O(N)  
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
        int prdt = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        for (int i = 1; i <= num; i++) {
            prdt = prdt * i;
        }
        System.out.println(prdt);
    }
}
```