# 📐 Triangle Type Detector

> Classify a triangle as Equilateral, Isosceles, or Scalene — after validating the triangle inequality.

---

## 🧩 Problem Statement

You are given the lengths of three sides of a triangle. First, verify that they form a **valid triangle** using the triangle inequality. If valid, classify the type:

- **Equilateral Triangle** — all three sides are equal
- **Isosceles Triangle** — exactly two sides are equal
- **Scalene Triangle** — all three sides are different

A valid triangle must satisfy **all three** of these conditions:
```
a + b > c
b + c > a
c + a > b
```
If the sides do NOT satisfy all conditions, print `Not a valid triangle`.

---

## 📥 Input Format

Three space-separated integers `a`, `b`, and `c` — the side lengths.

## 📤 Output Format

Print one of the following:
```
Equilateral Triangle
Isosceles Triangle
Scalene Triangle
Not a valid triangle
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `a`, `b`, `c` | 1 ≤ a, b, c ≤ 10^4 |

---

## 💡 Examples

### Example 1
```
Input:  5 5 5
Output: Equilateral Triangle
```
> All sides equal → Equilateral ✅

### Example 2
```
Input:  1 2 3
Output: Not a valid triangle
```
> 1 + 2 = 3, which is NOT > 3 → Invalid ❌

### Example 3
```
Input:  3 4 5
Output: Scalene Triangle
```
> All sides differ, triangle inequality holds → Scalene ✅

### Example 4
```
Input:  5 5 8
Output: Isosceles Triangle
```
> Two sides equal → Isosceles ✅

---

## 🧠 Approach

1. Validate triangle inequality: `a+b > c`, `b+c > a`, `c+a > b`
2. If invalid → print `Not a valid triangle`
3. If valid:
   - All three equal → `Equilateral Triangle`
   - Any two equal → `Isosceles Triangle`
   - All different → `Scalene Triangle`

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

        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.print("Equilateral Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.print("Isosceles Triangle");
            } else {
                System.out.print("Scalene Triangle");
            }
        } else {
            System.out.print("Not a valid triangle");
        }
    }
}
```