
public class Instruction { //Calling the Instruction from Main function using the switch case
	void ShowInstruction() {
		System.out.println("                             Welcome to You in Our DataBase Management System");
		System.out.println();
		System.out.println(":-------------------------------------------**************************---------------------------------------------------:");
		
		System.out.println("1.)Build a file-based key-value-data stoe that support the basic CRD(Create,read and delete) Operation");
		System.out.println("2.)The Data Stores to be used as a local stoage for one single process on one laptop");
		System.out.println("3.)A new key-value pair can be added to the data store using the Create Operation.");
		System.out.println("4.)The Key always a String -capped at 32chars and The Value is always a JSON object -capped at 16KB");
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Functional Requirements");
		System.out.println("1.)If create is invoked fro an existing key an, appropriate error must be returned");
		System.out.println("2.)A Read operation on akey can be performed by providing the key and receiving the Value in response, as a JSON object.");
		System.out.println("3.)A Delete operation can be performed by providing the key");
	    System.out.println("4.)Every Key support setting a Time_To_Live property when it is created. This Property is Optional.");
	    System.out.println("5.)Once the Time-To_Live for a key has expired ,the key will no longer be avilable for Read and Delete operations");
	    System.out.println("6.)Appropriate error response must always be returned to a client if it uses the data store in unexpected ways or breaches any limits");
	    
	    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("1.)Data Store will also support the following nono0functional requiements");
	    System.out.println("2.)The Size of file Storing data must never exceed 1GB");
	    System.out.println("3.)More than one client process cannot be Allowed to Use the Same file as adata stoore at any time");
	    System.out.println("4.)A Client process is allowed to access the data store using multiple threads , if it desires to the data store must therefore be thread-safe");
	    System.out.println("5.)The client will be bear as little memory costs as possible to use this data store ,While deriving maximum performance with respect to response times for accessing the data store");
	    
	    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("Language");
	    System.out.println("Ideally ,we would not restrict you from working on alanguage of your choice. However ,itWould br preferable if you with one of these");
	    System.out.println("1.)Node/Js\n2.)Java\n3.)Pyhton\n4.)Golang\n5.)Ruby\n6.)C,C++");
	    System.out.println("---------------------------------------------------------*********************--------------------------------------------------------------------------------------------------------");
	    System.out.println();
	}

}
