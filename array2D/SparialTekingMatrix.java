package array2D;

import java.util.Scanner;

public class SparialTekingMatrix {
   public static void spiralTekingMatrix(){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row and collumn : ");
        int r=sc.nextInt(),c=sc.nextInt();
        int [][]ans=new int[r][c];
        System.out.println("Enter "+r*c+" element ");
        
        int topRow=0,bottumRow=r-1,leftColm=0,rightcolm=c-1;
        int element=0;
        while(element<r*c){
            for(int i=leftColm;i<=rightcolm && element<r*c;i++){
                ans[topRow][i]=sc.nextInt();
                element++;
            }
           
            topRow++;
            for(int i=topRow;i<=bottumRow && element<r*c;i++){
                ans[i][rightcolm]=sc.nextInt();
                element++;
            }
            
            rightcolm--;
            for(int i=rightcolm;i>=leftColm && element<r*c;i--){
                ans[bottumRow][i]=sc.nextInt();
                element++;
            }
           
            bottumRow--;
            for(int i=bottumRow;i>=topRow && element<r*c;i--){
                ans[i][leftColm]=sc.nextInt();
                element++;
            }
            leftColm++;
        }
        sc.close();
        Dynamic2DArray.print2DArray(ans);
        System.out.println("Spiral matrix ");
        SpairalMatrixTravel.spiralMatrixTravel(ans);
       

    }
    public static void main(String[] args) {
      spiralTekingMatrix();
    }

    
}
