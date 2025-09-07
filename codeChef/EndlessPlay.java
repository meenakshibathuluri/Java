import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int h = sc.nextInt();
         int days = x-4;
         int totalHours = days*24 + h;
         System.out.println(totalHours);
         
    }
}