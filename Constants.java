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
*Constants.java
*Purpose: Helps understand how to declare constants in java and use them.
*Note: Refer to ClassMembers.java class to learn about other class members like constants.
*Date: 13 August 2017 | 5:05 pm | Dublin,Ireland
*/

/*Explanation: https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html

1- Constants are class members

2- The static modifier, in combination with the final modifier, is also used to define constants.
The final modifier indicates that the value of this field cannot change.
Syntax: acessModifier staic final dataType CONSTANTNAMEINCAPITALLETTERS = value;

3- Constants defined in this way cannot be reassigned, and it is a compile-time error if your program tries to do so.

4- By convention, the names of constant values are spelled in uppercase letters.
If the name is composed of more than one word, the words are separated by an underscore (_).

*/

public class Constants{

  public static final String URL = "https://navsingh.org.uk";
  public static final int RESPONSE_TIME = 3; // 3 seconds

}
