)import java.io.*;
import java.util.*;

  public class mark
{
    pulic static void main(String[]args){
   
 string[] arrayName = new string[20];
 double[] arrayMarks = new double[20];
 boolean found = false;
 int  choice; 
 readFile(arrayName ,arrayMarks);

do{

Scanner sc = new Scanner(System.in);
System.out.println("Select a choice : 1 . Display Marks /n2.Exit");

int choice = Integer.parseInt(sc.nextLine());

if (choice == 1)
{

   found = displayMarks(arrayNames, arrayMarks); // return true if the name was found

}

else

{

System.exit(0);

 }

  sc.close();

}

while(found == false); // if name was not founs, re prompt the user to select a choice

}
  private static boolean displayMarks(string[] arrayNames, double[] arrayMarks)

{
  Scanner sc  = new Scanner(System.in);
 System.out.println("Enter Student Name: "); //Oliver Stewart

  string name = Sc.nextLine();
  
  double mark;
 boolean found = false;
 for(int i=0; i< arrayNames.length; i++)

{

 if(name.equals(arrayMarks[i]))

{ 
 mark = arrayMarks[i];
 System.out.println("The mark for " + arrayNames[i] + " is " + mark);

return true

     }
}

if (found == false)
{
  System.out.println(name + " does not exist. ");

}
return found;

}

private static void readFile( string[] arrayNames, double[] arrayMarks)

{
  string inFilename;
boolean noFile; //status if file was found or wa not found

FileInputStream fileStrm = null;
InputStreamReader rdr;
BufferedReader bufRdr;

int lineNum = 0;
string line;
int countName = 0; // a counter for each Name
int countMark = 0; //  a counter for each Mark

do
{

 Scanner sc = new Scanner(System.in);
 noFile = true; // file doesn't exist yet
 System.out.print("Enter filename \n"); // "mark_file.csv";
 inFilename = sc.nextLine();

try 

{

fileStrm = new FileInputStream(inFilename); // open the file 
rdr = new InputStreamReader(filestrm); // create a reader to read the stream
bufRdr = new BufferedReader(rdr); // To read the stream one line at a time

line = bufRdr.readline(); //read the first line

while (line !=nul) { // while not end-of-file, process and read lines
if( lineNum %2 == 0) //Each even line is a name and an odd line is a score
{
   arrayNames[countName] = processName(line);
   countName++;

} 

else
{

  arrayMarks[countMark] = processTestMark(line);
  countMark++;
} 

line = bufRdr.readline(); // read the next line 
lineNum++; // increment the line counter

}

fileStrm.close();
noFile = false; //if we get here, everything workedfine
 
}
catch(IOException e)
{ // MUST catch checked IOExceptions
  System.out.println("Error in file processing: " + e.getMessage() );  // or do a throw
// throw e ;

}
 catch(Exception e) // can catch all other Exceptions

 {

  throw e;

 } 

  }

 while (noFile); // if the file doesn't exist , repeat the loop

}
 
private static String processName(String line) {
   String[] lineArray = line.split(",");
   Stringname = lineArray[0]; //note that you have one value per line
   return name;

}

private static double processTestMark(String line) {

 string[] lineArray = line.split(",");
 double marks = Double.parseDouble(lineArray[0]); // note that you have one value  per line
 return marks;
}

  }
