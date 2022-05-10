import java.util.Scanner;
public class practical_06
{

 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter a Character : ");
 
  char ch =  input.next().charAt(0);
  
  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
  {
   System.out.println(ch + " is vovel");
  }
  else
  {
   System.out.println(ch + " is consonant");
  }
 }
}