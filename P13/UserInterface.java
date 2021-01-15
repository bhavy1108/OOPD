import java.util.*;
public class UserInterface
{     
	public static Scanner sc = new Scanner(System.in);
	private ShipStorage objSS;
        public double inSerialNum;
	public UserInterface()
	{
		objSS = new ShipStorage();
	}

	public void mainMenu()
	{ 
		int option, inputTypeShip;
		do
		{
			System.out.println("Select an option:\n1. Display all Ships\n 2.Add a ship to file\n 3.Read ships from file\n 4.Exit");
			option = sc.nextInt();

			switch(option)
			{
				case 1:
				        objSS.viewShips();
				        
					break;
				case 2:
					inputTypeShip();
					break;
				case 3:
				        readShipFile();
					break;
				case 4:
					System.out.println("Exiting the application.");
					System.exit(0);
					break;
				default:
				System.out.println("Invalid Choice pls try again😝️");	
			}
		}
		while(option >=1 || option<= 4);
	}
	private void inputTypeShip()
	{
		int typeShip = 0;
		do 
		{
			System.out.println("Select the type of ship to add:\n1.Submarines \n2.FighterJet");
			typeShip = sc.nextInt();
			if (typeShip < 1|| typeShip>2)
			{
				System.out.println("Invalid Choice please try again");
			}
		} while (typeShip<1|| typeShip>2);
		if(typeShip == 1)
		{
			addSubmarine();
		}
		else 
		{
                        addFighter();
		}
	}
	private void addSubmarine()
	{
	     double inSerialNum ;
	     int inYear;
	     String inFuelType;
	     int inCyclinder;
	     double inMaxDepth;
	     String inHullType;
	     
	     do 
	     {
	             System.out.println("Enter a real serial number of the ship of format XXX.YYY:");
	             inSerialNum = sc.nextDouble();	             
	     } while (!validateSerialNum (inSerialNum));
	     
	     do
	     {
	             System.out.println("Enter a commission year of type integer:");
	             inYear = sc.nextInt();
	     }while (!validateYear(inYear));
	     
	     do
	     {
	             System.out.println("Enter one fuel type(Battery, Diesel or Bio):");
	             inFuelType = sc.nextLine();
	     }while (!this.validateFuel(inFuelType));
	      do 
	      {      
	             System.out.println("Enter number of cyclinders of type integer :");
	             inCyclinder = sc.nextInt();
	      }while (!this.validateCyc(inCyclinder));
	      
	      do
	      {
	             System.out.println("Enter number of maximum depth of type real between -500.0 to 0.0:");
	             inMaxDepth = sc.nextDouble();
	      }while(!this.validateMaxDepth(inMaxDepth));
	      
	      do
	      {
	            System.out.println("Enter one Hull type (Steel, Alloy, Titanium):");
	            inHullType = sc.nextLine();
	      }while(! this.validateHull(inHullType));
	      
	      engine engine = new engine(inFuelType,inCyclinder);
	      Submarin objSub = new Submarin(inSerialNum,inYear, inHullType,inMaxDepth, engine);
	      objSS.addShipSub(objSub);
	}
	private void addFighter()
	{
	        double inSerialNum ;
	     int inYear;
	     String inFuelType;
	     int inCyclinder;
	     double inwingspan;
	     String inordnance ="";
	     
	     do 
	     {
	             System.out.println("Enter a real serial number of the ship of format XXX.YYY:");
	             inSerialNum = sc.nextDouble();	             
	     } while (!validateSerialNum (inSerialNum));
	     
	     do
	     {
	             System.out.println("Enter a commission year of type integer:");
	             inYear = sc.nextInt();
	     }while (!validateYear(inYear));
	     
	     do
	     {
	             System.out.println("Enter one fuel type(Battery, Diesel or Bio):");
	             inFuelType = sc.nextLine();
	     }while (!this.validateFuel(inFuelType));
	      do 
	      {      
	             System.out.println("Enter number of cyclinders of type integer :");
	             inCyclinder = sc.nextInt();
	      }while (!this.validateCyc(inCyclinder));
	      
	      do
	      {
	              System.out.println("Enter a name");
	              inordnance = sc.nextLine();
	      }while(!this.validateordanace(inordnance));
	      
	      do 
	      {
	              System.out.println("Enter a value between 2.20 and 25.6(inclusive)");
	              inwingspan =sc.nextDouble();
	      }while(!validatewingspan (inwingspan));
	      
	      engine engine = new engine(inFuelType,inCyclinder);
	      Fighterjet objfig = new Fighterjet(inSerialNum,inYear, inordnance, inwingspan,engine);
	      String object =(""+objfig);
	      objSS.addShipFig(objfig);
	      
	      filemanager fm = new filemanager();
	      fm.CreateFig(object);
	}
	/*********************************************************** For validating ship**********************************/
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
        
        private boolean validateYear(int inYear)
	{
	  return ((inYear >= 1950) && (inYear<= 2022));
        }
        /***********************************************************end of validation of  ship*********************************/
        
        /*********************************************************** For validating submarine**********************************/
	private boolean validateMaxDepth(double inmaxDepth)
	{
	   return ((inmaxDepth>=-500.0) &&(inmaxDepth <= 0.0)) ;
	}  
	
	private boolean validateHull(String inhull)
	{
	  String stripped = inhull.toUpperCase();
	  return ((stripped.equals("STEEL")) ||(stripped.equals("ALLOY")) || (stripped.equals("TITANIUM")));
	}
	/***********************************************************end of validation of  submarine*********************************/
	
	/***********************************************************for validating fighter jet*********************************/
	private boolean validatewingspan (double inwingspan )
	{
	   return ((inwingspan >=2.20) &&(inwingspan  <= 25.6)) ;
	}  
	
	private boolean validateordanace(String inordanace)
	{
	   return (inordanace!= null);
	}
	/********************************************************* end of validation of  fighter jet *********************************/
	
	/***********************************************************for validating engine*********************************/
	private boolean validateCyc (double incyclinder)
	{
		return((incyclinder >= 2) && (incyclinder<= 20));
	}

	private boolean validateFuel (String infuel)
	{
	        String FUELBAT= "BATTERY";
	        String FUELDIE= "DIESEL";
	        String FUELBIO= "BIO";
	        String inFuel = infuel.toUpperCase();
		return ((inFuel.equals(FUELBAT)) || (inFuel.equals(FUELDIE)) || (inFuel.equals(FUELBIO)));
	}
	/********************************************************* end of validation of  engine *********************************/
	
	private void displayShip()
	{
	   filemanager fm = new filemanager ();
	   fm.readSubFile();
	   fm.readFigFile();
	}
	
	private void readShipFile()
	{
	   filemanager fm = new filemanager();
	   System.out.println("Choose from :\n1. for reading submarine file only\n2. for reading fighter jet only \nfor reading both files. ");
	   int choice = sc.nextInt();
	   do
	   {
	   switch(choice)
	   {
	    case 1:
	           fm.readSubFile();
	           break;
	    case 2:
	           fm.readFigFile();
	           break;
	    case 3:
	           displayShip();
	           break;
	        default:
	        System.out.println("Invalid choice pls try again 😝️");       
	   }
	   }while(choice<1|| choice>3);
	}


        

}
