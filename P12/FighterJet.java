import java.util.*;
public class FighterJet
{

	// specifying class field
	private static String ordnance, serialNum;
	private static int year;
	private static double wingSpan;
	
	
	public FighterJet()
	{
		serialNum = "A12345";
		year = 2019;
		ordnance = "";
		wingSpan = 12.0;
	}
	
	public FighterJet (String inSerialNum, int inYear, double inWingSpan, String inOrdnance)
	{
	 	if ((validateSerialNum(inSerialNum) == true) && (validateYear(inYear)== true) && (validateWingSpan(inWingSpan)== true))
		{
			serialNum = inSerialNum;
			year= inYear;
			wingSpan = inWingSpan;
			ordnance = inOrdnance;
		}
		else
        {
            throw new IllegalArgumentException("Invalid Import Values");
        }
	}
	
	public FighterJet (FighterJet inFighterJet)
	{
		serialNum = inFighterJet.getSerialNum();
		year = inFighterJet.getYear();
		wingSpan = inFighterJet.getWingSpan();
		ordnance = inFighterJet.getOrdnance();
	}
	
	public FighterJet clone()
	{
		FighterJet cloneFighterJet;
		cloneFighterJet = new FighterJet(this.serialNum, this.year, this.wingSpan, this.ordnance);
		return cloneFighterJet;
	}
	
	public String getSerialNum()
	{
		return serialNum;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getWingSpan()
	{
		return wingSpan;
	}
	
	public String getOrdnance()
	{
		return ordnance;
	}
	
	public boolean equals (Object inObj) 
	{
		boolean same = false;
		if (inObj instanceof FighterJet)
		{
			FighterJet inFighterJet = (FighterJet) inObj;
			if ((serialNum.equals(inFighterJet.getSerialNum())) && (year == inFighterJet.getYear()) && (ordnance.equals(inFighterJet.getOrdnance())) && (Math.abs(wingSpan - inFighterJet.getWingSpan())<0.001))
				same = true;							
		}
		return same;
	}
	
	public String toString()
	{
		return ("Serial number: " + serialNum + ", current year: "+ year + ", Wing span: " + wingSpan + ", ordnance: " + ordnance);
		
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
	
	public void setWingSpan(double inWingSpan)
	{
		if (validateWingSpan(inWingSpan) == true)
		{
			wingSpan = inWingSpan;
		}
		else
        {
            throw new IllegalArgumentException("Invalid maximum depth");
        }
	}
	
	public void setOrdnance (String inOrdnance)
	{
			
			if (validateOrdnance(inOrdnance) == true)
			{
				ordnance = inOrdnance;
			}
			else
			{
				throw new IllegalArgumentException("Invalid ordnance");
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
	
	private boolean validateWingSpan(double inWingSpan)
	{
		boolean valid = false;
		if (inWingSpan >= 2.20 && inWingSpan <= 25.6)
		{
			valid = true;
		}
		else
		{
			throw new IllegalArgumentException("Invalid wing span");
		}
		return valid;
	
	}
	
	private boolean validateOrdnance(String inOrdnance)
	{
		boolean valid = false;
		if (inOrdnance != null)
		{
			valid = true;
		}
		else
		{
			throw new IllegalArgumentException("Invalid ordnance");
		}
		return valid;
	}
}
	
	
	
	
	
	
	
	
	
	
