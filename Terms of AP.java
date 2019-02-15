/*   Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
N varies from 1 to 1000.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       Scanner scan =new Scanner (System.in);
	      int n = scan.nextInt();
	      int sum=0;
	      int j=1;
	      for (int i=1 ; i<=n ; i++) {
	    	  
	    	  sum = (3*j)+2;
	    	  if ((sum%4)!=0)
	    		  System.out.print(sum+" ");
	    	  else 
	    		  n++;
	    	  j++;
	    	  
	    	  
	      }

	}
}
