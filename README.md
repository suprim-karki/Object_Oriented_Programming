# Object-Oriented Programming Tutorials

This repository contains my weekly tutorial exercises for the **Object-Oriented Programming (OOP)** module, studied as part of the **BSc. (Hons) Computer Science, Level 5** at **The Westminster College**, affiliated with the **University of Westminster**.

The repository documents my learning progress throughout the module, including the development of Java applications, object-oriented programming concepts, and REST API implementation using Spring Boot.

## About This Repository

Initially, I planned to organise the tutorial work into separate folders for every week or tutorial. However, as the tutorials progressed, I realised that the new exercises were often designed to extend the existing project rather than start a completely new one.

Therefore, from Tutorial 3 onwards, I decided to keep the continuing work in one place. This makes it easier to build on previous exercises, reuse existing classes, and develop the application as new requirements are introduced.

Tutorial 0 and Tutorial 1 remain in their own folders to preserve the earlier versions of the work.

## Project Structure

    Object_Oriented_Programming/
    ├── Tutorial_0/
    │   └── products-api/
    ├── Tutorial_1/
    │   └── products-api/
    ├── Tutorial_3_&_above/
    │   └── products-api/
    ├── .gitignore
    └── README.md

### Folder Overview

The folder arrangement reflects how the tutorial work developed. Not every tutorial has a separate project because later exercises may depend on the code created in earlier sessions.

## Important: Before Running the Application

**Always open the relevant `products-api` folder inside the tutorial folder you want to run.**

For example:

- Tutorial 0: `Tutorial_0/products-api/`
- Tutorial 1: `Tutorial_1/products-api/`
- Tutorial 3 onwards: `Tutorial_3_&_above/products-api/`

If you are using an IDE such as IntelliJ IDEA, open the relevant `products-api` folder as the project.

This is important because each project folder has its own Maven configuration, dependencies, and source code. Opening the correct folder ensures that you work with the intended tutorial version.

## Getting Started

### Prerequisites

Before running a project, ensure you have:

- A compatible Java Development Kit (JDK).
- An IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code with Java support.

### Steps to Run the Project

**Step 1: Choose a tutorial.**

Select the tutorial folder you want to work with.

**Step 2: Open the `products-api` folder.**

Open the `products-api` folder inside the selected tutorial directory in your IDE.

**Step 3: Run the application.**

Run the application directly from your IDE.

Once the application starts, you can access it at:

- **Application:** `http://localhost:8080`
- **Swagger UI (API documentation):** `http://localhost:8080/swagger-ui/index.html`

Swagger UI allows you to view the available API endpoints, inspect their details, and test requests directly from your browser.

## Learning Objectives

The purpose of this repository is to apply the concepts taught in the OOP module through practical coding exercises. It also provides a record of how the application develops over time as new requirements are introduced.

Rather than treating each tutorial as an entirely separate project, the continuing structure from Tutorial 3 onwards allows me to build on existing code, improve my understanding, and practise developing a more complete application.

## Notes

- This repository is primarily for educational and practice purposes.
- Some endpoints use hard-coded sample data.
- The tutorial folders may contain different versions of the application.
- Always open the relevant `products-api` folder before running the project.
- Swagger UI availability depends on the relevant project's configuration and dependencies.
- The code may change as exercises are completed, reviewed, and extended.

## Author

**Suprim Karki**

BSc. (Hons) Computer Science, Level 5  
The Westminster College  
Affiliated with the University of Westminster