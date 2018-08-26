# Objects and Classes
#### Note Compiled by Yashvardhan Mulki on August 25th, 2018
So far, you've been working primarily with the main method and methods you've created to solve programming problems, but you've probably seen the syntax below at the top of your .java file:

```java
public class ExampleName 
```

So what exactly does this mean?

## What is a Class
A class is somewhat like a blueprint. It can contain things like methods and properties (variables and constants). For example, the ExampleName class could contain something like this:

```java
public class ExampleName {
    public static void main (String args[]) {
        // Do something here
    }
    public static Int addItems (Int item1, Int item2) {
        return item1 + item2;
    }
    public static Int myInt = 0;
}
```
As you can see, the class contains the Main and addItems methods, and a property named myInt. But remember how I said that classes are a blueprint? Let's take a look at objects, which make classes extremely useful. 

## What are Objects
 
 Objects let you create multiple *instances* of your class. What this means is that you can create many, many copies of your class and use them around your program. Let's imagine that you are writing a game and you'd like to have cars in it.

  Now, cars are not all the same, so maybe you'd try using your newfound knowledge of objects and classes to do something like this:

 ```java
 public class HondaCivic {
     public String carName = "Honda Civic";
     public Int topSpeed = 204;
     public Int horsepower = 174;
     public void drive() {}

 }

 public class BuggatiChiron {
     public String carName = "Buggati Chiron";
     public Int topSpeed = 420;
     public Int horsepower = 1500;
     public void drive() {}
 }
 ```
 
 And then in the main method that is the entry point for your game, you can create instances of these classes. As you can see, you can make many instances of classes and it's just like making a variable.:

  ```java 
public class GameRunner {

    public static void main(String args[]) {
        // Do stuff here
        HondaCivic civic1 = new HondaCivic();
        HondaCivic civic2 = new HondaCivic();
        BuggatiChiron chiron1 = new BuggatiChiron();
        BuggatiChiron chiron2 = new BuggatiChiron();
    }

}
 ```

 You might remember the `new` syntax from creating scanners. Scanner is also a class and you create Scanner instances. To make an instance of any object, you use the following declaration pattern:

 `ClassName identifier = new ClassName();`

 Now obviously these two cars are very different, but as you can see, they have the same **properties**, just different **values** contained in the properties. That's where objects come in. Instead of having one class for each type of car, you could create one class, called `Car` that contains variables for name, top speed and horsepower, something like this:

 ```java
 public class Car {
     // 1
     public String carName;
     public Int topSpeed;
     public Int horsepower;

    // 2
     public Car(String carName, String topSpeed, String horsepower) {
         this.carName = carName;
         this.topSpeed = topSpeed;
         this.horsepower = horsepower;
     }
 }
 ```

1. Instead of having values in the properties, we leave them *uninitialized*, which is a fancy way of saying we don't give it a value. 
2. We then add a method called `Car`, which is also constructor method. It's like any other method, except that it is used to set up the class. You can create constructors with any parameters you'd like, or you could leave it blank.

So instead of having all these different classes from which you create objects, you could write the `Car` class and use the init method to create an instance from the class with the values of a certain car. The `this` keyword refers to the instance that has been created when the `Car` constructor was called. In the GameRunner file, it would look like this:

```java
public class GameRunner {
    public static void main(String args[]) {
        // Do stuff here
        Car hondaCivic = new Car("Honda Civic", 204, 174);
        Car buggatiChiron = new Car("Buggati Veyron", 420, 1500);
    }
}
```

## The Static Keyword

You may have noticed that I omitted the `static` keyword in the properties and functions of the `HondaCivic`, `BuggatiChiron` and `Car` classes. To understand why, it is important to understand what the `static` keyword is.

In a class, you can have two types of properties. Instance properties, which are different and can be modified independently for each instance, and Class properties, which are the same across all instances of a class. The `static` keyword tells the compiler that a property is a class property and is shared across all the instances. Static methods can use  static properties and methods, and non static methods can use both static and non static properties and methods. Static methods can use upon non static fields (fields are methods and properties) through an  reference. So in GameRunner, you can do what you see below even though `horsepower` is a non static field because there is an object you can access. Without this object, a static field would not know which instance of a non static field to act upon.

```java
public class GameRunner {
    public static void main(String args[]) {
        // Do stuff here
        Car hondaCivic = new Car("Honda Civic", 204, 174);
        hondaCivic.horsepower = 200;
    }
}
```

If you didn't understand that, it's okay, just know that if you a property something to be different across instances, don't add static, and if you are writing a method that uses non static properties, don't make the method static either. For further explanation, watch [this video](https://www.youtube.com/watch?v=T8dNBmK40d0).