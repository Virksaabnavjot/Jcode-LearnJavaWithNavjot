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
*InterfaceImplementtion.java
*Purpose: This class allows us to implement the interface defined in Interface.java
*Date: 13/August/2017 | Sunday | 00:23 am (Dublin,Ireland)
*/

//https://www.javatpoint.com/interface-in-java
//https://stackoverflow.com/questions/23452097/class-is-not-abstract-and-does-not-override-abstract-method

public class InterfaceImplementation implements Interface{

  static int age; //declaring a static variable to store age

  //implementing a method
  public void greetings(){
    System.out.println("Hello, " + Interface.firstName);
  }

  //implementing the method to return an int (age)
  public int guessAge(int age){
    return age+3;
  }

  //main method - look for MainMethod.java class for more information
  public static void main(String[] args) {

    //printing details
    System.out.println(Interface.firstName);
    System.out.println(Interface.lastName);

    //creating an object
    InterfaceImplementation i = new InterfaceImplementation();

    i.greetings(); //greetings
    age = i.guessAge(19); //pass a parameter to the function/method that wil return an int
    System.out.println("Guessed Age: " +age); //print guessed age

  }

}
