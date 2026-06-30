# ⭐ Pattern-Based Problems

A collection of star and number pattern problems that build mastery of **nested loops** and **2D grid printing** in Java.

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
└── Symmetric Number Pyramid/
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

### Growing Triangle (Staircase)
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) System.out.print("*");
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
// Top half (i = 0 to n-1)
// Bottom half (i = n-2 down to 0)
// Same space/star formula, different loop direction
```

### Symmetric Number Row
```java
for (int j = 1; j <= i + 1; j++) System.out.print(j + " "); // ascending
for (int j = i; j >= 1; j--)    System.out.print(j + " "); // descending
```

---

## 📊 Problem Summary

| Total Problems | Pattern-Based |
|:--------------:|:-------------:|
| **10**         | 10            |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, visual examples, approach, and the complete Java solution.
