# ⭐ Pattern-Based Problems

A collection of star pattern problems that build mastery of **nested loops** and **2D grid printing** in Java.

---

## 📁 Folder Structure

```
pattern-based/
├── Square/
├── Rectangle/
├── Staircase of Stars/
├── Descending-Star-Steps/
├── Diagonal Stars/
└── Star Box Frame/
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
    for (int j = 0; j < cols; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Growing Triangle (Staircase)
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {   // inner limit grows with i
        System.out.print("*");
    }
    System.out.println();
}
```

### Shrinking Triangle (Descending Steps)
```java
for (int i = n - 1; i >= 0; i--) {  // outer loop counts down
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### Border Condition (Hollow Frame)
```java
if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
    System.out.print("* ");
else
    System.out.print("  ");
```

---

## 📊 Problem Summary

| Total Problems | Pattern-Based |
|:--------------:|:-------------:|
| **6**          | 6             |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, examples, visual output, approach, and the complete Java solution.
