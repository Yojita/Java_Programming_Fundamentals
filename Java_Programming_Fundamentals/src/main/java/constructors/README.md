# Constructors 
Constructor is a special method without return type having name same as that of class name. Once the object is created is is being initialized by the constructor.

# Types of Constructors: 

1. Default Constructor : 

A constructor void of any arguments. 

If the programmer does not provide the default constructor, the compiler will provide one.

2. Parameterized Constructor : 

A constructor that has parameters(arguments).

On finding a parameterized constructor, compiler doesn't give the default constructor.

Best practices : 

Data object variables which are mandatory should be initialized through constructor. So we can avoid getters and setters for those variables.

That ensures variables cannot be changed after new instance of object is created.
