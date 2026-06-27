# 🧮 Math Coding — Problem Set

A structured collection of mathematical programming problems solved in **Java**, organized into two categories based on their core technique.

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
│   └── Character Classifier/
│
└── sequence-based/       ← Problems that extract and process individual digits
    ├── Digit Counter/
    ├── Sum of Digits/
    ├── Maximum-and-Minimum-Digit/
    ├── Sum-of-Odd-and-Even-Digits/
    ├── Palindrome Number/
    ├── Reverse-the-Number-(preserve sign)/
    └── Sum-of-First-and-Last-Digit/
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
    int digit = num % 10;   // extract last digit
    // ... process digit
    num = num / 10;         // remove last digit
}
```

### Divisibility / Factor Pattern
```java
for (int i = 1; i <= num; i++) {
    if (num % i == 0) {
        // i is a factor of num
    }
}
```

### Power Without Math.pow()
```java
int result = 1;
for (int i = 1; i <= expo; i++) {
    result = result * base;
}
```

### Conditional Classification Pattern
```java
if (condition1) {
    // handle case 1
} else if (condition2) {
    // handle case 2
} else {
    // default case
}
```

---

## 📊 Problem Summary

| Total Problems | Digit-Based | Sequence-Based |
|:--------------:|:-----------:|:--------------:|
| **20**         | 13          | 7              |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, examples, approach explanation, and the complete Java solution.
