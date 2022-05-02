# Variable Arguments
Varargs

We use an array to pass random number of values to a method. For this we first create an array and add values in it. and then call method, But varargs feature helps to automate and hide the process.


syntax :
return_type method_name(data_type... variable){ //varargs declaration
statements;
}

The three periods after the parameter's data type shows that it can be passed as an array or sequence of arguments.

Java internally uses an array to process the variable arguments.

varargs can take zero or any number of arguments.

Only one varargs argument is allowed in a method.

In a case of more than one argument then varargs should be the last argument of the method.
