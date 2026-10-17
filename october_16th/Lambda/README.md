# ☕ Java Lambda Expressions

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 8 or later"/>
  <img src="https://img.shields.io/badge/Topic-Lambda%20Expressions-blue?style=for-the-badge" alt="Lambda Expressions"/>
  <img src="https://img.shields.io/badge/Training-PMIS-green?style=for-the-badge" alt="PMIS Training"/>
</p>

<p align="center">
  <b>Learn the syntax. Understand the concept. Write cleaner Java.</b>
</p>

---

## 📌 About This Module

This module is part of my **PMIS internship training and daily Java practice**. It focuses on Java Lambda Expressions, a feature introduced in Java 8 that makes it easier to implement functional interfaces with concise, readable code.

The goal is to understand how lambda expressions work, why they are useful, and how they simplify traditional Java implementations.

## 🧠 1. What Is a Lambda Expression?

A **Lambda Expression** is a concise way to provide an implementation of a functional interface without writing a separate named implementation class.

In simple words:

> A lambda expression lets us write the implementation of a single abstract method in a shorter way.

For example, imagine you want to print a message using a functional interface. Traditionally, you might create an anonymous class. With a lambda expression, you can express the same behavior in fewer lines.

### Before vs. After

**Traditional approach — Anonymous Class**

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello Java!");
    }
};

task.run();
```

**Modern approach — Lambda Expression**

```java
Runnable task = () -> {
    System.out.println("Hello Java!");
};

task.run();
```

**Output**

```text
Hello Java!
```

The lambda version is shorter because Java can infer the interface method being implemented from the target type, `Runnable`.

---

## 🔍 2. Understand Lambda Syntax

```java
(parameters) -> expression
```

Or, when multiple statements are needed:

```java
(parameters) -> {
    // Statements
};
```

### Visual breakdown

```text
       (a, b)       ->       a + b
          │          │          │
          ▼          ▼          ▼
      Parameters   Lambda     Method
                   operator   body
```

| Part | Meaning |
|---|---|
| `(a, b)` | Input parameters |
| `->` | Lambda operator |
| `a + b` | Expression or method body |

The lambda operator separates the input parameters from the implementation.

## 🧩 3. Functional Interfaces

A **functional interface** is an interface that has exactly one abstract method. It can also contain default and static methods.

Lambda expressions are commonly used to provide implementations for functional interfaces.

Example:

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

Using a lambda expression:

```java
public class LambdaExample {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;

        System.out.println(calculator.add(10, 20));
    }
}
```

**Output**

```text
30
```

### How it works

```text
Calculator Interface
        │
        ▼
  add(int a, int b)
        │
        ▼
(a, b) -> a + b
        │
        ▼
calculator.add(10, 20)
        │
        ▼
        30
```

Here, `(a, b) -> a + b` provides the implementation of the `add()` method.

## ⚙️ 4. Types of Lambda Expressions

### A. No parameters

```java
() -> System.out.println("Welcome to Java");
```

### B. One parameter

```java
name -> System.out.println(name);
```

Parentheses around a single parameter are optional when its type is inferred.

### C. Multiple parameters

```java
(a, b) -> a + b;
```

### D. Multiple statements

```java
(a, b) -> {
    int sum = a + b;
    return sum;
};
```

When a block body needs to return a value, use an explicit `return` statement.

## 💻 5. Practical Example: Runnable

The `Runnable` interface contains a single abstract method, `run()`. A lambda can provide its implementation.

```java
public class Lambda {
    public static void main(String[] args) {
        Runnable runnable = () ->
            System.out.println("Learning Lambda Expressions");

        runnable.run();
    }
}
```

**Output**

```text
Learning Lambda Expressions
```

This example demonstrates creating and executing a lambda implementation. Calling `run()` directly executes the method on the current thread; it does not start a new thread.

## 🆚 6. Anonymous Class vs. Lambda

| Feature | Anonymous Class | Lambda Expression |
|---|---|---|
| Syntax | More verbose | Concise |
| Best suited for | Anonymous class implementations | Functional interface implementations |
| `this` reference | Refers to the anonymous class instance | Refers to the enclosing context |
| Abstract methods | Can implement multiple interface methods | Implements one functional-interface abstract method |

**Important:** Lambda expressions do not replace every anonymous class. They are designed for functional-interface implementations.

## 🚀 7. Why Are Lambda Expressions Useful?

- **Less boilerplate:** Write implementations with fewer lines.
- **Improved readability:** Express simple behavior more clearly.
- **Functional programming:** Work naturally with Java's functional interfaces.
- **Collections and Streams:** Filter, transform, and process data concisely.
- **Callbacks:** Pass behavior to methods when required.

For example, a lambda can be used with a collection:

```java
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names =
            Arrays.asList("Amit", "Pratik", "Neha");

        names.forEach(name -> System.out.println(name));
    }
}
```

**Output**

```text
Amit
Pratik
Neha
```

The `forEach()` method accepts a `Consumer` functional interface, which the lambda implements.

## 📂 8. Folder Structure

```text
Lambda/
├── Exercise/
├── Lambda.java
├── Lambda1.java
└── README.md
```

- `Lambda.java` — Lambda expression practice.
- `Lambda1.java` — Additional lambda-related practice.
- `Exercise/` — Exercise directory for related practice tasks.
- `README.md` — Concept explanations, examples, and execution instructions.

*The exact contents of each Java file should be checked against the source code.*

## ▶️ 9. How to Run the Programs

**Prerequisite:** Install JDK 8 or later and configure `java` and `javac`.

Open the terminal in the `Lambda` folder.

Compile:

```bash
javac Lambda.java
javac Lambda1.java
```

Run:

```bash
java Lambda
java Lambda1
```

If your classes use package declarations, adjust the compilation and execution commands accordingly.

## 📚 10. Key Takeaways

- Lambda expressions were introduced in Java 8.
- The `->` operator separates parameters from the body.
- Lambdas are used with functional interfaces.
- A functional interface has exactly one abstract method.
- Lambda expressions reduce boilerplate but do not eliminate the need to understand interfaces.
- They are widely used with `Runnable`, `Consumer`, `Predicate`, `Function`, and the Stream API.

## 👨‍💻 Author

**Pratik Godase**

Computer Science and Engineering Graduate | Software Developer

- GitHub: [@pratikgodase07](https://github.com/pratikgodase07)
- Repository: [PMIS — Java Internship Practice](https://github.com/pratikgodase07/PMIS)

---

<p align="center">
  <b>Keep Learning • Keep Coding • Keep Improving</b>
</p>
