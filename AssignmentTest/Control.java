package AssignmentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Test.Search;

public class Control {

	public static void main(String[] args) {
		List<String> files = new ArrayList();		
		Scanner reader = new Scanner(System.in);  // Reading from System.in

		/*while(1 == 1)
			{	
				String yes = "y";
				String no = "n";
				
				
				System.out.println("do you want to enter a file path y/n?:");
				String answer = reader.next(); // Scans the next token of the input.

				if(answer.contains(yes))
				{
				System.out.println("Please enter your file(s) to search:");
				String file = reader.nextLine(); // Scans the next line of the input.
				System.out.println(file);
				files.add(file);
				}
				
				if(answer.contains(no))
				{
					break;
				}
				}*/
				
				files.add("C:/Program Files/eclipse/workspace/Homework/src/ReadFile/Hello.txt");
				files.add("C:/Program Files/eclipse/workspace/Homework/src/ReadFile/Adalove.txt");
				files.add("C:/Program Files/eclipse/workspace/Homework/src/ReadFile/Test.txt");
								
		System.out.println("Please enter your key word(s) to compare:");

		String cs1 = reader.next(); // Scans the next token of the input.
		System.out.println("Keyword is:" + cs1);

		System.out.println(files);

		ReadFile Readfile1 = new ReadFile(cs1,files);
	}

}
