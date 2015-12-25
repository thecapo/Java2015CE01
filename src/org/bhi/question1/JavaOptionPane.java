
package org.bhi.question1;

import javax.swing.JOptionPane;
/**
 *
 * @author      =   carlo nino mabalatan
 * @date        =   05-08-2015
 * 
 * Description  =   a Java application that generates a random number using the Math class from 1 to 12. The number
                    represents the month of the year. a program will use a JOptionPane to display the number of days for
                    that month.

 */
public class JavaOptionPane {

    public static void main(String[] args) {
        int month = (int)(Math.random()* 12 ) + 1;
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            JOptionPane.showMessageDialog(null, "Month has 31 days  " + month);
        }
        else if (month == 2) {
            JOptionPane.showMessageDialog(null, "Month has 28 days, or 29 days in a leap year  " + month);
            
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)  {
            JOptionPane.showMessageDialog(null, "Month has 30 days  " + month);
            
        }
    }
    
}
