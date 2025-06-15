import java.util.Scanner;

public class fectorial_basic {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter fectorial Number : ");

        int fec=1,Number=ob.nextInt();
        System.out.print("Factorial of "+Number+" : ");
        while(Number>0){
            if(Number==1){
                fec*=Number;
                System.out.print(Number+"= ");
                break;
            }
            else{
                fec*=Number;
                System.out.print(Number+" x ");
            }

            Number--;
        }
        System.out.print(fec);
        ob.close();
    }
    
}
