# 🎓 Student Grade Evaluator

> Assign a letter grade to a student based on their marks out of 100.

---

## 🧩 Problem Statement

Given a student's marks out of 100, determine the grade using the following criteria:

| Marks Range | Grade |
|-------------|-------|
| 90 – 100 | Grade A |
| 80 – 89 | Grade B |
| 70 – 79 | Grade C |
| 60 – 69 | Grade D |
| 50 – 59 | Grade E |
| < 50 | Fail |

---

## 📥 Input Format

A single integer `marks` (out of 100).

## 📤 Output Format

Print one of: `Grade A`, `Grade B`, `Grade C`, `Grade D`, `Grade E`, or `Fail`.

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `marks` | 0 ≤ marks ≤ 100 |

---

## 💡 Examples

### Example 1
```
Input:  95
Output: Grade A
```
> 95 ≥ 90 → Grade A ✅

### Example 2
```
Input:  34
Output: Fail
```
> 34 < 50 → Fail ❌

### Example 3
```
Input:  72
Output: Grade C
```
> 70 ≤ 72 ≤ 79 → Grade C ✅

---

## 🧠 Approach

Use cascading `if-else if` conditions, checking from the highest grade downward:
- `marks >= 90` → A
- `marks >= 80` → B
- `marks >= 70` → C
- `marks >= 60` → D
- `marks >= 50` → E
- Else → Fail

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 80) {
            System.out.print("Grade B");
        } else if (marks >= 70) {
            System.out.print("Grade C");
        } else if (marks >= 60) {
            System.out.print("Grade D");
        } else if (marks >= 50) {
            System.out.print("Grade E");
        } else {
            System.out.print("Fail");
        }
    }
}
```