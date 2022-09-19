/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		
		int breakCount=0;
		int saveCount=0;
		int loop = s.nextInt();
		while(loop--!=0)
		{
		    int n = s.nextInt();
		    int[] a = new int[n];
		    Arrays.sort(a);
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[i+1])
		        {
		            breakCount++;
                    System.out.println(breakCount);
		        }
		        else{
		            saveCount++;
		        }
		    }
		    System.out.println(saveCount);
		}
	}
}
