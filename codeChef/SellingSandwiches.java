import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int sellingPrice = sc.nextInt();
        int bunCost = sc.nextInt();
        int vegetablesCost = sc.nextInt();
        int totalCost = bunCost + vegetablesCost;
        System.out.println(sellingPrice - totalCost);
	}
}
