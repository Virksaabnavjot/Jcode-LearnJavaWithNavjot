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
*Height.java
*Purpose: Allows to recieve height in 2 different mesurements - 1 -Feet & inches
 and 2: Meters, and allows to convert them to inches, centemeters or other unit
 if feet convert to meters or convert from meters to feet
*Date:7/August/2017
*/

package human;

public class Height{

  //declaring variables
  int feet, inches, centemeters;
  double meters;
  //HeightUnit unit;

  //Note: Refer to Constructor.java class for detailed info on java constructors
  //default constructor
  public Height(){
    //takes no arguments
  }

  //parametrised constructor - to take feet and inches values
  public Height(int feet, int inches){
    //this.unit = "feet";
    this.feet = feet;
    this.inches = inches;
  }

  //constructor to meters value
  public Height(double meters){
    this.meters = meters;
  }



}
