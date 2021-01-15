import java.util.*;
public class ShipStorage
{
	public static final int Maxsub = 15;
	public static final int Maxfig = 15;

	private Submarine[] subArray;
        private Fighter[] figArray;
	private engine[] inengine = new engine[15];
	private int countSub ;
	private int countFig;

	public ShipStorage ()
	{
		subArray = new Submarin [Maxsub];
		figArray = new Fighter[Maxfig];

		countSub = 0;
		countFig = 0;
	}

	public boolean equalArrays(Submarin [] subArray, Fighterjet [] figArray)
	{
		boolean equal = true;
		if (subArray.length != figArray.length)
		{
			equal = false;
		}
		else 
		{
			int count = 0;
			do
			{
			       equal = subArray[count].equals(figArray[count]);
		               count++;	       
			} while (equal && count < subArray.length);
		}
		return false;
	}

	private boolean addShip(Submarin objSub)
	{
		boolean add;
		if (objSub == null)
		{
			throw new IllegalArgumentException("Invalid submarine");
		}
		else if (countSub > Maxsub)
		{
			throw new IllegalArgumentException("No space left in array submarine");
		}
		else
		{
			this.subArray[countSub] = objSub;
			countSub++;
			add = true;
		}
		return add;
	}
        private boolean addShip(Fighterjet objFig)
        {
                boolean add;
                if (objFig == null)
                {
                        throw new IllegalArgumentException("Invalid fighter jet");
                }
                else if (countFig > Maxfig)
                {
                        throw new IllegalArgumentException("No space left in array fighter jet");
                }
                else
                {
                        this.figArray[countFig] = objFig;
                        countFig++;
                        add = true;
                }
                return add;
        }
	private int calTravelSub (int distance, int i)
	{
		int cyclinder = inengine[i].getcyclinder();		
		double maxDepth = subArray[i].getMaxDepth();
		int submarin;
		submarin = (int)((distance/ cyclinder) * (1/10 + maxDepth));
		return submarin;
	}
	private int calTravelFig (int distance, int i)
	{
		int cyclinder = inengine[i].getcyclinder();
		double wingspan = figArray[i].getwingspan();
		int fighter =0;
		fighter = (int) (distance/(wingspan * cyclinder * 150));
		return fighter;
	}
	private String desCheck(int distance)
	{
	        double fastest = 1000.0;
	        double timeTaken = 0.0;
	        double serialNum = 0.0;
	        String typeShip ="";
	        
	        for (int i = 0; i< this.subArray.length; i++)
	        {      
	               timeTaken = calTravelSub(distance, i);
	               if (timeTaken < fastest)
	               {
	                     fastest = timeTaken;
	                     serialNum = subArray[i].getSerialNum();
	                     typeShip = "Submarine";
	               }
	        }
	        
	        for (int i = 0; i< this.figArray.length; i++)
	        {      
	               timeTaken = calTravelFig(distance, i);
	               if (timeTaken < fastest)
	               {
	                     fastest = timeTaken;
	                     serialNum = figArray[i].getSerialNum();
	                     typeShip = "Fighter jet";
	               }
	        }
	        return ("The ship is a " + serialNum +" , is the fast ship and it is a "+typeShip + ".");
	}
	
	private String findDuplicate()
	{
	      Scanner sc = new Scanner(System.in);
	      boolean found= false;
	      int a =0;
	      int b = 0;
	      String result;
	      for (int i = 0; i<this.subArray.length; i++)
	      {
	           for(int j=0; j<this.subArray.length; j++)
  	           {
  	                if (i == j)
  	                { 
  	                  found = false;  	                  
  	                 if (subArray[i]== subArray[j])
  	                  {
  	                  found = true;
  	                  a= i;
  	                  b= j;
  	                  }
  	                }	            
	           }
	      }
	      if (found == false)
	      {
	       result = ("There is no duplicate");
	      } 
	      else 
	      {	        
	       result= ("Duplicate was found at address " + a + " and " + b + ".");
	      }
	      return result;
   }
   private String findDuplicate1()
   {
   int c =0 ,d = 0;
   boolean found = false;
	      for (int i = 0; i<this.figArray.length; i++)
	      {
	           for(int j=0; j<this.figArray.length; j++)
  	           {
  	                if (i == j)
  	                { 
  	                  found = false;
  	                   if (figArray[i]== figArray[j])
  	                  {
  	                  found = true;
  	                  c= i;
  	                  d= j;
  	                  }
  	                }	            
	           }
	      }
	      if (found == false)
	      {
	          return ("There is no duplicate");
	      } 
	      else 
	      {
                 return ("Duplicate was found at address " + c + " and " + d + ".");
	      }
	}
	private String viewShips()
	{
	 String  hull, fuel, result = "";
	 int year, cyclinder;
	 double serialNum, maxDepth, wingspan;
	 for (int i = 0; i <= this.subArray.length;i++)
	 {
	        serialNum = subArray[i].getSerialNum();
		year = subArray[i].getYear();
		hull = subArray[i].getHull();
		maxDepth = subArray[i].getMaxDepth();
		fuel = inengine[i].getfuel();
		cyclinder = inengine[i].getcyclinder();
		result =("The ship" + serialNum + " was commisioned in "+ year + " its engine has "+ cyclinder +" cyclinders and run on " + fuel+ "It is a submarine with" +hull+" hull and a max depth of " +maxDepth+ "meters.");
		return result;
	}
	for (int j = 0; j <= this.figArray.length; j++)
	{
	        serialNum = figArray[j].getSerialNum();
		year = figArray[j].getYear();
		wingspan = figArray[j].getwingspan();
		fuel = inengine[j].getfuel();
		cyclinder = inengine[j].getcyclinder();
		result =("The ship" + serialNum + " was commisioned in "+ year + " its engine has "+ cyclinder +" cyclinders and run on " + fuel+ "It is a fighter jet with wing span of " + wingspan+" meters." );
	        return result;
	}
	 return("THE END");
	}
	}

