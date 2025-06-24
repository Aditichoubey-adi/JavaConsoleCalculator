# Java Console Calculator

A simple, interactive console-based calculator application built using Java. This project demonstrates basic Java programming concepts, including console input/output, methods, control flow (loops and switch statements), and basic error handling. It was developed as a learning exercise to understand Java syntax and logic flow.

## Features

This calculator currently supports the following operations:

* **Basic Arithmetic Operations:**
    * Addition (`+`)
    * Subtraction (`-`)
    * Multiplication (`*`)
    * Division (`/`) - Includes handling for division by zero.
* **Extended Operations:**
    * Modulo (Remainder `%`) - Calculates the remainder of a division.
    * Power (`x^y`) - Calculates 'x' raised to the power of 'y'.
* **Robust Error Handling:**
    * Gracefully handles division by zero and modulo by zero errors.
    * Provides feedback for invalid numerical inputs.
    * Guides the user for invalid menu choices.
* **Continuous Calculation:** The application runs in a loop, allowing the user to perform multiple calculations without restarting, until they explicitly choose to exit.

## Technologies Used

* **Language:** Java
* **Development Environment (IDE):** Visual Studio Code (VS Code)
* **Java Development Kit (JDK):** Amazon Corretto 17 (or any compatible OpenJDK 17/21 distribution)
* **Version Control:** Git (for GitHub integration)

## How to Run

To get a copy of the project up and running on your local machine, follow these simple steps:

### 1. Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK) 17 or higher:** You can download it from [Amazon Corretto](https://aws.amazon.com/corretto/) or [Adoptium Temurin](https://adoptium.net/temurin/releases/).
    * After installation, verify it by opening a new terminal/command prompt and typing:
        ```bash
        java -version
        ```
    * You should see your JDK version details. If not, ensure your `JAVA_HOME` environment variable and `Path` are correctly configured.

### 2. Clone the Repository (if getting from GitHub)

If you're getting this code from a GitHub repository, clone it to your local machine:

```bash
git clone [https://github.com/Aditichoubey-adi/JavaConsoleCalculator.git](https://github.com/Aditichoubey-adi/JavaConsoleCalculator)
cd JavaConsoleCalculator