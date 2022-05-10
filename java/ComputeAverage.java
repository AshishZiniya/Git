//compute average with three nos

import java.util.Scanner;
public class ComputeAverage 
{

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();
	  
	  double avg = (num1+num2+num3)/3;

        System.out.print("The average of entered numbers is:" + avg );
    }
}