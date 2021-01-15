import java.util.*;
public class Engine
{
	// constants specification
	public static final String BATTERY = "BATTERY";
	public static final String DIESEL = "DIESEL";
	public static final String BIO = "BIO";
	
       // class fields
	private static String fuel;
	private static int cylinders;
	
	
	
	public Engine()
	{
		fuel = "";
		cylinders = 0;
		
	}
	
	
	public Engine (String inFuel, int inCylinders)
	{
	 	if ((validateFuel(inFuel) == true) && (validateCylinders(inCylinders)== true))
		{
			fuel = inFuel;
			cylinders= inCylinders;
			
		}
		else
        {
            throw new IllegalArgumentException("Invalid Import Values");
        }
	}
	
	public Engine (Engine inEngine)
	{
		fuel = inEngine.getFuel();
		cylinders = inEngine.getCylinders();
		
	}
	
	public Engine clone()
	{
		Engine cloneEngine;
		cloneEngine = new Engine(this.fuel, this.cylinders);
		return cloneEngine;
	}
	
	public String getFuel()
	{
		return fuel;
	}
	
	public int getCylinders()
	{
		return cylinders;
	}
		
	public boolean equals (Object inObj) 
	{
		boolean same = false;
		if (inObj instanceof Engine)
		{
			Engine inEngine = (Engine) inObj;
			if ((fuel.equals(inEngine.getFuel())) && (cylinders == inEngine.getCylinders()))
				same = true;							
		}
		return same;
	}
	
	public String toString()
	{
		return ("Fuel: " + fuel + ", cylinders: "+ cylinders);
		
	}
	
	public void setFuel (String inFuel)
	{
		if (validateFuel(inFuel) == true)
		{
			fuel = inFuel;
		}
		else
        {
            throw new IllegalArgumentException("Invalid fuel");
        }	
	}
	public void setCylinders (int inCylinders)
	{
		  if (validateCylinders(inCylinders) ==true)
		  {
		   	cylinders = inCylinders;
		  }
		  else
      	  {
      	      throw new IllegalArgumentException("Invalid number");
      	  }
		
	}
	
	

	private boolean validateFuel(String inFuel)
	{
		boolean valid = false;
		inFuel = inFuel.toUpperCase();
		if ((inFuel.equals(DIESEL)) || (inFuel.equals(BATTERY)) || (inFuel.equals(BIO)))
		{
			valid = true;
		}
		else
        {
            throw new IllegalArgumentException("Invalid fuel");
        }
		return valid;
	}
	
	private boolean validateCylinders(int inCylinders)
	{
		boolean valid = false;
		if (inCylinders >= 2 && inCylinders <= 20)
		{
			valid = true;
		}
		else
		{
			throw new IllegalArgumentException("Invalid number of cylinders");
		}
		return valid;
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
