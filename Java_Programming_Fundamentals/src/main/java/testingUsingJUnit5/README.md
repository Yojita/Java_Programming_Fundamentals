# Testing usingJUnit5

Our code usually consists of several test modules or units.Each and every block of code has to be tested to ensure individual correctness. We also test them after every change to ensure other modules are not affected.

Testing single small unit of code such as a method or a class and asserting certain behavior is called unit testing. 

Unit testing can be :

1. Manual : 
Time consuming
Can be error prone

2. Automated : 
Which saves time 
Useful for frequently changing mode
Less error prone to manual testing

JUnit : 
JUnit is open source unit testing framework for Java. It provides classes to write and run automated tests.

It provides : 
Annotations to create and customize tests.

A platform where common functionalities can be performed before or after the execution of each test case/class.

Library functions which are used to define when a test case should pass or fail.

Platform to execute multiple test classes together.

To specify output to the test case method, we will use a special class called Assertions.(imported from org.junit.jupiter.api.Assertions)

This class provides various methods using which we can specify the expected output to the test case.

assertEquals(Object expected, Object actuals) : passes test case if both the parameters are equal.

asserNotEquals(Object expected, Object actuals) : passes test case if both the parameters are not equal.

assertTrue(boolean condition) : passes test case only if return value is true.

assertFalse(boolean false) : passes test case only if return value is false.

assertNull(Object actual) : passes the test case only if the object is null.

assertNotNull(Object actual) : passes the test case if the object is not null.

All the methods mentioned above are static. 

# parameterized test cases : 
helps us in reusing one test case to test to test the method with multiple inputs.
to create parameterized test case we have to use annotation @ParameterizesTest(import this from org.junit.jupiter.params.parameterizedTest). this annotation tells junit to accept multiple parameters.

CsvSource or Comma Separated Value Source(imported from Org.junit.jupiter.params.provider.CsvSource), this annotation has an attribute which takes string literal data or an array of String literal data.

# Tags
There at times need for grouping different test cases under different banners, so that their execution can be controlled based on need of the hour.Such grouping made possible using @Tag (imported from org.junit.jupiter.api.Tag) annotations.

# Lifecycle Methods : 

@BeforeEach(imported from org.junit.jupiter.api.BeforeEach) annotation
Method annotated with this will be executed before the execution of the each test case method.

@AfterEach(imported from org.junit.jupiter.api.AfterEach) annotation
Method annotated with this will be executed after the execution of the each test case method.

@BeforeAll : executed before any method of the test case is executed

@AfterAll : executed after any method of the test case is executed.

Nature of the method to be annotated by these two annotations should be static.