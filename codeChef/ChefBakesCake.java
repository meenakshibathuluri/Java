import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int totalCakes = sc.nextInt();
        int weightOfCake = sc.nextInt();
        int cakesPreVechicle = sc.nextInt();
        int eachVechicleCakes = cakesPreVechicle / weightOfCake;
        int totalVechicles = totalCakes /eachVechicleCakes;
        if (totalCakes % eachVechicleCakes==0) {
            System.out.println(totalVechicles);
        }else {
            System.out.println(totalVechicles+1);
        }
	}
}
