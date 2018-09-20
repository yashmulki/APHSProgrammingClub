# Constatnts, Variables, and Datatypes
---
#### Made by Yash Trivedi

Java allows one to store data in a few ways these are known as data types.
As we begin to write code it is crucial that we can recognize and differentiate between constants and variables.
## Data types + Strings
##### Primitive Data Types
Java has eight primitive data types
These are:
- Byte - a byte of data 
- Shorts - 2 bytes of data numbers
- Integers - 4 bytess of data - number
- Longs - 8 bytes of data - number
- Floats - less proecice decimal values
- Doubles - More presice decimal values
- Booleans - true or false
##### Strings
A string is just sequence of characters. We often use then to make workds of words or sentences.
These are always in qotation marks. For example:
````java
String s = "hello world!";
````
---
## Variables
A variable is a value which we are able to change. We can can have a variable for every datatype

You declare a variable by forst stating the data type then a name and then the value
Ex.
````java
int i;
i = 5;
//or, put it together
int i = 5;
````
Special cases
````java
float i = 5f;
````
---
## Constants

Any constant is a value that cannot be changed, and every data type can be represented as a constant.
Some types of constnats include:
- characters - char
- integers - int
- floats - float
- doubles- double

In java you declare constansts by essentially declaring a final variable.
````java
final char a = a;
final int i = 1;
final float f = 3.6f;
final double d = 3.45;
````
We do this because java  does not officially support constants. Instead we declare final variables, as final variables cannot be changes, making them in essence constants.
