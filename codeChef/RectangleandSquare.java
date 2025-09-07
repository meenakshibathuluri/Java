import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         int side = sc.nextInt();
         int areaOfRectangle = length * breadth;
         int areaOfSquare = side*side;
         if(areaOfRectangle == areaOfSquare) {
             System.out.println("Yes");
         }else {
             System.out.println("No");
         }
	}
}
