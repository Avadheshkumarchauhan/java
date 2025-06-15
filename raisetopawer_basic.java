import java.util.Scanner;

public class raisetopawer_basic {

public static void main(String[] args) {
    
    Scanner ob =new Scanner(System.in);

    System.out.print("Enter Number Raise And Power : ");
    int x=ob.nextInt(),y=ob.nextInt(),ans=1;
    for(int i=1;i<=y;i++){
        ans*=x;
    }
    System.out.println(x+" ^ "+y+" : "+ans);
    ob.close();
}
    
}
