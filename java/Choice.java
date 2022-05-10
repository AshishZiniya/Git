import java.util.Scanner;

class Choice
{
	public static void main(String []args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number=");
		i = sc.nextInt();
		switch(i)
		{
			case 1 : System.out.print("You have inputted 1.");
				 break;
			case 2 : System.out.print("You have inputted 2.");
				 break;
			default: System.out.print("You have inputted other than 1 & 2.");
		}
	}
}