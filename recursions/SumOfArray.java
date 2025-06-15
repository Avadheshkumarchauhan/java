package recursions;

import java.util.Scanner;
class SumOfElementOfArray{
    public int sumOfArray(int []arr,int inx){
        if(inx==arr.length-1){
            return arr[inx];
        }
        return sumOfArray(arr, inx+1)+arr[inx];
    }
}

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Array size : ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Array is Empaty !!!");
            return;
        }
        int []arr=new int[n];//initialise array and array size
        TekingArray ob1=new TekingArray();//creating object 
        ob1.tekingArray(arr);//calling method and tekind input
        Print ob2=new Print();
        ob2.printArray(arr, 0);//printing method using recursion
        /*creating object of Sum of Array */
        SumOfElementOfArray ob3=new SumOfElementOfArray();
        System.out.println("Som of element : "+ob3.sumOfArray(arr,0));

        sc.close();
        
    }
    
}
