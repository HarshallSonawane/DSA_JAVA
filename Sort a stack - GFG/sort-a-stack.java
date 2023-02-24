//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class GfG{
	public Stack<Integer> sort(Stack<Integer> st)
	{
	    int n = st.size();
	    for(int i = 0;i<n;i++){
	        bubble(st);
	    }
	    return st;
	}
	public void bubble(Stack<Integer> st)
	{
	    if(st.size()<=1) return;
	    int x = st.pop();
	    int y = st.pop();
	    if(y<x){
	        int temp = y;
	        y = x;
	        x = temp;
	    }
	    st.push(x);
	    bubble(st);
	    st.push(y);
	}
}