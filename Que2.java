package Assignment10;
import java.util.*;
public class Que2 {
	
	public static int CountDigit(int num) {
//		System.out.println(num);
		
		if(num<10) 
		return 1;
		
		else 
			return 1+CountDigit(num/10); 
	}
	public static void main(String[] args) {
		// implement a recursive function to count the number of digits in a given positive integer 'n.'
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		int cou=CountDigit(n);
		System.out.println(cou);
	}

}
	 
		
			
			
			
			
		

	