# 📅 Leap Year Checker

> Determine whether a given year is a leap year using the Gregorian calendar rules.

---

## 🧩 Problem Statement

In the Gregorian calendar, a **leap year** is determined by three rules:

1. The year is **evenly divisible by 4** → leap year, **unless**:
2. The year is **evenly divisible by 100** → NOT a leap year, **unless**:
3. The year is **also evenly divisible by 400** → it IS a leap year.

Classic examples: **2000** and **2400** are leap years. **1800**, **1900**, **2100** are NOT.

Given a year, determine whether it is a leap year.

---

## 📥 Input Format

A single integer `year`.

## 📤 Output Format

```
Leap Year      ← if year is a leap year
Not a Leap Year ← otherwise
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `year` | 1 ≤ year ≤ 10000 |

---

## 💡 Examples

### Example 1
```
Input:  2020
Output: Leap Year
```
> 2020 % 4 == 0 and 2020 % 100 ≠ 0 → Leap Year ✅

### Example 2
```
Input:  1900
Output: Not a Leap Year
```
> 1900 % 100 == 0 but 1900 % 400 ≠ 0 → Not a Leap Year ❌

### Example 3
```
Input:  2000
Output: Leap Year
```
> 2000 % 400 == 0 → Leap Year ✅

---

## 🧠 Approach

Check divisibility in this priority order:
1. If `year % 400 == 0` → Leap Year
2. Else if `year % 100 == 0` → Not a Leap Year
3. Else if `year % 4 == 0` → Leap Year
4. Else → Not a Leap Year

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.print("Leap Year");
        } else if (year % 100 == 0) {
            System.out.print("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a Leap Year");
        }
    }
}
```