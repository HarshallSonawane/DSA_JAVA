

import java.util.*;
class josephusproblem {
	
	static public int josephus(int n, int k)
    {
        if(n==1) return 1;
        
        return (josephus(n-1,k)+k-1) % n+1;
    }
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		  
			int n,k;
			System.out.println("Enter number of people: ");
		    n=sc.nextInt();
			System.out.println("Enter positions to skip: ");
		    k=sc.nextInt();
			   

		    System.out.println("Winner is...." +josephus(n,k));
			sc.close();
		
	}
}
