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
      int remainder = n % 3;
      if(remainder==0) {
          System.out.println(0);
      }else {
          System.out.println(1);
      }
	}
}
