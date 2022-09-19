/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Scholarship
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int R =sc.nextInt();
		if(R==1 || R<=50){
		    System.out.printf("%d",100);
		    
		}
		else if(R>=51 && R<=100){
		    System.out.printf("%d",50);	
		    }
	
	else{
	    System.out.printf("%d",0);
	}
}
}