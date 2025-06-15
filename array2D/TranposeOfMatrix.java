package array2D;

import java.util.Scanner;

public class TranposeOfMatrix {
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
    static void tranposeMatrix(int [][]arr){
        int r=arr.length;
        int c=arr[r-1].length;
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];

            }
        }
      print2DArray(ans);
       

    }
    static void transposeWithoutExtraSpace(int [][]arr){
        int r=arr.length,c=arr[r-1].length;

        if(r!=c){
            System.out.println("Matrix not Transpose :(Enter only Row Equal collumn )");
            return ;
        }
        for(int i=0;i<r;i++){
            
            for(int j=i;j<c;j++){
                swapArray(arr,i,j);
            
                
            }
        }
        print2DArray(arr);
    }
   
    static int [][]swapArray(int [][]arr ,int i,int j){

        int t=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=t;

        return arr;
    }
    
    public static void main(String[] args) {
        int [][]arr=tekingInput();
        print2DArray(arr);
        System.out.println("Transpose matrix with extra space  ");
        tranposeMatrix(arr);
        System.out.println("Transpose matrix without extra space  ");
        transposeWithoutExtraSpace(arr);
      
    }
}
