# 🧮 Math Coding — Problem Set

A structured collection of mathematical programming problems solved in **Java**, organized into two categories based on their core technique.

---

## 📁 Folder Structure

```
math-coding/
├── digit-based/          ← Problems that work on a number as a whole (loops, divisibility)
│   ├── Manual-Power-Calculator/
│   ├── Multiplication-Table-Generator/
│   ├── Perfect-Number-Checker/
│   ├── Prime-number/
│   ├── Sum-and-Factorial-Combo/
│   ├── count-of-factors/
│   └── factors-of-a-digit/
│
└── sequence-based/       ← Problems that extract and process individual digits
    ├── Digit Counter/
    ├── Maximum-and-Minimum-Digit/
    ├── Sum of Digits/
    └── Sum of Odd and Even Digits/
```

---

## 🔢 Digit-Based Problems

Problems that treat the number as a **whole unit** — using arithmetic, loops, or divisibility rules.

| # | Problem | Key Concept | Difficulty |
|---|---------|-------------|------------|
| 1 | [Manual Power Calculator](./digit-based/Manual-Power-Calculator/README.md) | Repeated Multiplication | 🟢 Easy |
| 2 | [Multiplication Table Generator](./digit-based/Multiplication-Table-Generator/README.md) | For Loop | 🟢 Easy |
| 3 | [Factors of a Number](./digit-based/factors-of-a-digit/README.md) | Divisibility | 🟢 Easy |
| 4 | [Count of Factors](./digit-based/count-of-factors/README.md) | Divisibility + Counting | 🟢 Easy |
| 5 | [Prime Number Checker](./digit-based/Prime-number/README.md) | Factor Count | 🟡 Medium |
| 6 | [Perfect Number Checker](./digit-based/Perfect-Number-Checker/README.md) | Proper Divisors Sum | 🟡 Medium |
| 7 | [Sum & Factorial Combo](./digit-based/Sum-and-Factorial-Combo/README.md) | Accumulation Loops | 🟢 Easy |

---

## 🔡 Sequence-Based Problems

Problems that **extract individual digits** by repeatedly using `% 10` and `/ 10`.

| # | Problem | Key Concept | Difficulty |
|---|---------|-------------|------------|
| 1 | [Digit Counter](./sequence-based/Digit%20Counter/README.md) | Digit Extraction | 🟢 Easy |
| 2 | [Sum of Digits](./sequence-based/Sum%20of%20Digits/README.md) | Digit Accumulation | 🟢 Easy |
| 3 | [Maximum and Minimum Digit](./sequence-based/Maximum-and-Minimum-Digit/README.md) | Digit Comparison | 🟢 Easy |
| 4 | [Sum of Odd and Even Digits](./sequence-based/Sum%20of%20Odd%20and%20Even%20Digits/README.md) | Digit Classification | 🟡 Medium |

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

---

## 📊 Problem Summary

| Total Problems | Digit-Based | Sequence-Based |
|:--------------:|:-----------:|:--------------:|
| **11**         | 7           | 4              |

---

> 💡 Every problem folder contains a `README.md` with the full problem statement, constraints, examples, approach explanation, and the complete Java solution.
