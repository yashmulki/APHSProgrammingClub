# Conditional Statements And Branches

#### Written by Aaditya Chaudhary on August 29

# Last week on....

So far all of our programs have flowed smoothly from the first command, to the next, to the next, etc.

But if your program only has one path, we cant make decisions or algorithms.

## But that's about to change

Conditional statements are how we can put forks in the road of our code. Let's take a look at our options, shall we?

### If statement:

````java
if(x == 5)
{
    System.out.println("x is equal to 5")
}
````
This is the basic If statement. Essentially, it uses a conditional statement, and evaluates that to either a `true` or a `false`. If it's a `true`, then the code within the curly braces runs.

### else statement:

````java
else
{
    System.out.println("x is not equal to 5")
}
````
This is the second fork, should the conditional statement of an `if` be `false` the `else` code will run. however only 1 can run.

### else-if statement

````java
if(x == 1) {}
else if(x == 2){}
else if(x == 3){}
else{}
````
`else-ifs` are used when multiple `ifs` should be used but only one should run.
