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

1- Class Variables - When a number of objects are created from the same class blueprint,
they each have their own distinct copies of instance variables, in this example,
we have studentId, name and address which are instance variables as each student will have
their distinct student Id, name and address, basically meaning each Student object has its
own values for these variables, stored in different memory locations.

2- Sometimes, we want to have variables that are common to all objects, example: noOfStudents
This can be accomplised using the "static" modifier to the variable. Variables/fields that
have "static" modifier in their declaration are class variables/static fields.

3- Class Variables meaning - The variable that belong to a class, rather with any object/the instance of
of a class.
Example: private static int noOfStudents;
Class variables are referenced by the class name itself, as in (this case)
ClassVariables.noOfStudents  or Student.noOfStudents

4- Every instance of a class shares a class variable, which is stored in a fixed location in memory.

5- Any object can change the value of a class variable, but class variables can also be manipulated
without creating an instance of the class.

6- You can also refer to static fields with an object reference like
myStudent.noOfStudents
but this is discouraged because it does not make it clear that they are class variables

*/
public class ClassVariables{

  //declaring variables
  String studentName, address;
  int studentId;

  //declaring class variable - using the static keyword
  private static int noOfStudents;

  //constructor - more info available in Constructor.java class
  public ClassVariables(){

  }

}
