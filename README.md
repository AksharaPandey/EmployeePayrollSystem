
# Object-Oriented Employee Payroll System

A lightweight, console-based Employee Payroll System built in Java using core Object-Oriented Programming (OOP) principles. This project demonstrates clean architecture, abstraction, polymorphism, and comprehensive unit testing using JUnit 5.

## 🚀 Features

- **Polymorphic Salary Calculation:** Handles different salary computation models for Full-Time (Fixed Monthly) and Part-Time (Hourly Rate × Hours Worked) employees seamlessly under a unified `employee` interface.
- **Dynamic Payroll Management:** Ability to dynamically add and remove employees by unique IDs using Java `ArrayList`.
- **Automated Unit Testing:** Full test suite powered by JUnit 5 to ensure reliable execution of salary math and collection handling.

---

## 🏗️ Core OOP Concepts Demonstrated

* **Abstraction:** The core `employee` class is marked as `abstract`, ensuring it cannot be instantiated directly and forces subclasses to implement their specific `calculateSalary()` logic.
* **Inheritance:** `FulltimeEmployee` and `PartTimeEmployee` extend the base `employee` class, reusing common attributes like `name` and `id`.
* **Polymorphic Behavior:** The `PayrollSystem` interacts entirely with the abstract `employee` type, allowing it to trigger the correct subclass calculation dynamically at runtime.
* **Encapsulation:** Employee fields (`name`, `id`, `monthlySalary`, etc.) are kept `private` and accessed safely via public constructors and getter methods.

---

## 📁 Project Structure

```text
src/
└── main/
    └── java/
        └── Main.java          # Contains core domain models (employee, PayrollSystem) and Main execution
└── test/
    └── java/
        └── EmployeeTest.java  # JUnit 5 suite testing calculations and system constraints

```

---

## 💻 Code Architecture Overview

### Class Overview

1. **`employee` (Abstract Class):** Defines fundamental employee state and enforces the implementation of `calculateSalary()`. Overrides `toString()` for clean console logging.
2. **`FulltimeEmployee`:** Extends `employee`. Computes salary based on a fixed monthly amount.
3. **`PartTimeEmployee`:** Extends `employee`. Computes salary dynamically based on hourly rate and total hours worked.
4. **`PayrollSystem`:** Manages an internal `ArrayList<employee>`. Exposes public APIs to add, remove, and print details of all managed employees.

---

## ⚙️ Getting Started

### Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher (JDK 17+ recommended).
* **IDE:** IntelliJ IDEA (Community or Ultimate edition).

### Execution

1. Open the project root folder inside IntelliJ IDEA.
2. Navigate to `src/main/java/Main.java`.
3. Click the green execution arrow next to `public class Main` or press `Shift + F10` to run the interactive console output.

---

## 🧪 Testing with JUnit 5

The project includes an automated suite in `EmployeeTest.java` verifying the core operational math of the system.

### Test Coverage includes:

* **`testFullTimeEmployeeSalary`**: Assures fixed-income parameters match expected values.
* **`testPartTimeEmployeeSalary`**: Validates the $Hours \times Rate$ multiplication pipeline.
* **`testAddAndRemoveEmployee`**: Assures structural operations perform reliably, protecting against application crashes during invalid lookups (e.g., trying to delete a non-existent employee ID).

### Running Tests

* Navigate to `src/test/java/EmployeeTest.java`.
* Press `Ctrl + Shift + F10` (Windows/Linux) or `Ctrl + Shift + R` (Mac) to trigger the runner window and view the green verification suite status.


---

### Customizing it further
Feel free to add a **"Future Enhancements"** section if you plan to plug in a database later or implement advanced tax deduction logic. Let me know if you want to expand any particular section!
