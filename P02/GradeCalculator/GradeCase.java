/**
* Worksheet 2: GradeCase
*/

//Importing all utilities
import java.util.*;

// creation of class
public class GradeCase


{
//Creating the main method
	public static void main(String[]args)
	{
// Declaration of all appropriate variables
		

double mark, mark1;
String solution="";


	
// Declaration of scanner to enable input from user
	
        Scanner sc=new Scanner(System.in);


// User are being prompt to input the mark


System.out.println("Enter the mark of student:");

mark= sc.nextDouble();

switch((int) mark1/10)
{
// Conditions for the grade
	case 0: 

 
solution = new string ("F" + (int) mark);

break;
case 1:
solution = new string ("F" + (int) mark);
break;
case 2:
solution = new string ("F" + (int) mark);
break;
case 3:
solution = new string ("F" + (int) mark);
break;
case 4;
solution = new string ("F" + (int) mark);
break;
case 5:


solution = new string ("P-5");
break;
case 6:
 
solution = new string ("C-6");
break;
case 7 :

solution = new string ("D-7");
break;

case 8 :



solution = new string ("HD-8");
break;
case 9 :


solution = new string ("HD-9");
break;
case 10 :
if (mark==10){
	
solution = new string ("HD-10");}
else{
	solution = new string  ("Invalid");}


break;
}

System.out.println( solution );
  	
        }
 	
}



