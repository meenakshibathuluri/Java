import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int morningClouds = sc.nextInt();
        int eveningclouds = sc.nextInt();
        int threeTimesOfMorningClouds = morningClouds * 3;
        if(eveningclouds >= threeTimesOfMorningClouds) {
            System.out.println("Rain");
        }else {
            System.out.println("dry");
        }
 	}
}
