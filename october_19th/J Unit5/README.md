# JUnit 5 Testing Project

A Java project demonstrating unit testing with **JUnit 5 (Jupiter)**. It covers the core annotations, assertions, lifecycle methods, parameterized tests, and exception testing, with runnable examples.

## Tech Stack

- Java 17
- JUnit 5 (Jupiter) 5.10+
- Maven (or Gradle)
- IDE: IntelliJ IDEA / Eclipse / VS Code

## Project Structure

```
junit5-demo/
├── pom.xml
├── README.md
└── src/
    ├── main/java/com/example/
    │   └── Calculator.java
    └── test/java/com/example/
        └── CalculatorTest.java
```

## Getting Started

### Prerequisites

- JDK 17 or later
- Maven 3.8+

Check your setup:

```bash
java -version
mvn -version
```

### Clone the Repository

```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>
```

### Maven Dependency

Add this to your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.5</version>
        </plugin>
    </plugins>
</build>
```

## Running the Tests

```bash
# Run all tests
mvn test

# Run a single test class
mvn -Dtest=CalculatorTest test

# Run a single test method
mvn -Dtest=CalculatorTest#testAdd test
```

Reports are generated in `target/surefire-reports/`.

## Example Test

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adds two numbers")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
```

## Key Annotations

| Annotation | Purpose |
|---|---|
| `@Test` | Marks a method as a test |
| `@DisplayName` | Custom readable test name |
| `@BeforeEach` / `@AfterEach` | Runs before / after every test |
| `@BeforeAll` / `@AfterAll` | Runs once before / after all tests (static) |
| `@Disabled` | Skips a test |
| `@Nested` | Groups tests in an inner class |
| `@Tag` | Tags tests for filtering |
| `@ParameterizedTest` | Runs a test with multiple inputs |
| `@RepeatedTest` | Repeats a test N times |
| `@Timeout` | Fails a test that runs too long |

## Common Assertions

```java
assertEquals(expected, actual);
assertNotEquals(unexpected, actual);
assertTrue(condition);
assertFalse(condition);
assertNull(object);
assertNotNull(object);
assertArrayEquals(expectedArray, actualArray);
assertThrows(Exception.class, () -> methodCall());
assertAll("group",
    () -> assertEquals(1, 1),
    () -> assertTrue(true));
```

## Parameterized Test Example

```java
@ParameterizedTest
@ValueSource(ints = {2, 4, 6, 8})
void testEvenNumbers(int number) {
    assertTrue(number % 2 == 0);
}

@ParameterizedTest
@CsvSource({"1,2,3", "5,5,10", "10,-4,6"})
void testAddWithCsv(int a, int b, int expected) {
    assertEquals(expected, calculator.add(a, b));
}
```

## Test Lifecycle

```
@BeforeAll  ->  @BeforeEach  ->  @Test  ->  @AfterEach  ->  @AfterAll
```

## Best Practices

- Keep each test focused on one behavior.
- Use descriptive names or `@DisplayName`.
- Follow the Arrange, Act, Assert pattern.
- Keep tests independent; never rely on execution order.
- Test both normal cases and edge cases.

## Resources

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [JUnit 5 API Javadoc](https://junit.org/junit5/docs/current/api/)

## Author

**Pratik Godase**
GitHub: [@pratikgodase07](https://github.com/pratikgodase07)

## License

This project is licensed under the MIT License.