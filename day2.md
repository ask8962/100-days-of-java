Day 2 – Variables, Data Types & Operators

1. Variables in Java

A variable is a container that stores data values during program execution.

Syntax:
type variableName = value;

Example:
int age = 25;
String name = "Java";

Rules for Naming Variables:
-   Can contain letters, digits, _, $.
-   Cannot start with a digit (e.g., 1name ❌, name1 ✅).
-   Case-sensitive (age vs Age are different).
-   No whitespace allowed.
-   Cannot use Java keywords (e.g., class, public, int ❌).
-   Convention: Use camelCase (e.g., myAge, studentName).

2. Data Types in Java

Java is a statically typed language (type must be declared).

A. Primitive Data Types (8 Types)
These store actual values.

Type	Size	Description	Example
byte	1 byte	Stores whole numbers from -128 to 127	byte age = 20;
short	2 bytes	Stores whole numbers from -32,768 to 32,767	short salary = 10000;
int	    4 bytes	Stores whole numbers (Commonly used)	int num = 100000;
long	8 bytes	Stores large whole numbers (Ends with L)	long pop = 7000000000L;
float	4 bytes	Stores fractional numbers (Ends with f)	float price = 10.99f;
double	8 bytes	Stores fractional numbers (Higher precision)	double pi = 3.14159;
boolean	1 bit	Stores true or false	boolean isJavaFun = true;
char	2 bytes	Stores a single character/letter (Single quotes)	char grade = 'A';

B. Non-Primitive Data Types (Reference Types)
These refer to objects.
-   Strings (String name = "Hello";)
-   Arrays
-   Classes
-   Interfaces

3. Operators in Java

Operators are symbols used to perform operations on variables and values.

A. Arithmetic Operators (+, -, *, /, %)
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3 (Quotient)
System.out.println(a % b); // 1 (Remainder)

B. Unary Operators (++, --)
int x = 5;
x++; // Increment by 1 -> 6
x--; // Decrement by 1 -> 5

C. Assignment Operators (=, +=, -=)
int num = 10;
num += 5; // Same as num = num + 5; (15)

D. Comparison (Relational) Operators (==, !=, >, <, >=, <=)
Returns boolean (true/false)
System.out.println(10 > 5); // true
System.out.println(10 == 10); // true

E. Logical Operators (&&, ||, !)
-   && (AND): Returns true if both are true.
-   || (OR): Returns true if at least one is true.
-   ! (NOT): Reverses the result.

4. Practice Code (Main.java)

public class Main {
  public static void main(String[] args) {
    // Variables
    String name = "John";
    int age = 20;
    float height = 5.9f;
    boolean isStudent = true;

    // Output
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Is Student? " + isStudent);

    // Operator Example
    int a = 10, b = 20;
    int sum = a + b;
    System.out.println("Sum: " + sum);
  }
}

5. Key Points to Remember
-   float values need 'f' at the end (e.g., 5.5f), otherwise treated as double.
-   long values need 'L' at the end if the number is too big for int.
-   String is a class, not a primitive type (starts with Uppercase 'S').
-   Division (/) of two integers returns an integer (5/2 = 2, not 2.5).

6. Day 2 Summary
-   Variables & Naming rules.
-   8 Primitive Data Types.
-   Operators (Arithmetic, Relational, Logical).
-   Type Casting (Implicit vs Explicit) - *Note: can add in Day 3 or here if brief.*
