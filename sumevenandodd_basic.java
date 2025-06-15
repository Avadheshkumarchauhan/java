import java.util.Scanner;

public class sumevenandodd_basic {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter Numer : ");
        int i=0,n=ob.nextInt(),Ans=0;
        while(i<=n){
            if(i%2==0){
                Ans-=i;
            }
            else{
                Ans+=i;
            }
            i++;
        }
        System.out.println("Sum of 1 to "+n+" = "+Ans);

        ob.close();
    }
    
}
