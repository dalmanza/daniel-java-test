# StringDuplicates Project

## Overview
The `daniel-test-task` project is a Java application designed to remove duplicate characters from a string. This
is the solution for SoftServe Java Software Engineer.

## Features
- **String Deduplication**: The core feature of the project is implemented in the `StringDuplicates` class. 
    This class includes the `removeDuplicates` method which takes a string as input and returns a new string 
    with all duplicate characters removed.


- **Command Line Interface**: The main class implements the `CommandLineRunner` interface, 
    allowing users to execute examples and see the utility in action when the application is starting up.


- **Unit Testing**: The project includes comprehensive unit tests, 
    written using JUnit 5's `ParameterizedTest`. These tests cover a variety of cases to ensure 
- the reliability of the `removeDuplicates` method.

## How to Run
To run the application:
1. Clone the repository to your local machine.
2. Build the project using your preferred Java build tool (e.g., Maven, Gradle).
3. Run the main class. The application will execute several examples using the `run` method from the `CommandLineRunner` interface.

## Testing
The `StringDuplicates` class is thoroughly tested with a range of input scenarios. The tests are parameterized to ensure that the method behaves correctly with:
- Regular strings with duplicates.
- Strings without any duplicates.
- Strings with all characters being duplicates.
- Empty strings.
- Strings with null values.
- Strings containing special characters and numbers.

## Complexity Analysis
The algorithm used in the `removeDuplicates` method has a time complexity of O(n), where n is the length of the 
input string. This complexity arises because the method needs to check each character in the string to identify 
and remove duplicates.
