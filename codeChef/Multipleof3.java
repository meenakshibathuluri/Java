import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n%3!=0) {
          int quotient = n/3;
          int fristMultiple = quotient * 3;
          int secondMultiple = fristMultiple+3;
          int fristDiff = n - fristMultiple;
          int secondDiff = secondMultiple -n;
          
         if(fristDiff<secondDiff) {
           System.out.println(fristMultiple);
         } else {
           System.out.println(secondMultiple);
         } 
        
        } else {
	      System.out.println(n);
	  }
	}
}
