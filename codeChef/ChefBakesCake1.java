import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int preparedCakes = sc.nextInt();
        int selledCakes = sc.nextInt();
        int totalPreparedCost = 30 * preparedCakes;
        int totalSellingCost = 50 * selledCakes;
        System.out.println(totalSellingCost - totalPreparedCost);
	}
}
