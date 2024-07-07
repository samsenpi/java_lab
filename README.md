# Java Basics Code 🚀

This guide introduces fundamental Java concepts through practical examples, covering syntax, data types, control structures, and OOP principles. Ideal for beginners and as a refresher. 📚✨

## 1. Introduction to Java
- **Java** is a high-level, class-based, object-oriented programming language.
- Developed by Sun Microsystems in 1995 and now owned by Oracle.
- Known for its portability across platforms due to the Java Virtual Machine (JVM).

## 2. Java Syntax
- **Class Definition:** Every application must have at least one class definition.
- The name of the file must be same as the name of public class.
- in java if there are more than one class and each class is not public than the name of file can be the name of any  class or the name of the class having main function.
- in java if can have multiple classes but can`t have more than one public class.it will  generate a compiler error.
- -in java nothing in outside of class even main is also inside of class.except to import a package 
  ```java
  public class MyClass {
      // code goes here
  }
## Main Method: Entry point for any Java application.
  ```
public static void main(String[] args) {
    // code goes here
}
```
## 3. Data Types
**Primitive Data Types**:
int (integer): 4 bytes
float (floating point): 4 bytes
double (double-precision floating point): 8 bytes
char (character): 2 bytes
boolean (true/false): 1 bit
byte (8-bit integer): 1 byte
short (16-bit integer): 2 bytes
long (64-bit integer): 8 bytes
## 4. Variables
Variables must be declared before use.

int number = 10;
double price = 19.99;
char grade = 'A';

## 7:Object-Oriented Programming (OOP)
# Classes and Objects:

A class is a blueprint for objects.
An object is an instance of a class.


```
 class Car {
    // fields
    int year;
    String model;
    
    // methods
    void start() {
        // code
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // creating an object
        myCar.year = 2020;
        myCar.model = "Tesla";
        myCar.start();
    }
}
```
## 8: Inheritance:
-parent childe relation
-in java there is no concept of multiple inheritance except interface.multiple inheritance means one class inherited from more than one parent.
-in java all fun of parent class are by default virtual mean all fun  of parent can be directly override in the child class.
- in java if you want a fun is parent class can`t be override in child class make it final(const) fun.
- 
```
class Animal {
    void eat() {
        // code
    }
}

class Dog extends Animal {
    void bark() {
        // code
    }
}
```
## 9:Polymorphism:

Ability to take many forms. Method overriding and method overloading are examples.
```
class Animal {
    void sound() {
        // code
    }
}

class Dog extends Animal {
    void sound() {
        // code
    }
}
```
## Abstraction:
In Java, an abstract method is a method that is declared without an implementation. It's meant to be overridden (implemented) by subclasses of the abstract class or interfaces that declare the abstract method. Here's how it works:
-use the keyword abstract
-abstract fun only have fun declaration .
-abstract class can have concrete fun and abstract fun.
- if the abstract fun are not override in childe class then that child class also become abstract.so to prevent this the abstract fun must override in child class
- you can have an abstract class without any abstract fun
```
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        // code
    }
}
```
##  Exception Handling
-try
-catch
-finally
-throw
-throws
Mechanism to handle runtime errors.
```
try {
    // code that may throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
} finally {
    // code that will always execute
}
```
** throw
The throw keyword is used to explicitly throw an exception.
It can throw both checked and unchecked exceptions.

```
public class TestThrow {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Age is valid");
        }
    }
}
```
** throws: 
-is used to delegate the responsibility of handling exceptions to the caller of the method.
- If the caller method doesn't handle the exception, it can further propagate up the call stack until it's caught and handled.
```
  import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        try {
            readFromFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void readFromFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
```

## 9. Input and Output (I/O)
** Reading from console:

```
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name);
## File I/O:


try {
    File file = new File("filename.txt");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
    scanner.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```
