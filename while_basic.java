import java.util.Scanner;

public class while_basic {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        
        int i=1,n,sum=0;
        System.out.print("Enter number : ");
        n=ob.nextInt();
        while(i<=n){
            System.out.print(i+" ");
            if(i<=10){
                System.out.print(" ");
            }
            if(i%10==0){
                System.out.println();
            }
            sum+=i;
            i++;
        }
        System.out.println("sum = "+sum);
        ob.close();
    }

    
}
