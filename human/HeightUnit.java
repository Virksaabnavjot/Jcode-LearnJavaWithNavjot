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
*HeightUnit.java
*Purpose: Defines all the available measurement units for height in this project.
*Date:7/August/2017
*/

package human;

public class HeightUnit{

  //declaring variables
  int feet, inches, centemeters;
  double meters;
  //HeightUnit unit;
  Height height;

  public HeightUnit(){
    //default constructor/look for Constructor.java class for more info on java constructors
  }


  //setters

  //set height in feet
  public void setHeightInFeet(int feet, int inches){
    this.feet = feet;
    this.inches = inches;
  }

  //set height in inches
  public void setHeightInInches(int inches){
    this.inches = inches;
  }

  //set height in meters
  public void setHeightInMeters(double meters){
    this.meters = meters;
  }

  //set height in centemeters
  public void setHeightInCentemeters(int centemeters){
    this.centemeters = centemeters;
  }


  //getters
  public Height getHeightInFeet(){
    return Height(int feet, int inches);
  }
  //get height in feet

  //conversions
  //convert from feet to inches

  //convert from feet to meters

  //convert inches to feet

  //convert meters to feet

  //convert to centemeters


}
