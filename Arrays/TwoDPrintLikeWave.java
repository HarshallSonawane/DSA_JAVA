import java.util.Scanner;

public class TwoDPrintLikeWave {
    

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

    public static void SineDisplay(int row,int colm,int arr[][]){
        for(int j=0;j<colm;j++){
            if(j%2==0){
            for(int i=0;i<row;i++){
                System.out.println(arr[i][j] +" ");
            }
        }else{
            for(int i=row-1;i>=0;i--){
                System.out.println(arr[i][j] +" ");
            }
        }

        }
    }
    public static void main(String[] args) {
        
        int arr[][] = print(3, 3);
        //displayArray(3, 3, arr); //Normal View
        SineDisplay(3, 3, arr);
    }
}
