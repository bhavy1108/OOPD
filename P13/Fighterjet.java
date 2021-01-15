import java.util.*;
public class Fighterjet
{
	private double serialNum;
	private String ordanace;
	private int year;
	private double wingspan;
	private engine objengine;
	public Fighterjet()
	{
             serialNum = 125.925;
	     year = 2016;
	     ordanace = "1";
	     wingspan  = 17.0;
	     objengine = new engine ();
	}
	 
	public Fighterjet(Fighterjet inFighterjet)
	{
		serialNum = inFighterjet.getSerialNum();
		year = inFighterjet.getYear();
		ordanace = inFighterjet.getordanace();
		wingspan = inFighterjet.getwingspan();
		objengine = inFighterjet.getengine();
	}

	public Fighterjet(double inSerialNum, int inYear, String inordanace, double inwingspan, engine inengine)
	{
		if (((validateSerialNum(inSerialNum)) && (validateYear(inYear))) && ((validateordanace(inordanace)) && (validatewingspan(inwingspan ))) && (validateEngine(inengine)))
		{
			serialNum = inSerialNum;
			year = inYear;
			ordanace = inordanace;
			wingspan = inwingspan;
			objengine = inengine;  
		}
		else {
			throw new IllegalArgumentException("Invalid Values");
		}
	}

	public  double getSerialNum()
	{
	  return serialNum;
	}
	
	public int getYear()
	{
	 return year;
	}
	
	public String getordanace()
	{
	 return ordanace;
	}
	
	public engine getengine()
	{
	 return objengine;
	}
	
	public double getwingspan ()
	{
	 return wingspan ;
	}
	
	public void setSerialNum(double inSerialNum)
	{
	 if (validateSerialNum(inSerialNum))
	  {
	   serialNum = inSerialNum;
	  }
	   else
	   {
	    throw new IllegalArgumentException("Invalid SerialNum");
	   }
	}
	
	public void setYear(int inYear)
	{
	 if (validateYear(inYear))
	 {
	  year = inYear;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid Year");
	 }
	}
	
	public void setordanace(String inordanace)
	{
	 if (validateordanace(inordanace))
	 {
	 ordanace = inordanace;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid hull");
	 }
	}
	
	public void setwingspan (double inwingspan )
	{
	 if (validatewingspan (inwingspan ))
	 {
	  wingspan = inwingspan ;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid maxDepth");
	 }
	}
	
	public void setengine (engine inengine)
	{
	 if(validateEngine(inengine))
	 {
	  objengine = inengine;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid engine");
	 }
	}
	
	public Fighterjet clone()
	{
	 Fighterjet cloneSC;
	  cloneSC = new Fighterjet (this.serialNum, this.year, this.ordanace, this.wingspan, this.objengine );
	  return cloneSC;
	}
	
	public boolean equals(Object inObj)
	{
	 boolean same = false;
	 if (inObj instanceof Fighterjet)
	 {
	  Fighterjet inFighterjet = (Fighterjet) inObj;
	  if (serialNum == inFighterjet.getSerialNum())
	     if (year == inFighterjet.getYear())
	       if (ordanace.equals(inFighterjet.getordanace()))
	         if (Math.abs(wingspan  - inFighterjet.getwingspan ()) < 0.001)
	           if(objengine.equals(inFighterjet.getengine()))
	           same = true;
	 }
	 return same;
	}
	
	public String toString ()
	{
	  return ("SerialNum: "+ serialNum + " current year: "+ year +" ordanace: " + ordanace +" wingspan  " + wingspan +"engine"+ objengine.toString());
	}  
	  
	private boolean validatewingspan (double inwingspan )
	{
	   return ((inwingspan >=2.20) &&(inwingspan  <= 25.6)) ;
	}  
	
	private boolean validateordanace(String inordanace)
	{
	   return (inordanace!= "");
	}
	
	private boolean validateYear(int inYear)
	{
	  return ((inYear >= 1950) && (inYear<= 2022));
        }
        
        private boolean validateSerialNum(double inSerialNum)
        {
           String lines;
	lines = (" "+ inSerialNum);
	int count = lines.length();
	if (count != 8)
	{
	 System.out.println("Invalid format");
	}
          return ((inSerialNum>=100.001)&&(inSerialNum<= 300.999));
        }
        
        private boolean validateEngine(engine inengine)
        {
           return ( ((inengine.getcyclinder() >= 2) && (inengine.getcyclinder()<= 20)) && ((inengine.getfuel() != null)) );
        }
}
    
   

