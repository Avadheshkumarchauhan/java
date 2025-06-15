package array2D;

import java.util.Scanner;

public class PascalMatrix {
    static void print2DArray(int [][]arr){
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pascalMatrix(int n){
        int [][]arr=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1] ;
           arr[i][0]=arr[i][i]=1;
           for(int j=1;j<i;j++){
            arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
           }
        }
        print2DArray(arr);


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Pascal matrix row :");
        int n=sc.nextInt();
        System.out.println("Pascal matrix ");
        pascalMatrix(n);

        sc.close();
    }
    
}
