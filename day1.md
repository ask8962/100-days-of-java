Day 1 – Get Started With Java
1. What is Java?

Java is a high-level, object-oriented, platform-independent programming language.

“Platform-independent” means:
Write once, run anywhere (WORA).

Java code runs on JVM (Java Virtual Machine).

2. Running Java Without Installing (Online Editor)

Platforms like W3Schools Online Java Editor allow running Java code directly in the browser.

Useful for:

Beginners

Quick testing

Limitation:

Not suitable for real-world projects

3. First Java Program (Hello World)
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}


Output:

Hello World


This is the basic structure of every Java program.

4. Understanding the Code (Basic Level)
Part	Meaning
public class Main	Defines a class named Main
class	Blueprint of a program
public	Accessible from anywhere
static	Runs without creating an object
void	Returns nothing
main	Entry point of the program
String[] args	Command-line arguments
System.out.println()	Prints output on screen

⚠️ Important:
Java program execution always starts from main() method.

5. Java Installation (Offline Setup)
Check Java Installation (Windows)

Open Command Prompt and run:

java -version


If installed, output looks like:

java version "22.0.0" 2024-08-21 LTS
Java(TM) SE Runtime Environment
Java HotSpot(TM) 64-Bit Server VM


If not installed:

Download from oracle.com or Eclipse Adoptium

Install JDK (Java Development Kit)

6. Java File Rules

Java file extension: .java

File name must match class name

Example:

public class Main


File name must be:

Main.java


Mismatch = compile-time error

7. Java Compilation & Execution Flow
Step 1: Write Code

File: Main.java

Step 2: Compile Code
javac Main.java


Converts .java → .class

.class file contains bytecode

Step 3: Run Program
java Main


Output:

Hello World

8. Java Program Execution Diagram
Main.java
   ↓ (javac)
Main.class
   ↓ (JVM)
Output

9. IDE vs Text Editor
Text Editor	IDE
Notepad	IntelliJ IDEA
Manual work	Auto suggestions
No debugging	Built-in debugger
Beginner-friendly	Industry standard

For learning basics → Text editor is fine
For projects → IDE is recommended

10. Key Points to Remember (Exam + Interview)

Java is case-sensitive

Every program needs a main method

Class name = File name

System.out.println() prints with newline

Java uses JVM to run programs

11. Common Beginner Mistakes

Wrong file name

Missing ;

Writing main() incorrectly

Forgetting public static void

12. Day 1 Summary

Java introduction

First program

Java installation check

Compile vs Run

JVM concept

File naming rules