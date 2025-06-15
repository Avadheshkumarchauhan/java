package recursions;

import java.util.Scanner;
class TekingArray{
    public int []tekingArray(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
        
    }
}
    class FindMaxValue{
        public int findMaxValue(int []arr,int inx){
            if(inx==arr.length-1){
                return arr[inx];
            }
            return Math.max(arr[inx], findMaxValue(arr, inx+1));
        }

}


public class FindMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();
        if(n<=0) {
            System.out.println("Array is Empity !!!");
            return ;
        }
        else{
        int []arr=new int[n];
        TekingArray obj1=new TekingArray();
        obj1.tekingArray(arr);
        /*print array of element or value */
         Print obj2=new Print();
        obj2.printArray(arr, 0);
        /*create object of FindMaxValue */
        FindMaxValue ob=new FindMaxValue();
        System.out.println("Max value of Array : "+ob.findMaxValue(arr, 0));


        sc.close();
        }
    }
    
}
