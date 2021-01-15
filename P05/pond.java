import java.util.*;
public class pond

	{

	public static void main (String[] args)

	{

// MAIN SCOPE : it is the start of the scope of the submodule main.

char person;
int species = 0;
double volume;

Scanner sc = new Scanner(System.in);

 do 

	{

	System.out.println("Select one person of the following  using the letter assigned to  them /n:"+
                                                                "J : Joey \n" +
                                                                "C : Cory \n" +
                                                               " R: Rachel \n");
person = sc.next().charAt(0);

switch (person)
{

 case 'J':
 
        species = inputSpecies(person);

    break;

 case 'C':
 
        species = inputSpecies(person);

    break;

 case 'R': 
 
        species = inputSpecies(person);
     break;

 

 default:
   System.out.println(" Choose a valid input");
 System.exit(0);

    

    }
    
    volume = calcVolOfWater();
    calcNumAnimals(person,species,volume);

   }

   while (person  ==  'J'  ||  person  ==  'C' || person == 'R');
  }



// SUBMODULE inputSpecies
// IMPORT person
// EXPORT species
 private static int inputSpecies(char person) {
  
  Scanner sc = new Scanner(System.in);

 int species = 0; 

 if (person == 'J') {

 do

 {

 System.out.println("Select one of these 2 types of animal (species) : \n" + "1: Sting Rays \n" +"2: Arowana \n");

    species = sc.nextInt();

   }

   while (species < 1 || species > 2);

 }

 else if (person =='C') {


do {

System.out.println("Select one of these 2 types of animal (species) : \n" + "1: koi \n" +"2: Puffer Fish \n");

species = sc.nextInt();

  }

while (species < 1 || species > 2);

}


else if(person =='R')

{

do

{

 System.out.println("Select one of these 2 types of animal (species) : \n" + "1: Turtles \n" +"2: Frogs \n");

 species = sc.nextInt();

 } 

while (species < 1 || species > 2);

}

 return  species;

}
//SUBMODULE calcVolumeOfWater	
// IMPORT length,width,depth
// EXPORT Volume
 private static double calcVolOfWater()

 {

 Scanner sc = new Scanner(System.in);
 double l = 0.0;
 double w = 0.0;
 double d = 0.0;
 double Volume = 0.0;

 do
   {
 
 System.out.println("Enter length,width,depth of the pond in metres");
 l  = sc.nextDouble();
 w  = sc.nextDouble();
 d  = sc.nextDouble();
}

 while (l < 0 && w < 0 && d < 0);

Volume = l*w*d;
return Volume;

 }


// SUBMODULE calcNumAnimals
// IMPORT person, species , Volume
// EXPORT numAnimal
 private static void calcNumAnimals(char person,int SpeciesType, double Volume)
{

 int numAnimal =0;

 if (person == 'J')
 {
 

 if (SpeciesType ==1)
 {

 numAnimal =(int)Math.abs(0.5 * Volume);

 System.out.println("Joey can store" + numAnimal + "Sting Rays in his" + Volume + " m^3 pond.");

 }

else if (SpeciesType ==2)

 {

 numAnimal =(int)Math.abs(0.4 * Volume);

 System.out.println("Joey  can store " + numAnimal+ "Arowana in his" + Volume + "m^3 pond.");

 	}

}



 else if (person == 'C')
{

	if (SpeciesType ==1)

{

 numAnimal =(int)Math.abs(0.6 * Volume);

 System.out.println("Cory can store" + numAnimal +"koi in her" + Volume + "m^3 pond.");

}

else if (SpeciesType == 2)

{


 numAnimal = (int)Math.abs(0.8 * Volume);

 System.out.println("Cory can store" + numAnimal + "Puffer Fish in her" + Volume + "m^3 pond.");

	}

}



else if (person  =='R')

{

if (SpeciesType == 1)

	{
 		numAnimal= (int)Math.abs(1.2 * Volume);

	 	System.out.println(" Rachel can store" + numAnimal+ "Turtles in her"+ Volume+ "m^3 pond.");

}

else if (SpeciesType == 2)

{

 numAnimal = (int)Math.abs(4.5*Volume);

 System.out.println("Rachel can store " + numAnimal +" Frogs in her" + Volume + " m^3 pond .");

 	  } 
	}
    }
}



