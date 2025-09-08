import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int totalBoys = (a+1) * 4;
       int totalGirls = b * 3;
       int totalPizza = (totalBoys+totalGirls / 8);
       if ((totalBoys+totalGirls)%8 != 0) {
           System.out.println(totalPizza+1);
       } else {
           System.out.println(totalPizza);
       }
	}
}
