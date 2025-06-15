package array1;

import java.util.Scanner;

class SearchNumber{
    int ans=-1;
    void find(int x){
        int []arr={2,4,6,7,9,3,1,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        if(ans!=-1){
        System.out.println("Find of Array number "+x+" is index : "+ ans);
        }
        else{
            System.out.println("Not found of Array number : "+x);
        }
    }
}

public class SearchArrayNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        SearchNumber ob =new SearchNumber();
        System.out.print("Enter Find number : ");
        int num=sc.nextInt();
        ob.find(num);
        sc.close();
         
    }
    
}
