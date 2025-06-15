package recursions;
import java.util.Scanner;
class Print{
    public void printArray(int []arr,int j){
        if(j==arr.length) {
            return;
        }

        System.out.println(j+" : "+arr[j]);
        printArray(arr, j+1);
    }
}

public class PrintArray {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Arrray size : ");
    int n=sc.nextInt();
    if(n<=0){
        System.out.println("Array is Empaty !!!");
        return;
    }
    else{
    int []arr=new int[n];
    for (int i=0;i<arr.length;i++){
        arr[i]=(int)(Math.random()*100);
    }
    Print obj=new Print();
    obj.printArray(arr, 0);
    
    
    sc.close();
    }       
  }
}
