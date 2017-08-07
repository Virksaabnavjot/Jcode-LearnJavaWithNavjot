/*
Copyright (c) 2017-2018 Navjot Singh Virk (Website: https://navsingh.org.uk),
(Project Git: https://github.com/virksaabnavjot/jcode)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

/*
*Constructor.Java
*Purpose: This class demonstrates different types of Constructors we can have in Java
*/
public class Constructor{

  //declaring variables - the name and description for the constructor
  String name;
  String description;

  /*
  A constructor allows you to provide initial values for class fields when you create the object.
  Suppose for this class named Constructor we have fields named name and description.
  You can create a constructor for the Actor class:
  */

  //Constructor 1: parametrised constructor
  public Constructor(String name, String description){

    /* this keyword - Each argument to the constructor shadows one of the object's fields
    — inside the constructor name is a local copy of the constructor's first argument.
    To refer to the Main Class field name, the constructor must use this.name.
    - From within a constructor, you can also use the this keyword to call another constructor in the same class.
    Doing so is called an explicit constructor invocation

    https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
    */

    //using this keyword with a field
    this.name = name;
    this.description = description;

  }
  /*
  If you explicitly declare any constructors for a class, Java does not create
  a default constructor for the class. As a result, if you declare a constructor
  that accepts parameters and still want to have an empty constructor
  (with no parameters and no body), you must explicitly declare an empty constructor for the class.
  */

  //Constructor 2: Default constructor
  public Constructor(){

    //public keyword indicates other classes can access the constructor

    /*default Constructor or zero Constructor that takes no arguments
    if you dont define one java creates one by itself but if any other constructor exists
    you have to explicitly declare default constructor
    */
  }

  //Constructor 3: parametrised constructor
  //(this constructor will be used to demonstrate how we can call a constructor within another using this keyword)
  // https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
  public Constructor(String name){

    //using this keyword within a constructor to call another constructor
    //Example: this(name,description);
    this("Name: Calling Constructor 1", "Description: Calling Constructor 1 from within Constructor 3");
    this.name = name; //comment this line out if you want to override the name with the name
    //from foreign constructor (i.e constructor 1)
  }

  //main method - more Explanation available in MainMethod.java class
  public static void main(String args []){
    System.out.println("Welcome to Constructor Class");
    System.out.println("This class demonstrate different types of Constructors we can have in Java.");

    //Constructor 1 Usage
    System.out.println("Constructor 1 Usage");
    Constructor c1 = new Constructor("Name: Constructor 1", "Description: I am constructor 1's instance");
    System.out.println(c1.name +" \n"+ c1.description);

    //Constructor 3 Usage
    System.out.println("Constructor 3 Usage");
    Constructor c3 = new Constructor("Name: Constructor 3");
    //gives out the name for c3 - Name: Constructor 3  (if we comment out: this.name = name;
    //within the constructor declaration it will return - Name: Calling Constructor 1)
    System.out.println(c3.name);
    System.out.println(c3.description); //since we can see from c3 declaration we dont have a description value for it
    //but since we called c1 within it using this keyword we can have description value for that reason
  }
}

/*Explanation: http://www.dummies.com/programming/java/how-to-use-a-constructor-in-java/

In Java, Constructor is a small piece of code similar to a method that’s called when an instance of an object is created.
Here are the key differences between a constructor and a method:
- A constructor doesn’t have a return type.
- The name of the constructor must be the same as the name of the class.
- Unlike methods, constructors are not considered members of a class.
- A constructor is called automatically when a new instance of an object is created.

*/
