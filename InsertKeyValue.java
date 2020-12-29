import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
public class InsertKeyValue {
	public static boolean KeyExitss(String key) {//check the dulpicates values here
		String line;
		try {
			//file path in our local Database System
		    FileInputStream fin=new FileInputStream("C:\\Users\\Suresh Maurya\\eclipse-workspace\\FreshWork_Project\\output.txt");
		    Scanner s=new Scanner(fin);//reading the file using scanner function
		    while(s.hasNext())//iterating the next line using the while loop 
		    {
		    	line=s.nextLine();
		    	if(line.startsWith(key))//check the duplicate key condition if it is true return true
		    	{
		    		return true;
		    	}
		    }
		    return false;//otherwise return false
		 } 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();//handling the exception from file
		}
		return true;
	}
	
	
               void insertRecord() //Calling the insertRecord from Main function using the switch case
               {
            	   System.out.println("Insert  data in the filedatabase :");
            	   File filename=new File("C:\\Users\\Suresh Maurya\\eclipse-workspace\\FreshWork_Project\\Database.txt");
            	   try 
            	   {
            			PrintWriter outputStream = new PrintWriter(filename);
            			outputStream.print("Hii there is file!!");
            			Properties p=new Properties();//propeties function using store the key/value pair in file
            			Scanner sc=new Scanner(System.in);
            			System.out.println("How many record inserted ??");
            			int n=sc.nextInt();//read the input data
            			System.out.println("Key  Value");
            			try(FileWriter filewriter=new FileWriter(filename))
            			{
            				for(int i=0;i<n;i++) 
            				{
            			           p=new Properties();
            			           String key=sc.next();
            			           key.replace("=", "");
            			           String value=sc.next();
            			     
            			         if(KeyExitss(key)) 
            			         {
            			        	 System.out.println("This key already is exist in fileDatabase");
            			         }
            			         else
            			         {
            			        	 p.setProperty(key,value);//setting the key value pair
            			         }
            				
            			         p.store(filewriter, "");//writing the key/value pair in file
            			}
            		}
            			 catch (IOException e) {
       					e.printStackTrace();
       				    }
            		} catch (FileNotFoundException e) {//handling the exception 
            			
            			System.out.println("file not found");
            			e.printStackTrace();
            		} 
            	   System.out.println();
               }
}
