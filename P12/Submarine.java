

import java.util.*;
public class Submarine
{
	
	public static final String STEEL = "STEEL";
	public static final String ALLOY = "ALLOY";
	public static final String TITANIUM = "TITANIUM";
	
	private static String hull, serialNum;
	private static int year;
	private static double maxDepth;
	
	
	public Submarine()
	{
		serialNum = "A12345";
		year = 2019;
		maxDepth = 10.0;
		hull = "";
	}
	
	public Submarine (String inSerialNum, int inYear, double inMaxDepth, String inHull)
	{
	 	if ((validateSerialNum(inSerialNum) == true) && (validateYear(inYear)== true) && (validateMaxDepth(inMaxDepth)== true) && (validateHull(inHull) == true))
		{
			serialNum = inSerialNum;
			year= inYear;
			maxDepth = inMaxDepth;
			hull = inHull;
		}
		else
        {
            throw new IllegalArgumentException("Invalid Import Values");
        }
	}
	
	public Submarine (Submarine inSubmarine)
	{
		serialNum = inSubmarine.getSerialNum();
		year = inSubmarine.getYear();
		maxDepth = inSubmarine.getMaxDepth();
		hull = inSubmarine.getHull();
	}
	
	public Submarine clone()
	{
		Submarine cloneSubmarine;
		cloneSubmarine = new Submarine(this.serialNum, this.year, this.maxDepth, this.hull);
		return cloneSubmarine;
	}
	
	public String getSerialNum()
	{
		return serialNum;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getMaxDepth()
	{
		return maxDepth;
	}
	
	public String getHull()
	{
		return hull;
	}
	
	public boolean equals (Object inObj) 
	{
		boolean same = false;
		if (inObj instanceof Submarine)
		{
			Submarine inSubmarine = (Submarine) inObj;
			if ((serialNum.equals(inSubmarine.getSerialNum())) && (year == inSubmarine.getYear()) && (hull.equals(inSubmarine.getHull())) && (Math.abs(maxDepth - inSubmarine.getMaxDepth())<0.001))
				same = true;							
		}
		return same;
	}
	
	public String toString()
	{
		return ("Serial number: " + serialNum + ", current year: "+ year + ", maximum depth: " + maxDepth + ", hull type: " + hull);
		
	}
	
	public void setSerialNum (String inSerialNum)
	{
		if (validateSerialNum(inSerialNum) == true)
		{
			serialNum = inSerialNum;
		}
		else
        {
            throw new IllegalArgumentException("Invalid serial number");
        }	
	}
	public void setYear (int inYear)
	{
		  if (validateYear(inYear) ==true)
		  {
		   	year = inYear;
		  }
		  else
      	  {
      	      throw new IllegalArgumentException("Invalid year");
      	  }
		
	}
	
	public void setMaxDepth(double inMaxDepth)
	{
		if (validateMaxDepth(inMaxDepth) == true)
		{
			maxDepth = inMaxDepth;
		}
		else
        {
            throw new IllegalArgumentException("Invalid maximum depth");
        }
	}
	
	public void setHull (String inHull)
	{
		if ((validateHull(inHull)) == true)
		{
			hull = inHull;
		}
		else
        {
            throw new IllegalArgumentException("Invalid hull type");
        }
	}
	

	private boolean validateSerialNum(String inSerialNum)
	{
		boolean valid = false;
		String firsthalf ="", secondhalf="";
		int digit1 =0, digit2 =0;
		
		if (inSerialNum.length() ==7)
		{
			for (int i =0; i <3; i++)
			{
				firsthalf = firsthalf + inSerialNum.charAt(i);
			}
			for (int i =4; i <7; i++)
			{
				secondhalf = secondhalf + inSerialNum.charAt(i);
			}
			digit1 = Integer.parseInt(firsthalf);
			digit2 = Integer.parseInt(secondhalf);
			if ((digit1 >= 100 && digit1 <= 300) && (digit2 >= 1 && digit2 <=999))
			{
				valid = true;
			}
			else
			{
				throw new IllegalArgumentException("Invalid serial number");
			}
		}
		return valid;
	}	
	
	private boolean validateYear(int inYear)
	{
		boolean valid = false;
		if (inYear >= 1950 && inYear <= 2022)
		{
			valid = true;
		}
		else
		{
			throw new IllegalArgumentException("Invalid year");
		}
		return valid;
	
	}
	
	private boolean validateMaxDepth(double inMaxDepth)
	{
		boolean valid = false;
		if (inMaxDepth >= -500.0 && inMaxDepth <= 0.0)
		{
			valid = true;
		}
		else
		{
			throw new IllegalArgumentException("Invalid maximum depth");
		}
		return valid;
	
	}
	
	private boolean validateHull(String inHull)
	{
		boolean valid = false;
		inHull = inHull.toUpperCase();
		switch (inHull)
		{
			case STEEL: case ALLOY: case TITANIUM:
				valid = true;
			break;
			default:
				throw new IllegalArgumentException("Invalid hull type");
			
		}
		return valid;
	}
}
	
	
	
	
	
	
	
	
	
	





