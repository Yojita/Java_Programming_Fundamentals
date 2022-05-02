#Arrays

Used to store multiple values of the same datatype.

Use array when the number of elements are fixed.

Array is preferred when there is no frequent checks and comparisons made on the array elements.

Return an empty array instead of null array to avoid runtime exceptions.

private int[] value = new int[3];  // declaration and instantiation combined in a single step. This array can take 3 int values.

value[0] = 100;  // Initialization of array elements. Array indexing starts from 0.

private int[] primeNos = {11,12,13,14}; //values are assigned using curly braces

private int[] value;  //declaration and instantiation in multiple steps.
value = new int[3];

private Bank[] bank = {new Bank(), new Bank()};  //Reference type array

#Multi-dimensional Arrays : 
Arrays can be termed as a physical table with rows and columns.

int[][] marks = new int[2][3];   //Declares a 2-D array with 2 rows and 3 columns

Bank[][] bank = new Bank[2][3];

int [][] marks = new int[2][];  //While instantiating a 2-D array, specifying the size of the 2nd dimension is not mandatory.

Bank [][] bank = Bank[2][];

marks[0] = new int[2];  //first row of multidimensional array will have 2 columns

bank[0] = new Bank[2];


