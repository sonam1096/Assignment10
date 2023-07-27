package Assignment10;
import java.util.*;
public class que4 {

	private static String TitleCase(String[] s, int length, String ans) {
        if (length < 0)
          return ans;
        else {
          ans = Character.toUpperCase(s[length].charAt(0)) + s[length].substring(1) + " " + ans;
          ans = TitleCase(s, length - 1, ans);
          return ans;
        }
      }
	
	
	public static void main(String[] args) {
		// Write a recursive function to convert a given sentence to title case, where the first letter of each word is capitalized
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentence:");
 
	          String str = sc.nextLine();
	          String s[] = str.split(" ");
	          String rs = "";
	          String ans = TitleCase(s, s.length - 1, rs);
	          System.out.println(ans);
	        }

	        
	      }

			
