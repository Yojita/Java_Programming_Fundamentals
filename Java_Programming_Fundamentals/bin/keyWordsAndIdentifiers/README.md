Keywords and Identifiers

Keywords are reserved words and have a special meaning.
e.g. class, public, void, int, static etc.

Identifiers are names used for identifying components of a program like classes, methods, interfaces, enums and variables.

Rules for naming identifiers:

case sensitive
should not start with a number
can start with letter, $, _
should not have spaces
should not be a Java keyword or literal
No restriction on the length


DataTypes : Data can be given certain names in the program, these names are called as variables.These variables point to a memory location where the value is stored.This value can change during the program run. The type of data stored by a variable is represented using data types.
The data types defines the amount of memory used and operations which can be performed on a variable.

Two different types of data types : 
1. Primitive Data Types : It holds the value of the data item. e.g int, float etc.

2. Non-primitive Data Type : It holds the memory address where the data item(Object) is stored.It is also known as reference datatypes. e.g. Classes, enum.


Variables: A placeholder for data 

There are two type of variables : primitive and reference variables.

primitive variable : Example : int age;

Reference variable : Example : Account savingsAccount;

Reference Type : 
An object can be created and alloted memory using "new" keyword. The default value of an object is always null.
Account acc = null; 
acc reference does not point to any object.

The function of new keyword is to allocate memory for an object and assign default values to the member variables. The reference variable created in the memory just after memory allocation for the object Account() constructor is called.

Account acc = new Account();


Scope of Variables:

1. Local Variables : Variables are declared and used inside the same method body.

2. Static Variable : Static variables are declared inside a class and can be used outside the class with the class name and the class object. But the class name is preferred.

3. Instance Variable : Instance variables are declared inside the class and can be used outside class with the class object only.

From Java 10 onwards a new feature of local variable type interface has been introduced.

This feature allows you to specify var instead of the datatype while declaring a variable
 
e.g. var number = 111;
In this case compiler infers the datatype of the variable based on the value initialized to it.

var cannot be used when a variable is just declared and not initialized.

Once the variable declared and initialized you cannot change the type of value assigned to it.

var cannot be initialized to null which will result in a compilation error asit cannot determine the datatype of the variable.

