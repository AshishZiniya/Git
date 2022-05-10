//computing area with inputing in console and constant value(PI).

import java.util.Scanner;
public class ComputeArea 
{

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	  
	  final double PI = 3.14159;  

	  System.out.print("Enter the radius : ");
	  double Redius = scan.nextDouble();

	  double Area = (Redius) * (Redius) * (PI);
	  System.out.print("The Area of Circle is : " + Area);
    }
}