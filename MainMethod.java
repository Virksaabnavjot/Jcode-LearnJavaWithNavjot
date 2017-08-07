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
*MainMethod.Java
*Purpose: This class helps understand the role of MainMethod in Java
*public static void main (String args []){}
*/

public class MainMethod{

  //default constructor
  public MainMethod(){}


    /*Explanation: http://www.code2learn.com/2011/11/public-static-void-mainstring-args.html
    -Why public (access modifier) ?
    Public means that this Method will be accessible by any Class(If other Classes
    are able to access this Class.) main( ) must be declared as public, since it must be called by code
    outside of its class when the program is started.

    Why Static ?
    The keyword static allows main( ) to be called without having to
    instantiate a particular instance of the class. This is necessary since
    main( ) is called by the Java interpreter before any objects are made

    Why void ?
    The keyword void simply tells the compiler that main( ) does not return a value.

    What does String args[] do?
    String args[ ] declares a parameter named args, which is an array of instances of
    the class String. (Arrays are collections of similar objects.) Objects of type
    String store character strings. In this case, args receives any command-line arguments
    present when the program is executed.

    */

    //Main Method
    public static void main(String args []){

      //inside the method we write all the code that we want to be executed when we run the program
      System.out.println("Welcome, Navjot");
      
    }

  }
