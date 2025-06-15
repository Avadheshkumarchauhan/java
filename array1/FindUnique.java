package array1;
import java.util.Scanner;

public class FindUnique {
    static int findUnique(int []arr){

        int ans=-1,n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array size : ");

        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.print("Enter Array "+s+" element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x=findUnique(arr);
        if(x!=-1){
        System.out.println("Find unique value : "+x);
        }
        else{
            System.out.println("This is Not Unique Valuein Array ");
        }

        sc.close();
    }
    
}
