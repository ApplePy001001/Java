// This program calculates annual pay.
package paycalculator;

import java.util.Scanner;  


public class PayCalculator
{
   public static void main(String[] args)
   {
                              
      double regHours;      // Amount of pay each period 
      double regRate;     // Number of pay periods in a year
      double otHours;      // Calculated total annual pay
      double otRate;      // Bonus percentage rate
      double gRegPay;       // Calculation of annual pay using bonusRate
      double gOtPay;       // Annual pay + bonus pay
      double gPay;
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      // Ask the user to enter the number of regular working hours.
      System.out.print("How many regular hours did you work?: ");
      regHours = keyboard.nextDouble();
      
      // Get the number of pay periods per year.
      System.out.print("What is your regular pay rate per hour?: ");
      regRate = keyboard.nextDouble();
      
      // Get the bonus percentage rate.
      System.out.print("How many overtime hours did you work?: ");
      otHours = keyboard.nextDouble();
      
      System.out.println("What is your overtime pay rate per hour?: ");
      otRate = keyboard.nextDouble();
      
      // Calculate the compensation for the user.
      
      gRegPay = regHours * regRate;
      gOtPay = otHours * otRate;
      gPay = gRegPay + gOtPay;
      
      System.out.println("Your regular gross pay is: " + gRegPay);
      System.out.println("Your overtime gross pay is: " + gOtPay);
      System.out.println("Your total gross pay is: " + gPay);
   }
}
