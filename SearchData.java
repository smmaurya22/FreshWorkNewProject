import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchData {
             void ShowRecord() {// Calling the ShowRecord from Main function using the switch case
            	 System.out.println("Search the record from Your database :");
            	 System.out.println();
            	 Scanner sc=new Scanner(System.in);
            	 System.out.println("Enter the user id :");//Enter your key
            	 String id=sc.next();
            	 int check=0;
            	 String line="";//string variable 
            		 try {
            			 //file path in our local storage
						FileInputStream fin=new FileInputStream("C:\\Users\\Suresh Maurya\\eclipse-workspace\\FreshWork_Project\\Database.txt");
					    Scanner s=new Scanner(fin);//reading the file data using Scanner function
					    System.out.println("Key  Value");
					    while(s.hasNext()) {//iterating the nextLine
					    	line=s.next();
					    	if(line.startsWith(id)) {//checking the condition
					    		System.out.println(line);
					    		check=1;
					    	}
					    }
					    if(check==0) {
					    	System.out.println("Please Enter the Valid Input");//if data is not find in the file show an error message 
					    }
					    s.close();//close the reading the file
            		 } catch (FileNotFoundException e) {//handling the exception
						// catch block
						e.printStackTrace();
					}
            		 System.out.println();
             }
}
