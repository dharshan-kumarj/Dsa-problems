# ⭐ Pattern-Based Problems

A collection of star, number, and mathematical sequence pattern problems that build mastery of **nested loops**, **2D grid printing**, and **iterative logic** in Java.

---

## 📁 Folder Structure

```
pattern-based/
├── Square/
├── Rectangle/
├── Staircase of Stars/
├── Descending-Star-Steps/
├── Diagonal Stars/
├── Star Box Frame/
├── Star Pyramid/
├── Diamond Star Pattern/
├── Number Pyramid/
├── Symmetric Number Pyramid/
│
│   ── Math Sequences ──
├──  Fibonacci-Number/
└── Swastika-Pattern/
```

---

## ⭐ Pattern Problems

| # | Problem | Pattern Type | Difficulty |
|---|---------|--------------|------------|
| 1 | [Square](./Square/README.md) | Filled n×n square | 🟢 Easy |
| 2 | [Rectangle](./Rectangle/README.md) | Filled rows×cols rectangle | 🟢 Easy |
| 3 | [Staircase of Stars](./Staircase%20of%20Stars/README.md) | Growing right triangle (↑) | 🟢 Easy |
| 4 | [Descending Star Steps](./Descending-Star-Steps/README.md) | Shrinking inverted triangle (↓) | 🟢 Easy |
| 5 | [Diagonal Stars](./Diagonal%20Stars/README.md) | Main diagonal only | 🟡 Medium |
| 6 | [Star Box Frame](./Star%20Box%20Frame/README.md) | Hollow bordered square | 🟡 Medium |
| 7 | [Star Pyramid](./Star%20Pyramid/README.md) | Centred star pyramid | 🟡 Medium |
| 8 | [Diamond Star Pattern](./Diamond%20Star%20Pattern/README.md) | Full diamond (pyramid + inverted) | 🟡 Medium |
| 9 | [Number Pyramid](./Number%20Pyramid/README.md) | Centred number pyramid (1..i per row) | 🟡 Medium |
| 10 | [Symmetric Number Pyramid](./Symmetric%20Number%20Pyramid/README.md) | Palindromic number pyramid (1..i..1) | 🔴 Hard |
| 11 | [Fibonacci Number](./%20Fibonacci-Number/README.md) | Iterative Fibonacci F(n) | 🟢 Easy |
| 12 | [Swastika Pattern](./Swastika-Pattern/README.md) | Cross + 4-arm border conditions | 🔴 Hard |

---

## 🛠️ Tech Stack

- **Language:** Java
- **I/O:** `java.util.Scanner`
- **No external libraries** — pure logic only

---

## 🧠 Core Techniques Used

### Filled Pattern (Square / Rectangle)
```java
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) System.out.print("*");
    System.out.println();
}
```

### Centred Pyramid (Space + Stars)
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i - 1; j++) System.out.print(" ");  // spaces
    for (int k = 0; k < 2 * i + 1; k++) System.out.print("*"); // stars
    System.out.println();
}
```

### Diamond (Top + Bottom halves)
```java
// Top half (i = 0 to n-1), Bottom half (i = n-2 down to 0)
// Same space/star formula, different loop direction
```

### Iterative Fibonacci
```java
int first = 0, second = 1;
for (int i = 2; i <= n; i++) {
    int next = first + second;
    first = second;
    second = next;
}
```

### Complex Border Condition (Swastika)
```java
if (i == n/2 || j == n/2)                          // cross
    print("* ");
else if (i < n/2 && j == 0 || j == n-1 && i > n/2) // left/right arms
    print("* ");
else if (j > n/2 && i == 0 || i == n-1 && j < n/2) // top/bottom arms
    print("* ");
else
    print("  ");
```

---

## 📊 Problem Summary

| Total Problems | Pattern-Based |
|:--------------:|:-------------:|
| **12**         | 12            |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, visual examples, approach, and the complete Java solution.
