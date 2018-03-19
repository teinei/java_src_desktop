package coursera_java_duke;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import edu.duke.*;

public class Class_01_hw_RE {

	/***
	 * What this tiny object hw do
	 * to printout "Hello Java Class!"
	 * @throws IOException 
	 */
	public void sayHello() throws IOException{
		System.out.println("Hello Java Class!");
		
		URL url = new URL("http://www.dukelearntoprogram.com/java/hello_unicode.txt");
		Scanner scanUrl = new Scanner(url.openStream());
		
		while(scanUrl.hasNext()){
			String line = scanUrl.nextLine();
			System.out.println(line);
		}
		System.out.println("Ok with first try.");
		
		scanUrl.close();
		
		
		//read txt document from internet with URLResource class in edu.duke path
		System.out.println("\n The second try of URL!");
		URLResource hello = new URLResource("http://www.dukelearntoprogram.com/java/hello_unicode.txt");

		//Type mismatch: cannot convert from element type Object to String
		 for(String line : hello.lines()){
		 	System.out.println(line);
		 	}
		 System.out.println("Ok with second try.");
		 
		 
		 
		 //read txt document from local path
		 System.out.println("\n \n The third try, read from local document!");
		 FileResource FRes = new FileResource("src/files/hello_unicode.txt");
		 
		 for(String line : FRes.lines()){
			 System.out.println(line);
		 }
		 System.out.println("Ok with third try.");
		 
		
	} //end of sayHello object
	
	
	/****
	 * the main() function
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		//create a new object Class_01_hw, name hw1
		Class_01_hw_RE hw1 = new Class_01_hw_RE();
		
		//call one method in hw1, sayHello to printout "Hello Java Class!".
		hw1.sayHello();
	}//end of main()
	
}//ee
