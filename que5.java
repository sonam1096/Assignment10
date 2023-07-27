package Assignment10;

import java.util.Scanner;

public class que5 {

	
		//Create a recursive function to count the number of words in a CamelCase string.

	 private static int CamelCase(String str, int length) {
		 // TODO Auto-generated method stub
		 if (length == 0)
		     return 1;
		 else {
		     if ((Character.isUpperCase(str.charAt(length))))
		  return 1 + CamelCase(str, length - 1);
		 }
		 return CamelCase(str, length - 1);
		    }
		
    
 
 public static void main(String[] args) {
			 // TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Sentence:");
	 String str = sc.nextLine();
	 int ans = CamelCase(str, str.length() - 1);
	 System.out.println("Output:" + ans);
	    }

	   

}
