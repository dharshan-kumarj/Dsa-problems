# 🧮 Math Coding — Problem Set

A structured collection of mathematical programming problems solved in **Java**, organized into three categories based on their core technique.

---

## 📁 Folder Structure

```
math-coding/
├── digit-based/          ← Problems that work on a number as a whole (loops, conditions, divisibility)
│   ├── Manual-Power-Calculator/
│   ├── Multiplication-Table-Generator/
│   ├── factors-of-a-digit/
│   ├── count-of-factors/
│   ├── Prime-number/
│   ├── Perfect-Number-Checker/
│   ├── Sum-and-Factorial-Combo/
│   ├── Greatest-of-Two-Numbers/
│   ├── Greatest-of-Three-Numbers/
│   ├── Leap-Year-Checker/
│   ├── Student-Grade-Evaluator/
│   ├── Triangle-Type-Detector/
│   ├── Character Classifier/
│   ├── Armstrong-Number/
│   ├── Harshad-number/
│   ├── Neon-number/
│   ├── Automorphic Number/
│   ├── Spy Number Checker/
│   ├── Greatest Common Divisor/
│   └── Least Common Multiple/
│
├── sequence-based/       ← Problems that extract and process individual digits
│   ├── Digit Counter/
│   ├── Sum of Digits/
│   ├── Maximum-and-Minimum-Digit/
│   ├── Sum-of-Odd-and-Even-Digits/
│   ├── Palindrome Number/
│   ├── Reverse-the-Number-(preserve sign)/
│   ├── Sum-of-First-and-Last-Digit/
│   └── Prime-Numbers-in-Range/
│
└── pattern-based/        ← Problems that print 2D patterns and compute sequences
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
    ├──  Fibonacci-Number/
    └── Swastika-Pattern/
```

---

## 🔢 Digit-Based Problems

Problems that treat the number as a **whole unit** — using arithmetic, loops, divisibility rules, or conditional logic.

| # | Problem | Key Concept | Difficulty |
|---|---------|-------------|------------|
| 1 | [Manual Power Calculator](./digit-based/Manual-Power-Calculator/README.md) | Repeated Multiplication | 🟢 Easy |
| 2 | [Multiplication Table Generator](./digit-based/Multiplication-Table-Generator/README.md) | For Loop | 🟢 Easy |
| 3 | [Factors of a Number](./digit-based/factors-of-a-digit/README.md) | Divisibility | 🟢 Easy |
| 4 | [Count of Factors](./digit-based/count-of-factors/README.md) | Divisibility + Counting | 🟢 Easy |
| 5 | [Prime Number Checker](./digit-based/Prime-number/README.md) | Factor Count | 🟡 Medium |
| 6 | [Perfect Number Checker](./digit-based/Perfect-Number-Checker/README.md) | Proper Divisors Sum | 🟡 Medium |
| 7 | [Sum & Factorial Combo](./digit-based/Sum-and-Factorial-Combo/README.md) | Accumulation Loops | 🟢 Easy |
| 8 | [Greatest of Two Numbers](./digit-based/Greatest-of-Two-Numbers/README.md) | Conditional Logic | 🟢 Easy |
| 9 | [Greatest of Three Numbers](./digit-based/Greatest-of-Three-Numbers/README.md) | Conditional Logic + Tie Detection | 🟢 Easy |
| 10 | [Leap Year Checker](./digit-based/Leap-Year-Checker/README.md) | Nested Conditions | 🟢 Easy |
| 11 | [Student Grade Evaluator](./digit-based/Student-Grade-Evaluator/README.md) | Range-based Grading | 🟢 Easy |
| 12 | [Triangle Type Detector](./digit-based/Triangle-Type-Detector/README.md) | Triangle Inequality | 🟡 Medium |
| 13 | [Character Classifier](./digit-based/Character%20Classifier/README.md) | ASCII Range Checks | 🟢 Easy |
| 14 | [Armstrong Number](./digit-based/Armstrong-Number/README.md) | Digit Power Sum | 🟡 Medium |
| 15 | [Harshad Number](./digit-based/Harshad-number/README.md) | Digit Sum Divisibility | 🟢 Easy |
| 16 | [Neon Number](./digit-based/Neon-number/README.md) | Square Digit Sum | 🟢 Easy |
| 17 | [Automorphic Number](./digit-based/Automorphic%20Number/README.md) | Square Suffix Match | 🟡 Medium |
| 18 | [Spy Number Checker](./digit-based/Spy%20Number%20Checker/README.md) | Digit Sum vs Product | 🟢 Easy |
| 19 | [Greatest Common Divisor](./digit-based/Greatest%20Common%20Divisor/README.md) | Loop-based GCD | 🟡 Medium |
| 20 | [Least Common Multiple](./digit-based/Least%20Common%20Multiple/README.md) | LCM = (a×b)/GCD | 🟡 Medium |

