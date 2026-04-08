# Basic Arithmetic Calculator

This project contains two versions of a simple arithmetic calculator, one written in Java, another in Python. Both versions demonstrate string manipulation, input parsing, and basic object-oriented programming.


**Features:**

- Expression Parsing: The program accepts a full expression (e.g., 10+5) and automatically separates the numbers and the operator.

- Basic Operations: Supports addition, subtraction, multiplication, and division.

- Error Handling: Includes checks for division by zero and invalid expressions.

- Input Cleaning: Automatically removes spaces from user input to prevent parsing errors.


**Technical Details:**

JAVA:

- Scanner: To read user input from the console.

- String Methods: indexOf() to find the operator and substring() to split the numbers.

- Type Conversion: Integer.parseInt() to convert text into math-ready integers.

- Methods: Logic is separated into static methods for each arithmetic operation.

PYTHON:

- Input: Uses the input() function.

- Dynamic Splitting: Uses the split() method to break the string based on the detected operator.

- Type Conversion: Uses the int() constructor for numerical operations.


**Future Improvements:**

- Add support for decimal numbers (Double).

- Implement a loop so the user can perform multiple calculations without restarting.

- Add support for negative numbers and complex expressions with multiple operators.
