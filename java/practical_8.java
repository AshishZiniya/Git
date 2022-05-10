import java.util.Scanner;
public class practical_8
{
 public static void main(String[] args) 
 {
  int D=2;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Integer Value : ");
  int number = input.nextInt();
  while(number > 1)
  {
   if(number%D==0)
   {
    System.out.print(D+",");
    number=number/D;
   }
   else
   {
    D++;
   }
  }
 }

}