
package org.bhi.question3;

/**
 *
 * @author                      =       cawo
 * @date                        =       05-08-2015
 * 
 * Description                  =       The class will use the Math class to create a random
                                        number from 1 to 50 inclusive. It will then post if it is odd or even.

 */
public class OddOrEven {

    public static void main(String[] args) {
       int number = (int)(Math.random()*50)+1;
       
       if (number % 2 == 0 ) {
           System.out.println("The Number is EVEN   " + number);
       }
       else
           {
           System.out.println("The Number is ODD   " + number); 
                   }
       }
    }
    

