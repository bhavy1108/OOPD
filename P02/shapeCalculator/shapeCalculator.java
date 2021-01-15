'.import java.util.*;
public class shapeCalculator

{
public static final double PI = 3.14;
	public static void main(String[]args)
        {

		double diameter;

	double lengthRectangle,widthRectangle,base,height;
	double aCircle,aRectangle,aTriangle;
	int aCircleInM,aRectangleInM,aTriangleInM;
	int aCircleInCm,aRectangleInCm,aTriangleInCm;
	double aCircleInMm,aRectangleInMm,aTriangleInMm;
int SelectShape;

	
        Scanner sc=new Scanner(System.in);


System.out.println("Enter one option from the following : Circle=1,Rectangle=2,Triangle=3 or Exit=4");
SelectShape = sc.nextInt();

if (SelectShape==1){

System.out.println("Enter diameter's of circle (in cm) as double.");
diameter=sc.nextDouble();
aCircle= PI * (diameter/2)*( diameter/2);
aCircleInM=(int)aCircle/10000;
aCircleInCm=(int)aCircle%10000;
aCircleInMm=(double)((aCircle-(int)aCircle)*100);

System.out.println("Area of circle is:"+aCircleInM+"msq"+aCircleInCm+"cmsq"+Math.floor(aCircleInMm*100)/100+"mmsq");
} else if ( SelectShape==2){

System.out.println("Enter Length of rectangle(in cm) as double.");
lengthRectangle=sc.nextDouble();
System.out.println("Enter width of rectangle (in cm) as double.");
widthRectangle=sc.nextDouble();

aRectangle=lengthRectangle*widthRectangle;
aRectangleInM=(int)aRectangle/10000;
aRectangleInCm=(int)aRectangle%10000;
aRectangleInMm=(double)((aRectangle-(int)aRectangle)*100);

System.out.println("Area of rectangle is:"+aRectangleInM+"msq"+aRectangleInCm+"cmsq"+Math.floor(aRectangleInMm*100)/100+"mmsq");
} else if ( SelectShape==3){

System.out.println("Enter base of triangle (cm) as double.");
base=sc.nextDouble();
System.out.println("Enter height of triangle(cm) as double.");
height=sc.nextDouble();

aTriangle=(base*height)/200;
aTriangleInM=(int)aTriangle/10000;
aTriangleInCm=(int)aTriangle%10000;
aTriangleInMm=(double)((aTriangle-(int)aTriangle)*100);

System.out.println("Area of triangle is:"+aTriangleInM+"msq"+aTriangleInCm+"cmsq"+Math.floor(aTriangleInMm*100)/100+"mmsq");
} else {


System.out.println("Good Bye :(");
}  	
        }
 	
}


		
