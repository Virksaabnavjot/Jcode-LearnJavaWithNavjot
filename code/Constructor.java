/*
Copyright (c) 2017-2018 Navjot Singh Virk (https://navsingh.org.uk)

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
Purpose: This class demonstrate different types of Constructors we can have in Java
*/
public class Constructor{

  //public keyword indicates other classes can access the constructor
  public Constructor(){
    //default Constructor or zero Constructor that takes no arguments
  }

  //main method - here is where we code
  public static void main(String args []){
    System.out.println("Welcome to Constructor Class");
    System.out.println("This class demonstrate different types of Constructors we can have in Java");
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
