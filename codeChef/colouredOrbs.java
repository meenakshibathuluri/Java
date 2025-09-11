import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        int min = Math.min(red.blue);
        int greenSkill = min * 5;
        int redSkill = (red-min) * 1;
        int blueSkill = (blue-min) * 2;
        System.out.println(greenSkill+redSkill+blueSkill);
    }
}        