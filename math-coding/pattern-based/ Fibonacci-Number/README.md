# 🌀 Fibonacci Number

> Compute the nth Fibonacci number using an iterative approach — no recursion needed.

---

## 🧩 Problem Statement

The **Fibonacci sequence** is defined as:

```
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2)  for n > 1
```

Given `n`, calculate `F(n)`.

> Classic values: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 ...

---

## 📥 Input Format

A single integer `n`.

## 📤 Output Format

Print a single integer — the `n`th Fibonacci number.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `n` | 0 ≤ n ≤ 30 |

---

## 💡 Examples

### Example 1
```
Input:  2
Output: 1
```
> F(2) = F(1) + F(0) = 1 + 0 = **1**

### Example 2
```
Input:  3
Output: 2
```
> F(3) = F(2) + F(1) = 1 + 1 = **2**

### Example 3
```
Input:  4
Output: 3
```
> F(4) = F(3) + F(2) = 2 + 1 = **3**

### Example 4
```
Input:  0
Output: 0
```
> Base case: F(0) = **0**

---

## 🧠 Approach

**Iterative (Bottom-Up):**
1. Handle base cases: if `n == 0` return `0`, if `n == 1` return `1`
2. Initialize `first = 0`, `second = 1`
3. Loop from `i = 2` to `n`:
   - `next = first + second`
   - `first = second`
   - `second = next`
4. Return `second`

> **Why iterative over recursive?** Recursive Fibonacci has O(2ⁿ) time due to repeated sub-problems. The iterative approach runs in O(n) time.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first  = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first  = second;
            second = next;
        }

        return second;
    }
}
```