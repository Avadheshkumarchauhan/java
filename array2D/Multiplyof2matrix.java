package array2D;

import java.util.Scanner;

public class Multiplyof2matrix {
    static void print2DArray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][]tekingInput(){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row & collumn : ");
        int r=sc.nextInt(),c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.print("Enter "+r*c+" element ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
      
        //sc.close();
        return arr;
    }
    static void multiplyOfMatrix(int[][]x,int[][]y){
        int r1=x.length,c1=x[r1-1].length,r2=y.length,c2=y[r2-1].length;
        if (c1!=r2) {
            System.out.println("Multiplication not posible :" + c1+" != "+r2);
            return ;
            
        }
        int [][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                ans[i][j]+=(x[i][k]*y[k][j]);
                }
            }
        }
        print2DArray(ans);
        
    }

    public static void main(String[] args) {
        System.out.println("Enter first matrix ");
        int [][]A=tekingInput();
        System.out.println("Enter second metrix ");
        int [][]B=tekingInput();
        multiplyOfMatrix(A, B);
    }

    
}
