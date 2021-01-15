/**
* Worksheet 2: GradeCalculator
*/

//Importing all utilities
import java.util.*;

// creation of class 
public class GradeCalculator

{

//Creating the main method
	public static void main(String[]args)
        {
// Declaration of all appropriate variables
		

double mark;

	
// Declaration of scanner to enable input from user
	
        Scanner sc=new Scanner(System.in);


// User are being prompt to input the mark


System.out.println("Enter the mark of student:");

mark= sc.nextDouble();


// Conditions for the grade
if ((int )mark < 0 )
{
 
System.out.println("Invalid");
}else if (( int) mark >=0 && (int)mark<50){

System.out.println("F" + (int)mark);
}else if ((int)mark >= 50 && (int)mark<60){
System.out.println("P-5");

}else if ((int)mark >= 60 && (int)mark<70){

System.out.println("C-6");
}else if ((int)mark >= 70 && (int)mark<80){


System.out.println("D-7");

}else if ((int)mark >= 80 && (int)mark<90){

System.out.println("HD-8");

}else if ((int)mark >= 90 && (int)mark<100){

System.out.println("HD-9");

}else if ((int)mark==100){

System.out.println("HD-10");

} else 


{
System.out.println("Invalid");
}


}
}
