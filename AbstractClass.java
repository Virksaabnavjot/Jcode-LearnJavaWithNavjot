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
*AbstractClass.java
*Purpose: To help understand the meaning and benifits of an abstract class in java
*Date:10/August/2017 | 5:13pm / Dublin,Ireland
*/

abstract class AbstractClass{
  /*Explanation: Abstract Class in Java (Hindi) https://www.youtube.com/watch?v=bIQMuFPgKpM
  1- Abstract classes are used to declare common characterstics of subclasses
  Example: Person (Abstract Class) -> Student and Teacher (Subclasses), can
  declare the common characterstics like name, age, phone etc of student and teacher
  in a person class, so that we dont have to write the same code again and again.
  In Java, its not possible to create an object of an abstract class (because it won't
  be of any use why would we create an object of person class with no purpose and just
  name, age, phone etc and not represent anything), thats why we use "abstract" keyword
  to make classes abstract so that no one even by mistake can create an instance of that
  class, instead we can extend the class or create a referance variable of the class
  Usage Example:
  Inheritance :public class Student extends Person{}
  Referance variable: Person p = new Student();

  2- Abstract class can only be used as a superclass for other classes that extend it.

  3- Like any other class, abstract class can contain field that describe the
  characterstics and method that describe the actions that a class can perform.
  */

  //declaring variables
  String name, address, phone;
  int age;

  //abstract method - more Explanation available in AbstractMethod.java class
  abstract void showAllDetails();

  //implemented methods
  void showNameAndAddress(){
    name = "Navjot";
    address = "Apt. 14 Henrie...., Ireland";
    System.out.println("Name: " +name+ "\n" + "Address: " +address);
  }
}

class LetsTryExtendingAbstractClass extends AbstractClass{

void showAllDetails(){
  name = "Navjot";
  address = "Apt. 14 Henrie...., Ireland";
  phone = "+35389211....";
  age = 22;
  System.out.println("Name: " +name+ "\n" + "Address: " +address+ "\n" + "Phone: "
  +phone+ "\n" + "Address: " +address);
}

}

class MakeUse{
  public static void main(String[] args) {
    LetsTryExtendingAbstractClass l = new LetsTryExtendingAbstractClass();
    l.showAllDetails();
    l.showNameAndAddress();
  }
}
