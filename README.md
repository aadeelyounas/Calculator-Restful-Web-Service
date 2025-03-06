Below is a sample README.md file for your Calculator RESTful Web Service project that you can upload to GitHub:

# Calculator RESTful Web Service

A simple calculator RESTful web service built with Spring Boot as Part of Lab in Distributed and Parralel Computing UoB

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Project Structure](#project-structure)

## Features
- **Arithmetic Operations:**  
  Supports addition, subtraction, multiplication, and division.
- **History Management:**  
  Tracks and displays a history of calculations, with an option to clear it.
- **RESTful API:**  
  Endpoints follow REST conventions and are designed to be easily consumed.

### Clone the Repository
```bash
git clone https://github.com/your-username/CalculatorService.git
cd CalculatorService

Build the Project

Run the Project

Once running, the application will be accessible at http://localhost:8080.

Endpoints

Calculator Operations
Addition:
GET /calculator/add?op1=5&op2=3
Returns the sum of op1 and op2.
Subtraction:
GET /calculator/minus?op1=10&op2=4
Returns the difference between op1 and op2.
Multiplication:
GET /calculator/product?op1=7&op2=6
Returns the product of op1 and op2.
Division:
GET /calculator/divide?op1=20&op2=4
Returns the division of op1 by op2 (handles division by zero).

History Management
Display History:
GET /calculator/history
Displays a history of all calculations performed.
Clear History:
GET /calculator/clear
Clears the calculation history.

