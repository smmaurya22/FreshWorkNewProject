import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	void readfile() { //Calling the readfile from Main function using the switch case
		System.out.println("Reading the content of file.");
		int count=0;
	   String filename="Database.txt";//file name in our local Storage System
	   Scanner input;
	try {
		input = new Scanner(new File(filename));//reading the file data using scanner 
		 System.out.println("Key  Value");
		 while(input.hasNext()) {
			 System.out.println(input.nextLine());//printing the line from the file
			 count++;//count the total number of line in the file
		 }
	} catch (FileNotFoundException e) {//handling the exception
		// TODO Auto-generated catch block
		System.out.println("file not found.");
		//e.printStackTrace();
	}
	System.out.println("total number of line is :"+count);
	System.out.println();
	}

}
