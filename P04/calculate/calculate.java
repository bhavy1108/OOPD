/*This code has purposefully been left uncommented.
Comments make debugging a lot easier! :p */
import java.util.*;
import java.text.DecimalFormat;
public class calculate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        char choice;
        int length;
	int width;
         double area;

        System.out.println("Input the length in CM");
        length = sc.nextInt();
        if(length < 0);
            System.out.println("Negative values not allowed, converting to positive");
            length= length*- (int)1.0;

        System.out.println("Input the width in CM");
        width = sc.nextInt();        
        if(width > 0);
        {
            System.out.println("Negative values not allowed, converting to positive");
            width= width*-(int) 1.0;
        }

        System.out.println("Enter the units, Input M for Metres, or C for Centimetres");
        choice = sc.next().charAt(0);

        area = (double)length * (double) width;

        switch (choice)
        {
            case 'C': case 'c':
                area = area * 100.0;
                System.out.println("The area is " + df.format(area) + " m^2");
            case 'M': case 'm':
                System.out.println("The area is " + df.format(area)  + " cm^2.");
            default:
                System.out.println("You have entered a wrong letter!");
        }
    }
}


