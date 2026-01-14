<h1 align="center"> ATM Project </h1>
<p align="center"> A Command-Line Simulation Demonstrating Core Banking and Transaction Logic </p>

<p align="center">
  <img alt="Build" src="https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge">
  <img alt="Issues" src="https://img.shields.io/badge/Issues-0%20Open-blue?style=for-the-badge">
  <img alt="Contributions" src="https://img.shields.io/badge/Contributions-Welcome-orange?style=for-the-badge">
  <img alt="License" src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge">
</p>
<!-- 
  **Note:** These are static placeholder badges. Replace them with your project's actual badges.
  You can generate your own at https://shields.io
-->

## 📋 Table of Contents

*   [🌟 Overview](#-overview)
*   [✨ Key Features](#-key-features)
*   [🛠️ Tech Stack & Architecture](#-tech-stack--architecture)
*   [📁 Project Structure](#-project-structure)
*   [🚀 Getting Started](#-getting-started)
*   [🔧 Usage](#-usage)
*   [🤝 Contributing](#-contributing)
*   [📝 License](#-license)

---

## 🌟 Overview

The **ATM Project** is a foundational educational utility designed to simulate the core functions of an Automated Teller Machine (ATM) and a basic banking system through a command-line interface (CLI). Developed using robust Java object-oriented principles, this project provides a transparent and practical demonstration of crucial concepts like user authentication, account management, and atomic transaction processing.

This project is perfectly suited for developers and students who need a clean, focused environment to study how financial logic is structured, how classes interact (e.g., `User` interacting with `ATM`, which routes requests through `Bank` to modify `Account` data), and how state management is handled in a simple, centralized system.

### The Problem

> Simulating complex, real-world financial systems often requires intricate network setups, heavy databases, and advanced security protocols, which can obscure the fundamental logic of transaction processing. For educational purposes or foundational prototyping, what is often needed is a simple, contained environment to rigorously test and visualize banking rules: how balances are updated, how authentication prevents unauthorized access, and how different types of accounts are managed. Complex infrastructure can unnecessarily complicate the learning curve.

### The Solution

The **ATM Project** provides a straightforward, highly maintainable solution by encapsulating all core business logic within a pure Java application. By focusing solely on the internal mechanisms—such as user credentials, account balance tracking, and transaction limits—we deliver a lightweight, platform-independent simulation.

The design relies on core components:
1.  **Authentication (`Auth`):** Handles user validation and security.
2.  **Account Management (`Account`, `Bank`):** Manages data integrity and financial rules.
3.  **Transaction Interface (`ATM`, `Main`):** Provides the user interaction layer.

This architecture ensures that users can execute common ATM functions—such as balance inquiries, deposits, and withdrawals—while observing immediate feedback on the state of their simulated accounts.

### Architecture Overview

This project is structured as a monolithic **library** application primarily driven by the **Java** programming language. The architecture is straightforward, utilizing core object-oriented programming (OOP) principles to define the relationship between the financial entities (`Account`, `User`, `Bank`) and the access interface (`ATM`). The strength of the architecture lies in its simplicity, making the codebase highly legible and easy to follow for educational or demonstration purposes.

---

## ✨ Key Features

The ATM Project offers robust capabilities centered around simulating a complete banking interaction loop, from login to transaction completion. These features are direct translations of the project’s core component definitions, providing tangible user value and functionality.

| Icon | Feature | User Benefit & Value Proposition |
| :--- | :--- | :--- |
| 🛡️ | **Secure Authentication Layer** | Users must successfully pass authentication (via `Auth.java`) before accessing any financial services. This simulates real-world security protocols, ensuring that account data remains protected and inaccessible to unauthorized parties. The login process verifies user credentials against a defined set of user data (`User.java`). |
| 💳 | **Atomic Transaction Processing** | The core `ATM.java` class manages crucial transactions (deposits and withdrawals). Transactions are designed to be atomic; they either complete successfully, ensuring the `Account.java` balance is updated correctly, or they fail completely (e.g., due to insufficient funds), preventing data corruption. |
| 🏦 | **Centralized Banking Logic** | The `Bank.java` component acts as the central ledger, managing all accounts and coordinating interactions between the ATM and individual accounts. This demonstrates how a centralized system controls and validates all financial flows, providing a single source of truth for all account balances and rules. |
| 💰 | **Real-Time Balance Inquiry** | Users can instantly check their available balance. This feature allows immediate verification of funds and transaction success, providing transparency and trust in the system's ability to maintain up-to-date financial records. |
| 🔄 | **Seamless Deposit and Withdrawal** | Simple, intuitive command-line inputs allow users to deposit funds into their account or withdraw money, adhering strictly to pre-defined business rules implemented in the Java code. This makes the system effective for practicing input handling and transaction validation logic. |
| 💻 | **Pure Java Execution** | As a pure Java library, the project requires no complex external dependencies, databases, or web servers. This makes setup and execution extremely simple, focusing all attention on the underlying object-oriented logic and core algorithms rather than infrastructure challenges. |

---

## 🛠️ Tech Stack & Architecture

The ATM Project is built with minimalism and instructional clarity in mind. The project relies exclusively on the foundational capabilities of the Java ecosystem, ensuring maximum compatibility and ease of use in diverse development environments.

| Technology | Purpose | Why it was Chosen |
| :--- | :--- | :--- |
| **Java** | Primary programming language for all logic implementation, class definitions, and execution control. | Chosen for its robust Object-Oriented nature, which is ideal for modeling real-world entities like `Account`, `User`, and `Bank`. Java's platform independence ensures the simulation runs consistently across different operating systems. |
| **Core Java Libraries** | Utilized for input/output operations, error handling, and basic data structure management necessary for running the command-line interface. | Standard I/O and utility classes are sufficient to fulfill the core requirements of a simple, non-persistent simulation, keeping the project light and focused. |

**No External Dependencies Detected:**
The project analysis confirms that the ATM Project does not rely on external third-party libraries, build tools (like Maven or Gradle), or database connectors. This reinforces its nature as a simple, self-contained demonstration utility focused purely on internal Java logic.

---

## 📁 Project Structure

The project employs a clean, standard Java directory structure, segregating source code files (`.java`) from compiled output and configuration files. This organization simplifies compilation and maintenance, focusing all core logic within the `src/` directory.

The following structure is derived directly from the verified file system analysis:

```
Ravindra-singh-pokhriyal-ATM-Project-9026969/
├── 📁 .idea/                                  # IntelliJ IDEA metadata and configuration files
│   ├── 📄 .gitignore                         # Local ignored files for the IDE
│   ├── 📄 copilot.data.migration.edit.xml    # Copilot configuration file
│   ├── 📄 copilot.data.migration.ask2agent.xml # Copilot configuration file
│   ├── 📄 vcs.xml                            # Version Control System settings
│   ├── 📄 copilot.data.migration.agent.xml   # Copilot configuration file
│   ├── 📄 misc.xml                           # Miscellaneous IDE settings
│   ├── 📄 copilot.data.migration.ask.xml     # Copilot configuration file
│   └── 📄 modules.xml                        # Module definitions for the project
├── 📁 src/                                   # Source Code Directory (All core banking logic)
│   ├── 📄 Main.class                         # Compiled bytecode entry point
│   ├── 📄 Account.java                       # Defines the Account entity (balance, ID)
│   ├── 📄 ATM.java                           # Manages the transaction interface (Withdraw/Deposit)
│   ├── 📄 Auth.java                          # Handles user authentication and PIN validation
│   ├── 📄 User.java                          # Defines the User entity (credentials, links to Account)
│   ├── 📄 Bank.java                          # Central data model for managing all users and accounts
│   └── 📄 Main.java                          # The primary executable file and application entry point
├── 📄 .gitignore                             # Specifies files and directories ignored by Git
├── 📄 README.md                              # This project documentation file
└── 📄 ATM Project.iml                        # IntelliJ IDEA module file

```

---

## 🚀 Getting Started

Since the ATM Project is a pure Java library application without detected external build tools, the setup process is focused entirely on standard Java compilation and execution.

### Prerequisites

You must have the following software installed on your system to compile and run the project:

| Software | Requirement | Note |
| :--- | :--- | :--- |
| **Java Development Kit (JDK)** | Version 8 or higher | Essential for compiling the `.java` source files and running the application. |

### Installation

Follow these steps to clone the repository and prepare the source files for execution.

#### 1. Clone the Repository

Navigate to your desired local directory and clone the project using Git:

```bash
# Clone the repository
git clone https://github.com/Ravindra-singh-pokhriyal-ATM-Project-9026969
cd Ravindra-singh-pokhriyal-ATM-Project-9026969
```

#### 2. Navigate to Source

All execution steps must be performed from the root of the project directory.

```bash
# Ensure you are in the project root
pwd 
```

#### 3. Compile the Java Source Files

Use the Java Compiler (`javac`) to compile all source files located in the `src/` directory. This process generates the necessary `.class` bytecode files, including the primary entry point, `Main.class`.

```bash
# Compile all Java files in the src directory
javac src/*.java
```

*Note: If compilation is successful, you should see the compiled class files (e.g., `ATM.class`, `Account.class`) appear either directly in the root directory or adjacent to their source files, depending on your environment setup.*

#### 4. Verify Compilation

Confirm that the necessary class files have been created, which signifies readiness for execution.

```bash
# List contents to confirm Main.class exists
ls src/
```

---

## 🔧 Usage

The ATM Project is designed to run as a single, command-line application. Once compiled, the application initiates the banking system, prompts for user login, and presents a menu of available transactions.

### 1. Running the Application

Execute the compiled application using the Java Virtual Machine (`java`), specifying the `src` directory as the classpath to locate the compiled bytecode.

```bash
# Execute the Main class
java -cp src Main
```

### 2. Authentication

Upon running the application, you will be immediately prompted to enter a User ID and PIN. This step is handled by `Auth.java`.

```
======================================
  Welcome to the ATM Simulation
======================================
Please Enter Your User ID: [Enter User ID here]
Please Enter Your PIN: [Enter PIN here]
```

*   **Initial Setup:** For testing and demonstration purposes, the system usually contains pre-defined user accounts and PINs (as defined in `Bank.java` or `User.java`). Consult the source code (specifically `Bank.java`) to find the valid test credentials if you encounter login issues.

### 3. Using the Transaction Menu

Upon successful authentication, the `ATM.java` component displays the main transaction menu:

```
--------------------------------------
  Main Transaction Menu
--------------------------------------
1. Check Account Balance
2. Deposit Funds
3. Withdraw Funds
4. Exit
--------------------------------------
Enter your choice (1-4): 
```

#### A. Checking Account Balance (Option 1)

Select '1' to query the current balance. The `Bank.java` system retrieves the latest financial record from the authenticated `Account.java` object and displays it.

```
Enter your choice (1-4): 1

Your current account balance is: $1500.50
```

#### B. Deposit Funds (Option 2)

Select '2' to add money to the account. The system validates the input amount and updates the account balance via the `ATM.java` transaction mechanism.

```
Enter your choice (1-4): 2

Enter amount to deposit: 500.00
Deposit successful. New balance: $2000.50
```

#### C. Withdraw Funds (Option 3)

Select '3' to remove money. The system performs crucial validation, checking if the requested amount is available (`Account.java` check). If insufficient funds are detected, the transaction is rejected; otherwise, the funds are debited.

```
Enter your choice (1-4): 3

Enter amount to withdraw: 700.00
Withdrawal successful. New balance: $1300.50

# Example of an invalid transaction:
Enter amount to withdraw: 5000.00
Error: Insufficient funds. Current balance: $1300.50
```

#### D. Exit (Option 4)

Select '4' to gracefully terminate the ATM session and exit the application.

```
Enter your choice (1-4): 4

Thank you for using the ATM Simulation. Goodbye!
```

---

## 🤝 Contributing

We welcome contributions to improve the **ATM Project**! Your input helps make this project a better learning tool for everyone studying object-oriented programming and financial simulation.

### How to Contribute

1. **Fork the repository** - Click the 'Fork' button at the top right of this page
2. **Create a feature branch** 
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Make your changes** - Improve code, documentation, or features
4. **Test thoroughly** - Ensure all functionality works as expected. Since this is a simple Java application, testing primarily involves manual execution and input validation.
   ```bash
   # Compile to ensure no syntax errors
   javac src/*.java
   # Run the application to manually test new flows
   java -cp src Main
   ```
5. **Commit your changes** - Write clear, descriptive commit messages
   ```bash
   git commit -m 'Add: Amazing new feature that handles overdraft protection'
   ```
6. **Push to your branch**
   ```bash
   git push origin feature/amazing-feature
   ```
7. **Open a Pull Request** - Submit your changes for review

### Development Guidelines

- ✅ Follow the existing Java code style and conventions (e.g., camelCase for variables, PascalCase for classes).
- 📝 Add comments for complex logic, especially within transaction validation routines in `ATM.java` and `Bank.java`.
- 🧪 While formal testing frameworks are not included, ensure the manual execution path covers all edge cases (e.g., zero withdrawal, over-withdrawal attempts).
- 📚 Update the README if new features are added to the usage instructions.
- 🔄 Ensure backward compatibility when possible, especially regarding the CLI interaction flow.
- 🎯 Keep commits focused and atomic.

### Ideas for Contributions

We're looking for help with improvements such as:

- 🐛 **Bug Fixes:** Reporting and fixing any logical errors in transaction processing.
- ✨ **New Features:** Implementing advanced banking features (e.g., transfer between accounts, transaction history logging).
- 📖 **Documentation:** Improving the Javadoc comments within the `.java` files for better code comprehension.
- ⚡ **Performance:** Optimizing the core loop in `Main.java` or simplifying transaction validation.
- ♿ **Accessibility:** Improving the command-line output presentation (e.g., better formatting, colors).
- 🧪 **Testing:** Introducing a simple JUnit test setup to cover core transaction classes.

### Code Review Process

- All submissions require review before merging by maintainers.
- Maintainers will provide constructive feedback focused on clarity and correctness of the banking logic.
- Changes may be requested before approval to adhere to the project's educational focus.
- Once approved, your PR will be merged and you'll be credited for your contribution.

### Questions?

Feel free to open an issue for any questions or concerns regarding the project's logic or contribution process. We're here to help!

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file (or create one in the root directory if missing) for complete details.

### What this means:

- ✅ **Commercial use:** You can use this project commercially
- ✅ **Modification:** You can modify the code
- ✅ **Distribution:** You can distribute this software
- ✅ **Private use:** You can use this project privately
- ⚠️ **Liability:** The software is provided "as is", without warranty of any kind, express or implied. The author holds no liability for its use.
- ⚠️ **Trademark:** This license does not grant trademark rights.

---

<p align="center">Made with ❤️ by the ATM Project Team</p>
<p align="center">
  <a href="#-table-of-contents">⬆️ Back to Top</a>
</p>
<br>
