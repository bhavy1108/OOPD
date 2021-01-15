import java.util.*;
import java.io.*;
public class FileManager
{
	public static void CreateSubmarine (String object)
	{
		FileOutputStream fileStrm = null;
                PrintWriter pw;
                String line;
                line=("S" + object);
		try
		{
                        fileStrm = new FileOutputStream("Submarin.csv");
                        pw = new PrintWriter(fileStrm);
			pw.println(line);
			pw.close();
	        }
		catch (IOException e)
		{
                }
	}
	
	public static void CreateFighterJet(String object)
	{
		FileOutputStream fileStrm = null;
                PrintWriter pw;
                String line;
                line=("F" + object);
                
		try
		{
                        fileStrm = new FileOutputStream("FighterJet.csv");
                        pw = new PrintWriter(fileStrm);
			pw.println(line);
			pw.close();
	        }
	        
		catch (IOException e)
		{
                }
	}
	
	public static void readSubmarineFile()
	{
             FileInputStream fileStrm = null;
             InputStreamReader rdr;
             BufferedReader bufrdr;
	     String FileName = "Submarin.csv";
	     
	     try
	     {
	           fileStrm = new FileInputStream(FileName);
	           rdr = new InputStreamReader(fileStrm);
	           bufrdr = new BufferedReader(rdr);
	           String line;
	           line = bufrdr.readLine();
	           
	            while (line!= null)
	            {
	               System.out.println(line);
	               line = bufrdr.readLine();
	            }
	            fileStrm.close();
	     }
	       
	        catch (FileNotFoundException e)
	        {
                        System.out.println("File not found " + e.getMessage());
                }
                
                catch (IOException ex2)
                {
		}      
	}
	
	public static void readFighterJetFile()
	{
             FileInputStream fileStrm =null;
             InputStreamReader rdr;
             BufferedReader bufrdr;
	     String FileName = "FighterJet.csv";
	    
	     try
	     {
	           fileStrm = new FileInputStream(FileName);
	           rdr = new InputStreamReader(fileStrm);
	           bufrdr = new BufferedReader(rdr);
	           String line;
	           line = bufrdr.readLine();
	            
	            while (line!= null)
	            {
	               System.out.println(line);
	               line = bufrdr.readLine();
	            }
	            fileStrm.close();
	     }
	       
	        catch (FileNotFoundException e)
	        {
                        System.out.println("File not found " + e.getMessage());
                }
               
                catch (IOException ex2)
                {
		}      
	}
}



	
