package array1;

import java.util.Scanner;

public class countFindElement {
    //Number of search element in array
    static int count(int []arr,int x){
        int couts=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){

                couts++;
            }
        }
        return couts;

    }
    //Number of search last element in  array 
    static int lastSearchElement(int []arr,int y){
        int couts=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==y){

                couts=i;
            }
        }
        return couts;
    }
    //Grater number of search element in array 
    static int graternumber(int []arr,int z){
        int couts=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>z){

                couts++;
            }
        }
        return couts;
    }
    //Taking input in array memory
    static int []tekeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }sc.close();
        return arr;
        

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Search element : ");
        int s=sc.nextInt();
       
        int []arr=tekeInput();
      
        System.out.println("Count of elements of array : "+count(arr, s));
        System.out.println("search of last element index : "+lastSearchElement(arr, s));
        System.out.println("Grater number of Array of Element : "+graternumber(arr, s));
        sc.close();
    }
    
    
}
