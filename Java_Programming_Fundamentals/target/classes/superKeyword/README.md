# Super Keyword 

super keyword can be used to :

1. To invoke parent class constructor 

While using super keyword to call parent class constructor, the super statement must be the first statement in the child class constructor.

2. To access instance variables of parent class 

Super can be used to access parent class variables (other than private) from the child class when both the parent class and child class have variables with the same name.

3. To access methods of the parent class 

super can be used to access parent class methods (other than private) from the child class when both the parent and child class have the same method name.

To invoke super class default constructor from subclass constructor use super()

To invoke a parameterized constructor taking an int value use super(int)