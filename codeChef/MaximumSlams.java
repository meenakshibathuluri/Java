import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int totalWins = 25 -x;
      if (totalWins%4==0) {
          System.out.println(totalWins/4);
      }else {
          System.out.println((totalWins/4)+1);
      }
	}
}
