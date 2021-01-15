import java.util.*;
public class Submarin
{
	private double serialNum;
	private String hull;
	private int year;
	private double maxDepth;
	private engine engine;
	public Submarin()
	{
             serialNum = 125.925;
	     year = 2016;
	     hull = "";
	     maxDepth = 17.0;
	     engine = new engine();
	}
	 
	public Submarin(Submarin inSubmarine)
	{
		serialNum = inSubmarine.getSerialNum();
		year = inSubmarine.getYear();
		hull = inSubmarine.getHull();
		maxDepth = inSubmarine.getMaxDepth();
		engine = inSubmarine.getengine();
	}

	public Submarin(double inSerialNum, int inYear, String inHull, double inMaxDepth, engine inengine)
	{
		if (((validateSerialNum(inSerialNum)) && (validateYear(inYear))) && ((validateHull(inHull)) && (validateMaxDepth(maxDepth))) && (validateEngine(inengine)))
		{
			serialNum = inSerialNum;
			year = inYear;
			hull = inHull;
			maxDepth = inMaxDepth;  
			engine = inengine;
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
	
	public String getHull()
	{
	 return hull;
	}
	
	public double getMaxDepth()
	{
	 return maxDepth;
	}
	 
	public engine getengine()
	{
	 return engine;
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
	
	public void setHull(String inHull)
	{
	 if (validateHull(inHull))
	 {
	  hull = inHull;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid hull");
	 }
	}
	
	public void setmaxDepth(double inMaxDepth)
	{
	 if (validateMaxDepth(inMaxDepth))
	 {
	  maxDepth = inMaxDepth;
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
	  engine = inengine;
	 }
	 else
	 {
	  throw new IllegalArgumentException("Invalid engine");
	 }
	}	
	
	public Submarin clone()
	{
	 Submarin cloneSC;
	  cloneSC = new Submarin (this.serialNum, this.year, this.hull, this.maxDepth, this.engine);
	  return cloneSC;
	}
	
	public boolean equals(Object inObj)
	{
	 boolean same = false;
	 if (inObj instanceof Submarin)
	 {
	  Submarin inSubmarine = (Submarin) inObj;
	  if (serialNum == inSubmarine.getSerialNum())
	     if (year == inSubmarine.getYear())
	       if (hull.equals(inSubmarine.getHull()))
	         if (Math.abs(maxDepth - inSubmarine.getMaxDepth()) < 0.001)
	           if(engine.equals(inSubmarine.getengine()))
	           same = true;
	 }
	 return same;
	}
	
	public String toString ()
	{
	  return ("SerialNum: "+ serialNum + " current year: "+ year +" hull: " + hull +" maxDepth " + maxDepth+ " engine: " + engine.toString());
	}  
	  
	private boolean validateMaxDepth(double inmaxDepth)
	{
	   return ((inmaxDepth>=-500.0) &&(inmaxDepth <= 0.0)) ;
	}  
	
	private boolean validateHull(String inhull)
	{
	  String stripped = inhull.toUpperCase();
	  return ((stripped.equals("STEEL")) ||(stripped.equals("ALLOY")) || (stripped.equals("TITANIUM")));
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
           return  ( (inengine.getfuel() != null) && ((inengine.getcyclinder() >= 2) && (inengine.getcyclinder()<= 20)) );
        }
}
    
   