---

## 🔡 Sequence-Based Problems

Problems that **extract individual digits** by repeatedly using `% 10` and `/ 10`.

| # | Problem | Key Concept | Difficulty |
|---|---------|-------------|------------|
| 1 | [Digit Counter](./sequence-based/Digit%20Counter/README.md) | Digit Extraction | 🟢 Easy |
| 2 | [Sum of Digits](./sequence-based/Sum%20of%20Digits/README.md) | Digit Accumulation | 🟢 Easy |
| 3 | [Maximum and Minimum Digit](./sequence-based/Maximum-and-Minimum-Digit/README.md) | Digit Comparison | 🟢 Easy |
| 4 | [Sum of Odd and Even Digits](./sequence-based/Sum-of-Odd-and-Even-Digits/README.md) | Digit Classification | 🟡 Medium |
| 5 | [Palindrome Number](./sequence-based/Palindrome%20Number/README.md) | Digit Reversal + Comparison | 🟡 Medium |
| 6 | [Reverse the Number (Preserve Sign)](./sequence-based/Reverse-the-Number-(preserve%20sign)/README.md) | Digit Reversal | 🟢 Easy |
| 7 | [Sum of First and Last Digit](./sequence-based/Sum-of-First-and-Last-Digit/README.md) | Digit Extraction | 🟢 Easy |
| 8 | [Prime Numbers in Range](./sequence-based/Prime-Numbers-in-Range/README.md) | Trial Division + Range Loop | 🟡 Medium |

---

## ⭐ Pattern-Based Problems

Problems that print **2D star/number patterns** and compute **mathematical sequences** using loops.

| # | Problem | Pattern Type | Difficulty |
|---|---------|--------------|------------|
| 1 | [Square](./pattern-based/Square/README.md) | Filled n×n square | 🟢 Easy |
| 2 | [Rectangle](./pattern-based/Rectangle/README.md) | Filled rows×cols rectangle | 🟢 Easy |
| 3 | [Staircase of Stars](./pattern-based/Staircase%20of%20Stars/README.md) | Growing right triangle (↑) | 🟢 Easy |
| 4 | [Descending Star Steps](./pattern-based/Descending-Star-Steps/README.md) | Shrinking inverted triangle (↓) | 🟢 Easy |
| 5 | [Diagonal Stars](./pattern-based/Diagonal%20Stars/README.md) | Main diagonal only | 🟡 Medium |
| 6 | [Star Box Frame](./pattern-based/Star%20Box%20Frame/README.md) | Hollow bordered square | 🟡 Medium |
| 7 | [Star Pyramid](./pattern-based/Star%20Pyramid/README.md) | Centred star pyramid | 🟡 Medium |
| 8 | [Diamond Star Pattern](./pattern-based/Diamond%20Star%20Pattern/README.md) | Full diamond (pyramid + inverted) | 🟡 Medium |
| 9 | [Number Pyramid](./pattern-based/Number%20Pyramid/README.md) | Centred number pyramid (1..i per row) | 🟡 Medium |
| 10 | [Symmetric Number Pyramid](./pattern-based/Symmetric%20Number%20Pyramid/README.md) | Palindromic number pyramid (1..i..1) | 🔴 Hard |
| 11 | [Fibonacci Number](./pattern-based/%20Fibonacci-Number/README.md) | Iterative F(n) sequence | 🟢 Easy |
| 12 | [Swastika Pattern](./pattern-based/Swastika-Pattern/README.md) | Cross + 4-arm border conditions | 🔴 Hard |

---

## 🛠️ Tech Stack

- **Language:** Java
- **I/O:** `java.util.Scanner`
- **No external libraries** — pure logic only

---

## 🧠 Core Techniques Used

### Digit Extraction Pattern
```java
while (num != 0) {
    int digit = num % 10;
    num = num / 10;
}
```

### GCD → LCM Pattern
```java
int gcd = 1;
for (int i = 1; i < a; i++) {
    if (a % i == 0 && b % i == 0) gcd = i;
}
int lcm = (a * b) / gcd;
```

### Centred Pyramid (Space + Stars)
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
    for (int k = 0; k < 2 * i + 1; k++) System.out.print("*");
    System.out.println();
}
```

### Iterative Fibonacci
```java
int first = 0, second = 1;
for (int i = 2; i <= n; i++) {
    int next = first + second;
    first = second; second = next;
}
```

---

## 📊 Problem Summary

| Total Problems | Digit-Based | Sequence-Based | Pattern-Based |
|:--------------:|:-----------:|:--------------:|:-------------:|
| **40**         | 20          | 8              | 12            |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, examples, approach explanation, and the complete Java solution.
