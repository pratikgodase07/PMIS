# Maven Practice Workspace

A collection of Maven-based Java projects built while learning the Java full-stack ecosystem during my internship: **JDBC → Servlets/JSP → Hibernate → Spring Core → Spring AOP → Spring MVC → Spring Boot (REST + JPA)**.

Each folder is an independent Maven project that can be opened and run on its own. Together they show a progression from plain database connectivity to a layered Spring Boot REST API.

---

## Projects

| Project | Focus | Key Tech |
|---|---|---|
| [`maven_deccan_218`](./maven_deccan_218) | Maven basics and plain JDBC connection (`DBConnection`) | Java, Maven, MySQL Connector/J 8.0.33 |
| [`EmployeeServlet`](./EmployeeServlet) | Web form to add an employee: JSP front-end, Servlet, JDBC utility class | Servlets, JSP, JDBC, MySQL |
| [`Pratik_Hibernate`](./Pratik_Hibernate) | Hibernate project setup and dependency configuration | Hibernate Core 5.5.0, MySQL Connector/J 8.2.0 |
| [`onetoone_218`](./onetoone_218) | One-to-One entity mapping (`Employee` ↔ `Laptop`) with `hibernate.cfg.xml` | Hibernate ORM 6.4.10, Jakarta Persistence |
| [`spring_pratik`](./spring_pratik) | Spring Core: XML bean configuration and dependency injection (`Employee` → `Nation`) | Spring Core / Context 6.0.7 |
| [`aop.spring`](./aop.spring) | Aspect-Oriented Programming with a Java-config Spring app (`Account`, `Message`) | Spring 6.0.7, Spring AOP |
| [`spring_mvc`](./spring_mvc) | Spring MVC / web starter project skeleton | Spring Boot 3.5.3, Java 17 |
| [`pratik_springboot`](./pratik_springboot) | First Spring Boot REST controller (`GET /getAll`) | Spring Boot 3.5.0, Actuator, Java 17 |
| [`db_springboot`](./db_springboot) | Layered Spring Boot REST API with JPA: Controller → Service → DAO → Entity (`Student`) | Spring Boot 3.5.3, Spring Data JPA, MySQL, Java 17 |
| [`SAMSTRACK_API`](./SAMSTRACK_API) | Workspace entry for the Sams Track API project | Spring Boot |

---

## Concepts Covered

- **JDBC**: loading drivers, opening connections, executing SQL from Java
- **Servlets and JSP**: handling form submissions and persisting data
- **Hibernate**: `hibernate.cfg.xml`, entity annotations, `@OneToOne` relationships, ID generation
- **Spring Core**: XML-based bean definitions, property injection, bean references
- **Spring AOP**: cross-cutting concerns via aspects on Spring-managed components
- **Spring Boot**: auto-configuration, `@RestController`, `@RequestMapping` / `@PostMapping`, `@RequestBody`, Actuator
- **Spring Data JPA**: `spring.jpa.hibernate.ddl-auto`, SQL logging, layered architecture

---

## Prerequisites

- **JDK 17** or higher (Spring Boot 3.x projects require 17+)
- **Apache Maven 3.8+** (or use the bundled `mvnw` / `mvnw.cmd` wrapper in the Spring Boot projects)
- **MySQL 8** running on `localhost:3306`
- An IDE such as **Eclipse** (this folder is an Eclipse workspace) or IntelliJ IDEA

---

## Database Setup

The JDBC, Hibernate and JPA projects connect to a local MySQL database. Create it before running them:

```sql
CREATE DATABASE psg;
```

Then update the connection details in each project to match your local MySQL setup:

| Project | Where to configure |
|---|---|
| `maven_deccan_218`, `EmployeeServlet` | `DBConnection.java` / `DBUtil.java` |
| `onetoone_218` | `src/main/resources/hibernate.cfg.xml` |
| `db_springboot` | `src/main/resources/application.properties` |

> ⚠️ **Security note:** Use your own local credentials and avoid committing real passwords. For anything beyond local practice, move secrets into environment variables or an untracked config file.

---

## Running a Project

### Spring Boot projects (`pratik_springboot`, `db_springboot`, `spring_mvc`)

```bash
cd pratik_springboot
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

The app starts on `http://localhost:8080`.

**Example endpoints**

| Project | Method | URL | Description |
|---|---|---|---|
| `pratik_springboot` | `GET` | `/getAll` | Prints a message on the server console |
| `db_springboot` | `POST` | `/StudentAPI/addStudentData` | Saves a `Student` from the JSON request body |

### Plain Maven projects (JDBC, Hibernate, Spring Core, AOP)

```bash
cd onetoone_218
mvn clean compile
mvn exec:java -Dexec.mainClass="onetoone_218.operation.Operation_1"
```

Or simply import the project into Eclipse (**File → Import → Existing Maven Projects**) and run the main class directly.

### Servlet project (`EmployeeServlet`)

Import into Eclipse, deploy on Apache Tomcat, and open `add_Employee.jsp` in the browser.

---

## Project Structure

```
maven/
├── maven_deccan_218/       # JDBC basics
├── EmployeeServlet/        # Servlet + JSP + JDBC
├── Pratik_Hibernate/       # Hibernate setup
├── onetoone_218/           # Hibernate One-to-One mapping
├── spring_pratik/          # Spring Core (XML config)
├── aop.spring/             # Spring AOP
├── spring_mvc/             # Spring MVC starter
├── pratik_springboot/      # Spring Boot REST basics
├── db_springboot/          # Spring Boot + JPA + MySQL
└── SAMSTRACK_API/          # Sams Track API
```

---

## Notes

- These are **learning / practice projects**, so some are intentionally minimal or incomplete.
- Eclipse files (`.metadata`, `.project`, `.classpath`, `.settings`) and build output (`target/`) are included in the repo. Adding them to `.gitignore` is recommended to keep the repository clean.

---

## Author

**Pratik Godase**: React / Frontend Developer with a Java full-stack foundation
GitHub: [@pratikgodase07](https://github.com/pratikgodase07)