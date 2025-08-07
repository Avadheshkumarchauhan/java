import java.util.Scanner;

public class alternativeSomeoddEven {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int sum=0;
        sc.close();
        for(int i=0;i<=n;i++){
            
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
 
        if (sum%2==0) {
            System.out.println("Sum of number is even : "+sum);
        }
        else{
            System.out.println("Sum of number is odd : "+sum);
        }

    }
    
}
