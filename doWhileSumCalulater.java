import java.util.Scanner;

public class doWhileSumCalulater {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
    System.out.print("Enter number : ");
    int number=sc.nextInt(),sum=0;
    do{
        if(number==-1){
        break;
        }
        sum+=number;
        number=sc.nextInt();
    }while(number!=-1);
    System.out.println("Sum :"+sum);

    sc.close();
  
    }
    
}
