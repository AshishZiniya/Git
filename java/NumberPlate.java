import java.util.Scanner;

public class NumberPlate
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);

		System.out.print("Enter Uppercase letter: ");
		String uc=in.nextLine();
		
		if(uc.length()>3)
		{
			System.out.println("Error 401...............\nYou enter morethan three Uppercase letter...");
		}

		System.out.print("Enter min range : ");
		int min=in.nextInt();

		System.out.print("Enter max range : ");
		int max=in.nextInt();

		System.out.print("Enter number : ");
		int n=in.nextInt();

		if(n>max || n<min )
		{
			System.out.println("Error 402..............\nYou enter wrong number...");
		}
		else
		{
			System.out.print(uc+"-");
			if(n<10)
			{
				System.out.print("000"+n);	
			}
			else if(n<100)
			{
				System.out.print("00"+n);
			}
			else if(n<1000)
			{
				System.out.print("0"+n);
			}
			else
			{
				System.out.print(""+n);
			}
		}
	}
}