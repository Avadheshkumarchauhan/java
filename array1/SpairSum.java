package array1;

import java.util.Scanner;

public class SpairSum {
    static int spair(int []x,int y){

        int ans=0,n=x.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(x[i]+x[j]==y){
                    ans++;
                }
            }
        }

        return ans;
    }
    static int triplet(int []x,int y){

        int ans=0,n=x.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                if(x[i]+x[j]+x[k]==y){
                    ans++;
                }
             }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array size : ");
        int x=sc.nextInt();
        int []arr=new int[x];
        System.out.print("Enter Array "+x+" element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target number : ");
        int target=sc.nextInt();
        // Sum of spair 
        System.out.println(" Sum of spair Count : "+spair(arr, target));
        //Sum of triplete
        System.out.println("Sum of Triplete count : "+triplet(arr, target));


        sc.close();
    }
    
}
