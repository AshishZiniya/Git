import java.util.Scanner;

public class GCD{

 public static void main(String []args){
	
	int num1, num2, gcd = 0;
	Scanner sc = new Scanner(System.in);  
	
	System.out.print("Enter num1 : ");  
	num1 = sc.nextInt();     
	
	System.out.print("Enter num2 : ");  
	num2 = sc.nextInt();

	gcd = GCD(num1, num2);
	System.out.println("GCD of " + num1 + " and " + num2 + " =  " + gcd);  
 }

 public static int GCD(int num1, int num2){
	if(num1 == 0){
		return num2;
	}
	else if(num2 == 0){
		return num1;
	}
	else{
		int reminder = num1 % num2;
		return GCD(num2 , reminder);
	}
 }
}