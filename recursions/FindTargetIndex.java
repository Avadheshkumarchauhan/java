package recursions;

import java.util.Scanner;
class FindIndex{
    public int findTargetIndex(int []arr,int j,int target){
        if(j==arr.length) return -1;
        if(arr[j]==target) return j;
        return findTargetIndex(arr, j+1, target);
    }
}

public class FindTargetIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.print("ENter Array size : ");
        int n=sc.nextInt();
        System.out.print("Enter array of "+n+" element : ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Target value : ");
        int target=sc.nextInt();
        FindIndex obj=new FindIndex();
        int inx=obj.findTargetIndex(arr, 0, target);
        if(inx!=-1){
            System.out.println("Index of target value  in array : "+inx);

        }
        else{
            System.out.println("Element is not found  in array ");
        }


        sc.close();
    }
    
}
