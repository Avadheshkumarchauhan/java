package short1;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    index=j;
                }
            }
            if(index!=i){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
             
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array size : "  );
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter Array element "+n+" : "  );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sort of array element using selection sort ");
        selectionSort(arr);
        for(int x:arr){
            System.out.print(x+ " ");
        }

        
    }
    
}
