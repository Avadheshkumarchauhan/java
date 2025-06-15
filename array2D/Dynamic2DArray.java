package array2D;

import java.util.Scanner;

public class Dynamic2DArray {
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
    public static void main(String[] args) {
        int [][]arr=tekingInput();
        System.out.println("Array of 2D ");
        print2DArray(arr);
        
    }
    
}
