package AssignmentTest;

//Program searches for phrases, if key word is eg. walk, walking,walked will be recorded as a match.

import java.lang.*;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	List files;
	String cs1;
	int i ;
	int j = 0;
	ReadFile(String cs1, List files)
	{
		this.cs1 = cs1;
		this.files = files;
	


	try {
	//Create file instance
		
		for (i=0; i < 3; i++)
		{
			java.io.File file = new java.io.File((String) files.get(i));
			Scanner input = new Scanner(file); 

  
   
		   while(input.hasNext())
			{
			String str = input.next();   
		   
		   // string contains the specified sequence of char values
			  boolean retval = str.contains(cs1);
			   if (retval != false)
			   {
				   j +=1;
			   }
			   
			}//END WHILE
			
		   //if match occurs, print results
	
		   if ( j > 0)
		   {
		   System.out.println( file + "     Search complete, Total matches:" + j);
		   }
	
	  
	   
	   //close scanners
	   input.close();
	}//end for

	}//end try

	
	
		
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
}}