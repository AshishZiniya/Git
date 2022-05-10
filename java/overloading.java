

public class overloading
{
	public static void main(String[] args)
	{

		System.out.print("The Max of 3 and 4 is: "+ max1(3,4));
		
		System.out.println("\nThe Max of 3.0 and 4.0 is: "+ max2(3.0,4.0));

		System.out.println("The Max of 3.0, 4.0 and 5.0 is: "+ max3(3.0,4.0,5.0));

	}

	public static double max1(int n1,int n2)
	{
	   if(n1>n2)
	        return n1;
	   else
	        return n2;
	}

	public static double max2(double n1,double n2)
	{
	   if(n1>n2)
		 return n1;
	   else
	       return n2;
	}
	
	public static double max3(double n1,double n2,double n3)
	{
		return max2(max2(n1,n2),n3);
	}
	
}