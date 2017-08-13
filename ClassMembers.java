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
*ClassMembers.java
*Purpose: Understanding Class Members - are variable, methods and constants that
belong to a class and their value is stored in a fixed location in memory, regardless
of how many instances/objects of the class exits.
*Note: Class to refer/look for - ClassVariables.java, ClassMembers.java, Constants.java
*Date: 13 August 2017 | 3:54 pm | Dublin,Ireland
*/

public class ClassMembers{

  //1- declaring class variables
  private static int noOfTeachers = 34; //Refer to ClassVariables.java class for detailed explanation
  private static String schoolName = "National Public School";
  /*example: here we, will create an object/instance of ClassVariables.java class and manipulate
  the value of its class variable*/


  //2-declaring class methods
  public static int getNoOfTeachers(){
    return noOfTeachers;
  }

  public static String getSchoolName(){
    return schoolName;
  }

  //3- constant
  

  //constructor - more info available in Constructor.java class
  public ClassMembers(){

  }

public static void main(String[] args) {
  System.out.println("Number of Students: " +ClassVariables.noOfStudents);
  System.out.println("Number of Kids: " +ClassMethods.getNoOfKids()+ "\n");

  System.out.println("Number of teachers: " +ClassMembers.getNoOfTeachers());
  System.out.println("School Name: " +ClassMembers.getSchoolName());
}
}
