package array1;

public class CopyArray {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int []arr={
            1,3,5,6,8,7,9
        };
        System.out.println("Original Array : ");
        printArray(arr);
        
        int []arr2=arr;
        System.out.println("Copy Array  " );
        printArray(arr2);
        arr2[2]=88;
        System.out.println(" Change of Original Array : ");
        printArray(arr);
        
        System.out.println("Change of Copy Array  " );
        printArray(arr2);

    }
    
}
