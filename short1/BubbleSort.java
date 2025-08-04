/*
 *Bubble sort is a sort algorithems
 and it is a Stable and In-place

 */

package short1;

import java.util.Scanner;

public class BubbleSort {
    public static void printArray(int []arr){
     for(int s:arr){
        System.out.print(s+" ");
       }
       System.out.println();
    }

    /*
     This is a worst case 
     and Sort in assending order 
     TC --> O(n^2)
     SC ---> O(1)
    */
    public static void bubbleShort(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    /*
     This is a worst case 
     and Sort in Decending order 
    */
    public static void bubbleShortDec(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    /*
     This is a best case 
     and Sort in assending order 
     TC --> O(n)
     SC ---> O(1)
    */
    public static void bubbleShortBest(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if(flag==false){
                    return;
                }
            }

        }
    }
    /*
     This is a worst case 
     and Sort in Decending order 
    */
    public static void bubbleShortDecBest(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if(flag==false){
                    return;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter array element "+n+" : ");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        } 
        int [] arr1=arr.clone();
        int [] arr2=arr.clone();
        int [] arr3=arr.clone();
        //or

        // for(int i=0;i<n;i++){

        //     arr1[i]=arr[i];
        // } 
        sc.close();
        bubbleShort(arr);
        System.out.println("Array element sort is assending order ");  
       printArray(arr);
        bubbleShortDec(arr1);
        System.out.println("Array element sort is decending order ");
        printArray(arr1);
        bubbleShortBest(arr2);
        System.out.println("Array element sort is assending order best case ");  
       printArray(arr2);
        bubbleShortDec(arr3);
        System.out.println("Array element sort is decending order best case");
        printArray(arr3);
    }
    
}