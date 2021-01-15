import java.util.*;
import java.io.*;
public class filemanager
{
   private ShipStorage objSS;
	public static void CreateSub(Submarin[] object)
	{
		FileOutputStream fileStrm = null;
                PrintWriter pw;
                String line;
		try
		{
                        fileStrm = new FileOutputStream("submarin.csv");
                        pw = new PrintWriter(fileStrm);
			pw.println(object);
			pw.close();
	        }
		catch (IOException e)
		{
                }
	}
	
	public static void CreateFig(String object)
	{
		FileOutputStream fileStrm = null;
                PrintWriter pw;
                String line;
                line=("" + object);
		try
		{
                        fileStrm = new FileOutputStream("Fighterjet.csv");
                        pw = new PrintWriter(fileStrm);
			pw.println(line);
			pw.close();
	        }
		catch (IOException e)
		{
                }
	}
	
	public static void readSubFile()
	{
             FileInputStream fileStrm =null;
             InputStreamReader rdr;
             BufferedReader bufrdr;
	     String FName = "submarin.csv";
	     try
	     {
	           fileStrm = new FileInputStream(FName);
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
	        catch (FileNotFoundException e){
                        System.out.println("File not found " + e.getMessage());
                }
                catch (IOException ex2){
		}      
	}
	
	public static void readFigFile()
	{
             FileInputStream fileStrm =null;
             InputStreamReader rdr;
             BufferedReader bufrdr;
	     String FName = "Fighterjet.csv";
	     try
	     {
	           fileStrm = new FileInputStream(FName);
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
	        catch (FileNotFoundException e){
                        System.out.println("File not found " + e.getMessage());
                }
                catch (IOException ex2){
		}      
	}
}

