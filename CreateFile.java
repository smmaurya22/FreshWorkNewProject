import java.io.File;
public class CreateFile {
         void createFile() { //Calling the createFile from Main function using the switch case
        	 System.out.println("Creation of file in System :");
        	 //file name store in our local Database Storage
        	 File filename=new File("C:\\Users\\Suresh Maurya\\eclipse-workspace\\FreshWork_Project\\Database.txt");
        	 if(filename.exists()) {//checking the file already exit in Database Storage
        		 System.out.println("File is already is exist in Your System.");
        	 }else {//if not show a message to your file is successfully is create in your local Database system 
        		 System.out.println("New File is created successfully in Your System.");
        	 }
        	 System.out.println();
         }
}
