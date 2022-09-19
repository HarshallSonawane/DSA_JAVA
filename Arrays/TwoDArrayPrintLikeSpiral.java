import java.util.Scanner;

public class TwoDArrayPrintLikeSpiral {
    

    public static int[][] print(int row,int colm){
    
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[row][colm];
        for(int i=0;i<row;i++){
            for(int j =0;j<colm;j++){
                arr[i][j]=s.nextInt();
            }
        }
        return arr;
    }

    public static void displayArray(int row,int colm,int arr[][]){

        for(int i=0;i<row;i++){
            for(int j = 0;j<colm;j++){
               System.out.println(arr[i][j]);
            }
        }
    }

    public static void SpiralDisplay(int row,int colm,int arr[][]){
        for(int i=0;i<row;i++){
            if(i%2==0){
            for(int j=0;j<colm;j++){
                System.out.println(arr[i][j] +" ");
            }
        }else{
            for(int j=colm-1;j>=0;j--){
                System.out.println(arr[i][j] +" ");
            }
        }

        }
    }
    public static void main(String[] args) {
        
        int arr[][] = print(3, 3);
        //displayArray(3, 3, arr);
        SpiralDisplay(3, 3, arr);
    }
}
