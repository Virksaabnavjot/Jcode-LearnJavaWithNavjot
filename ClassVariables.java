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
*ClassVariables.java
*Purpose: This class helps understand the concept of class variables
*Date: 13 August 2017 | 3:21 pm | Dublin,Ireland
*/

/*Explanation: https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html

Class Variables - In this class we will understand, what are class variables(fields)
and how they are different from other/instance variables?

Class Variables meaning - The variable that belong to a class, rathor to the instance of
that class.
Example: private static int noOfStudents;
Class variables are referenced by the class name itself, as in (this case)
ClassVariables.noOfStudents  or Student.noOfStudents

*/
public class ClassVariables{

  //declaring instance variables
  String studentName, address;
  int studentId;

  //declaring class variable - using the static keyword
  private static int noOfStudents;

  //constructor - more info avaible in Constructor.java class
  public ClassVariables(){

  }


}
