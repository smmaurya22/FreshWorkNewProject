import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DeleteData {
	   
	              public static String fileToString(String filepath) throws FileNotFoundException {
		                                 String input=null;
		                                 Scanner sc=new Scanner(new File(filepath));//reading the file data
		                                 StringBuffer sb=new StringBuffer();
		                                 
		                                 while(sc.hasNextLine()) {//iterating data in file
			                                      input=sc.nextLine()+"\n";
			                                      sb.append(input);
		                                       }
		                                 return sb.toString();
	              }
	              
                  void deleteData() {
                	         String filepath="output.txt";
                	         String result;
					     try {
						  result = fileToString(filepath);//store the data in result from the file
						  System.out.println("Content of the file is  : "+result);//Printing the Original content of file
	                	  System.out.println("Enter Your Key want to delete from the file");//enter the value
	                	  Scanner sc=new Scanner(System.in);
	                	  String key=sc.next();//read the input
	                	  result=result.replaceAll(key, "");//replace the value from user to null
	                	  result=result.replaceAll("=", "  ");//replace = oprator in file 
	                	  PrintWriter writer=new PrintWriter(filepath);//writing the content using the printwriter 
	                	  writer.append(result);//append the content into file
	                	  writer.flush();
	                	  System.out.println("Contents of the file After perform deletion option");
	                	  System.out.println(fileToString(filepath));//print the data after perform the deletion operation
					    } catch (FileNotFoundException e) {//handling the exception
						                e.printStackTrace();
					      }
               }
}
