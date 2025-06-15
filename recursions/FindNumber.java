package recursions;

import java.util.Scanner;
class FindTargetValue{
    public boolean findTargetValue(int []arr,int j,int target){
        if(j==arr.length)return false;
        if(arr[j]==target)return true;
         return findTargetValue(arr, j+1, target);
    }
}

public class FindNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int []arr=new int[n] ;
        System.out.print("Enter Array of element  "+n+" : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("\n Enter target value : ");
        int target =sc.nextInt();
        Print ob=new Print();
        ob.printArray(arr, 0);
        FindTargetValue obj=new FindTargetValue();
        if(obj.findTargetValue(arr, 0, target))
        {
            System.out.println("yes ");
        }
        else{
            System.out.println("Not ");
        }


        sc.close();
    }
}
