# 🔤 Character Classifier

> Classify a single ASCII character as Uppercase, Lowercase, Digit, or Special Character.

---

## 🧩 Problem Statement

You are given a single character. Determine and print whether the character is:
- An **uppercase alphabet** (A–Z)
- A **lowercase alphabet** (a–z)
- A **digit** (0–9)
- A **special character** (anything else)

---

## 📥 Input Format

A single printable ASCII character `ch`.

## 📤 Output Format

Print one of the following:
```
Uppercase Alphabet
Lowercase Alphabet
Digit
Special Character
```

---

## 🔒 Constraints

| Variable | Range |
|----------|-------|
| `ch` | Any single valid printable ASCII character |

---

## 💡 Examples

### Example 1
```
Input:  A
Output: Uppercase Alphabet
```
> 'A' falls in range A–Z → Uppercase Alphabet

### Example 2
```
Input:  5
Output: Digit
```
> '5' falls in range 0–9 → Digit

### Example 3
```
Input:  m
Output: Lowercase Alphabet
```

### Example 4
```
Input:  @
Output: Special Character
```

---

## 🧠 Approach

- Read the character and cast it to `int` (ASCII value)
- Check ranges:
  - `A`–`Z` (65–90) → Uppercase Alphabet
  - `a`–`z` (97–122) → Lowercase Alphabet
  - `0`–`9` (48–57) → Digit
  - Anything else → Special Character

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

## ✅ Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.print("Uppercase Alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.print("Lowercase Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.print("Digit");
        } else {
            System.out.print("Special Character");
        }
    }
}
```