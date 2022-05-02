# final keyword 

final can be used in 3 scenarios :

1. Before variable : 

A final variables value once initialized can't be changed, i.e. it is a constant private final int tenure = 20;


2. Before a method : 

A final method cannot be overridden in a subclass

public final void calculateEMI();


3. Before a class : 

A final class cannot be subclassed.(i.e. you cannot extend the class)

public final class Loan();