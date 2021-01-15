import java.util.*;
public class MyFirstJavaApplication
{
   public static void main( String [] args)
   {
     int numOne, numTwo, sum;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 1st number");
     numOne = sc.nextInt(); 
     System.out.println("Enter 2nd number");
     numTwo = sc.nextInt();
     

     sum = numOne + numTwo;

     System.out.println("Sum is " + sum);
   }
}
