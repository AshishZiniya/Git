//Solve Equation by cramer's rule
import java.util.Scanner;

public class practical_2
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double a,b,c,d,e,f,X,Y;

		System.out.println("Vlue From Eqation 1 ");

		System.out.print("Enter a value of a : ");
		a = Input.nextDouble();

		System.out.print("Enter a value of b : ");
		b = Input.nextDouble();

		System.out.print("Enter a value of e : ");
		e = Input.nextDouble();

		System.out.println("Vlue From Eqation 2 ");

		System.out.print("Enter a value of c : ");
		c = Input.nextDouble();

		System.out.print("Enter a value of d : ");
		d = Input.nextDouble();

		System.out.print("Enter a value of f : ");
		f = Input.nextDouble();
		
		X = ((e*d) - (b*f)) / ((a*d) - (b*c));

		Y = ((a*f) - (e*c)) / ((a*d) - (b*c));

		System.out.println("X = " + X + "Y = " + Y);
	}
}