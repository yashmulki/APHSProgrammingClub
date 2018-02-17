

class Main {

  public static void main(String[] args) {

      // This is a variable. It lets programmers store data during the execution of the program
      int myFirstVariable = 0;
      // Above, myFirstVariable is an Int, or an Integer. It only stores whole numbers. myFirstVariable is the name
      // Below are some other data types.
      // Doubles and floats can store decimal numbers
      Double myFirstDouble = 5.6;
      Float myFirstFloat = 7.2;
      // Strings Store Text
      String myFirstString = "Hello World";
      // Chars store individual characters in text
      char myFirstChar = 'e';
      // You can also modify variables
      myFirstVariable = 5;

      // You can also make constants, which are variables that you can't change later - use the key
      // Instead of using values for example 3.14 as pi, it's better to declare a constant
      final Double pi = 3.14;
     

      // Here's how you output something in Java. You don't need to know what System is yet
      System.out.print("Hello World"); // print prints out whatever is in the brackets to the con
      System.out.println("Hello World"); // println prints and then moves to the next line
      System.out.println(myFirstString); // You can also print out variables
      System.out.println(myFirstString + " " + myFirstVariable); // This will print out Hello World 5
      // The + in this case adds things to the initial string
   
  

  }

}
