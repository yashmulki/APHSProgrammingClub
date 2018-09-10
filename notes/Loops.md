# Loops, Loops, Loops

#### developed by Aaditya Chaudhary

Writing code can be tedious, so should we want to repeat blocks of code, we use loops.

loops are simple, are made up of two parts: the arguments, and the body. The body is what gets run repeatedly. The arguments change depending on the type of loop but they always include a conditional statement. The loop reruns the body until the condition is untrue.

## Types of Loops:

1. For Loops:

````java
for(int x = 0; x < 5; x++)
{
System.out.println(x);
}
````

You declare a variable, then set the conditions for the loop to break, then declare an action to take at the end of every loop. The loop above creates x and gives it the value of 0, then increments (x++) it until x = 5, where the loop breaks.

2. While Loop

````java
while(x < 5)
{
    System.out.println(x)
}
````

A while loop is bascially a for loop, but the only argument it has is the conditional statement.

3. Do-While Loop

````java
do{
    System.out.println(x)
}while(x < 5)
````

this is essentially a while loop except that the body runs before the conditional statement is evaluated, which means that the body runs atleast once.
