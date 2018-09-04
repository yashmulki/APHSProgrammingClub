# Methods
#### Note Compiled by Yashvardhan Mulki on August 26th, 2018

So far, you've put all of your code in the main method, which is fine for many basic problems, but to efficiently solve larger problems being able to create your own methods is an invaluable tool.

Let's say you have the following program:

````java
public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    int number1 = myScanner.nextInt();
    int number2 = myScanner.nextInt();
    int sum = number1 + number2;
    System.out.println(sum);
}
````

Now this works perfectly if you just want to add numbers, but what if you wanted to add multiple numbers. You'd have to just copy and paste the adding code, which isn't a great solution. Instead, you could use a method. You've used methods before with the main method. But you can also make your own methods.

## So What is a Method?

A method is a reusable block of code. You can "call" a method to use the code contained within it and you can pass in "parameters" (values that the function can operate upon). Here's an example that allows you to add two numbers.

````java 
public static int addNumbers(int number1, int number2) {
    return number1 + number2;
}

public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    int num1 = myScanner.nextInt();
    int num2 = myScanner.nextInt();
    int result = addNumbers(num1, num2);
    System.out.println(result);
}
````

Let's break that down. On the new function, you can see 
`public static int`. Ignore public and static for now, but int means that the function "returns" an integer. Inside the brackets, you can see two variables `int number1` and `int number2`. What this means is that the function takes in two integers as its input and uses it to generate the output.

In general, the syntax for a function is:
`public static [type] [name]([variable type][variable name]) { }`

