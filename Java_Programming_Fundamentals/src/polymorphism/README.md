# Polymorphism 
It is a concept in which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism : 

1. Static Polymorphism: 

Method Overloading, It uses compile-time binding, Method invoked is based on the reference type.

2. Dynamic Polymorphism: 

Method Overriding, It uses late binding or runtime binding, Method invoked is based on the object type.

Method Overloading : In method overloading the argument list could differ in number of arguments, data type of arguments or sequence of data type of arguments.

Method Overriding : It is a way to achieve dynamic polymorphism.

It let you define a method in a child class which is already defined in a parent class.

The method definition in the child class overrides the definition in the parent class by having the same method signature.

The version of the method that is executed will be determined by the object that is used to invoke it at run time(dynamic binding).

The overridden method cannot have lesser or weaker access privilege in the child class.

Private method cannot be overridden.

Invoking an overridden method with parent class reference will invoke the method of the child class. JVM calls a method based on the type of the object not the reference This decision is taken at run time and hence this is knows as dynamic binding or dynamic dispatch method.

In the child class the parent class methods and overridden methods can be called with the parent class reference variable.

Methods defined only in the child class cannot be called using the parent reference class.

