# Input and Output

#### Created by Yash Trivedi

When we are working with code we often want to recieve values fron the user, and/or present something to the user. To do this, we will be using scanner for input and a print command for output.

## Output
For output we use a print line command. The syntax is as follows:
````java
System.out.println(x);
````
Here we can see it is using the system class to output a line (hence, println).
In this comand whatever is between the parenthesis will be printed. These include both variables and values. To print out a value you must put it in quotes, like this.
````java
System.out.println("hello world!");
````
We can print both text and variables by using +.

````java
int numberOfFriends = 0;
System.out.println("I have " + numberOfFriends+ " friends.")
````
this will output:
````
I have 0 friends.
````
As you can see we join the bits of text and the variables by using +.


---

## Input
Input is a bit more consusing. For inputs we use the scanner class. It is part of the java.until package and can be used to input any primitve data type, along with strings.

To use scanner we first have to create a Scanner object, then we use a Scanner method to take input from the console.
````java

System.out.println("What is Your Age?");

//creating a scanner object with the name input
Scanner input = new Scanner(System.in);

/* at this line the program will pause and wait for the user to input something into the console */
int age = input.nextInt();
System.out.println("Your Age is: " + age);
````

Here is an example with strings

````java
System.out.println("What is Your Name?");
Scanner input = new Scanner(System.in);
//now it's expecting a string to be inputed
String name = input.nextLine();
System.out.println("Your Name is: " + name);
````


