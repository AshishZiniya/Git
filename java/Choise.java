import java.util.Scanner;
class Choise
{
	public static void main(String []args)
	{
		int i=0;
		Scanner sc = new Scanner(System.in);
		while(i!=3)
		{
			System.out.print("Enter any number=");
			i = sc.nextInt();
			switch(i)
			{
				case 1 : System.out.print("You have inputted 1.");
					 break;
				case 2 : System.out.print("You have inputted 2.");
					 break;
				case 3 : System.out.print("You have inputted 3. Loop will be terminated.");
					 break;
				default: System.out.print("You have inputted other than 1 & 2.");
			}
		}
	}
}