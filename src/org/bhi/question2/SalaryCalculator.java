
package org.bhi.question2;

/**
 *
 * @author              =   carlo nino mabalatan
 * @date                =   05-08-2015
 * 
 * Description          =   This class will calculate the salary of a teacher given the number of hours
                            worked. Using the Java Math class to generate a random number from 51 to 100 to represent the hours
                            worked by the sessional teacher.

 */
public class SalaryCalculator {

    public static void main(String[] args) {
      final float SESSIONAL_SALARY = 78.90f;
      
      int number = (int)(Math.random()*50)+51;
      
      float salary = (float)(SESSIONAL_SALARY*number);
      
        System.out.println("The Salary of an Average TAFE teacher is: " + salary);
    }
    
}
