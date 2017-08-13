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
*ClassMethods.java
*Purpose: This class helps understand the concept of class methods
*Date: 13 August 2017 | 5:05 pm | Dublin,Ireland
*/

/*Explanation: https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html

Please refer to ClassVariables.java class or ClassMembers.java class, to get better
Understanding about whats going on in this class.

1- Java, supports static methods as well as static variables (explained in ClassVariables.java class).
Static methods, which have the static modifier in their declarations, should be
invoked with the class name, without the need for creating an instance of the class,
Syntax: ClassName.methodName(parameters);

2- You can also refer to static methods with an object reference like this:
Syntax: instanceName.methodName(parameters);
but this is discouraged because it does not make it clear that they are class methods.

3- A common use for static methods is to access static fields

4- Not all combinations of instance and class variables and methods are allowed:

- Instance methods can access instance variables and instance methods directly.
- Instance methods can access class variables and class methods directly.
- Class methods can access class variables and class methods directly.
- Class methods cannot access instance variables or instance methods directly—they
must use an object reference. Also, class methods cannot use the this keyword as
there is no instance for this to refer to.

*/
public class ClassMethods{





}
