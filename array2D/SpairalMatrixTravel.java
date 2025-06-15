
package array2D;

import java.util.Scanner;

public  class SpairalMatrixTravel {
    static void spiralMatrixTravel(int [][]arr){
        int r=arr.length,c=arr[r-1].length;
        int topRow=0,bottumRow=r-1,leftColm=0,rightcolm=c-1;
        int element=0;
        while(element<r*c){
            for(int i=leftColm;i<=rightcolm && element<r*c;i++){
                System.out.print(arr[topRow][i]+" ");
                element++;
            }
          
            topRow++;
            for(int i=topRow;i<=bottumRow && element<r*c;i++){
                System.out.print(arr[i][rightcolm]+" ");
                element++;
            }
           
            rightcolm--;
            for(int i=rightcolm;i>=leftColm && element<r*c;i--){
                System.out.print(arr[bottumRow][i]+" ");
                element++;
            }
           
            bottumRow--;
            for(int i=bottumRow;i>=topRow && element<r*c;i--){
                System.out.print(arr[i][leftColm]+" ");
                element++;
            }
            
            leftColm++;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row and collumn : ");
        int r=sc.nextInt(),c=sc.nextInt();
        int [][]ans=new int[r][c];
        System.out.println("Enter "+r*c+" element : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=sc.nextInt();
            }
        }

        spiralMatrixTravel(ans);
    }

    
}