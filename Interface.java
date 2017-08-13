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
*Interface.java
*Purpose: To learn to use interface in java and understand the meaning of it.
*Date: 13/August/2017 | Sunday | 00:22 am (Dublin,Ireland)
*/

/*Explanation: What is Interface ? Why use it? How to make use of it ? How to implement it?
http://tutorials.jenkov.com/java/interfaces.html

Interface (meaning - interact with )

1-Interface just specify the method declaration (implicitly public and abstract)
Example: public void greetings();

2-We dont really have to write the "public" keyword as all the methods of
an interface are public by default.
Example: void greetings(); is also correct.

3-Interface can only contain fields which are (implicitly public static final)
Example: public static final String name = "Navjot";

or

String name = "Navjot"; is also correct and its (public static and final by default
so, we dont really need to write these).

4- An Interface like an abstract class cannot be instantiated (meaning we cant create
objects of an interface).

5- An Interface do not have a constructor (as we cant create object what do we need
constructor for?).

6- If a class that implements an interface doesn't implement/define all the methods
of that interface, then that class must be declared as an abstract class and method
declerations must be provided by the subclasses that extent the abstract class.

*/

public interface Interface{

  /*Variables - Syntax: dataType variableName = value;
  (both the variables below are public, static and final by default either
  we write public static final or not)
  */
  public static final String firstName = "Navjot";
  String lastName = "Singh";


  /*Methods - Syntax: returnType methodName(parameters);
  methods are abstract and public by default no matter we add public or not its
  the same thing.
  */
  public void greetings();
  int guessAge(int age);

}
