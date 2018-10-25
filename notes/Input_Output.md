# Input and Output

#### Created by Yash Trivedi

When we are working with code we often want to recieve values fron the user, and/or present something to the user. For our goal we will be using scanner for input and a print line command from output.

## Output
For output we use a print line commmand. The syntax is as follows:
````java
System.out.println(x);
````
Here we can see it is using the system class to output a line (hence, println).
In this comand what ever is between the prarenthasis will be printed. These include both variables and values. To pritn out a value you must put it in quotes, like this.
````java
System.out.println("hello world!");
````
---

## Input
Input is a bit more consusing. For inputs we use the scanner class. It is part of the java.until package and can be used to inpute any primitve data type, along with strings.

To use scanner we use the system.in method along with the scanner.nextABC. Here is an example with numbers
````java
System.out.println("What is Your Age?");
Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
System.out.println("Your Age is: " + age);
````
Here is an example with strings
````java
System.out.println("What is Your Name?");
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
System.out.println("Your Name is: " + name);
````
