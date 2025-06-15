import java.util.Scanner;

public class sumOfNumberoddaddevenneg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1toNnumber : ");
        int num=sc.nextInt(),ans=0;
        int i=1;
        while (i<=num) {
            if(i%2==0){
                ans-=i;

            }
            else{
                ans+=i;
            }
            i++;
        }
        System.out.println("sum of series : "+ans);
        sc.close();
    }
    
}
