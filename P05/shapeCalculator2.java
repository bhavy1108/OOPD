import java.util.*;

public class shapeCalculator2
{
      public static int msq;
      public static int cmsq;
      public static double mmsq;

	public static void main (String[]args)

	{
		double PI = 3.14;
		int option;
		double diameter;
		double lengthRectangle,widthRectangle,base,height;
		double aCircle,aRectangle,aTriangle;
                Scanner Sc = new Scanner(System.in);

		System.out.println("Choose and Enter ONE Option from the following: Circle = 1 ,Rectangle = 2, Triangle = 3, or Exit = 4");
                 
                 option = Sc.nextInt();

		// USING CASE STATEMENT 

		switch(option)

		{
			case 1: 


                                System.out.println ("Enter diameter of circle");
		                diameter = Sc.nextDouble();
				double areaCirc = CalculateAreaCircle (diameter);
				AreaConversion (areaCirc);

				System.out.println( "Area of circle is:" + msq +"m^2," + cmsq +"cm^2," +Math.floor(mmsq*100)/100 + "mm^2,");

				break;

			case 2:

				System.out.println ("Enter length of Rectangle");
		                lengthRectangle = Sc.nextDouble();

				System.out.println ( "Enter width of Rectangle");
			         widthRectangle  = Sc.nextDouble();
                         
			        double areaRec = CalculateAreaRectangle (lengthRectangle, widthRectangle);
				AreaConversion (areaRec);


				System.out.println ( "Area of rectangle is: " + msq +"m^2," + cmsq +"cm^2," +Math.floor(mmsq*100)/100 + "mm^2,");

				break;

			case 3:

				System.out.println ("Enter base of Triangle");
                                 base = Sc.nextDouble();

				System.out.println ("Enter height of Triangle");
				height = Sc.nextDouble();

				double areaTri = CalculateAreaTriangle (base, height);
				AreaConversion (areaTri);

				System.out.println ("Area of triangle is:" + msq +"m^2," + cmsq +"cm^2," +Math.floor(mmsq*100)/100 + "mm^2,");
				break;

			default:

				// OUTPUT
				System.out.println ( "Good Bye");

				

		}
	}


	// Create submodule for CalculateAreaCircle

	//SUBMODULE CalculateAreaCircle
	//IMPORT diameter 
	//EXPORT areaCirc :double

	public static double CalculateAreaCircle( double d )

	{ 

		// declare areaCircle as double

		double areaCirc;

		areaCirc =  (3.14) * ( d/2) * (d/2);

		return areaCirc;

	}



	// Create submodule for CalculateAreaRectangle

	//SUBMODULE CalculateAreaRectangle
	//IMPORT lengthRectangle , widthRectangle
	//EXPORT areaRec :double

	public static double CalculateAreaRectangle( double L , double W )

	{
               //  declare areaRec as double

		 double areaRec;

		areaRec = L* W;

		return areaRec;

	}



	// create  submodule for CalculateAreaTriangle

	//SUBMODULE CalculateAreaTriangle
	//IMPORT base , height
	//EXPORT areaTri

	public static double CalculateAreaTriangle(double B , double H)

	{
          // declare areaTri as double


		double areaTri;

		areaTri = ((B/10) * (H/10))/2;

		return areaTri;

	}



	// Create submodule for AreaConversion

	//SUBMODULE AreaConversion
	//IMPORT areaCirc , areaRec , areaTri
	//EXPORT

	public static void AreaConversion(double area)

	{

		msq  = (int) area/10000;
 
		cmsq = (int) area % 10000;

		mmsq = ((double) (area - (int)area)* 100);

	} 
}
