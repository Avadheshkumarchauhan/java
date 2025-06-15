package array1;


import java.util.Scanner;

public class CheckElementSort {

    static int  []tekingInput(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Array Size : ");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }sc.close();
        return arr;
        
    }
    static boolean shorts(int []x){
        boolean fl=true;
       
        for(int i=1;i<x.length;i++){
            if(x[i]<x[i-1]){
                fl=false;
                break;
            }
        }
        return fl;
    }

    public static void main(String[] args) {
      int []arr=  tekingInput();
      shorts(arr);
      System.out.println(shorts(arr));
        
    }
    
}
