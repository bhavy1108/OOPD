//Importation of exixting libraries
import java.util.*;

// creation of class
public class DivisionChecker
{
// Creation of the main method
	public static void main(String[]args)
        {

  //Declaration of all variables
	
	
	int num1 , num2;

//Declaration of scanner
	

	
        Scanner sc=new Scanner(System.in);

//Inputs)
System.out.println("Enter  the  Numerator(num1)");
num1 = sc.nextInt();



System.out.println("Enter the Denominator(num2)");

num2 = sc.nextInt();

//check if num2 is not zero

 if ( num2==0)
{

System.out.println("Divide by zero not possible ");
System.exit(0);
}

else if(num1%num2==0)
{

System.out.println(" num1 is divisible by num2");

} 

else 

{
System.out.println("num1 is not divisible by num2");

}  	
        }
 	
}


		
