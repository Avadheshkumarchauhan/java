import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1 to 7 :");
        int num=sc.nextInt();
        String day="";
        switch (num) {
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;        
            default:
            day="Wrong input try again true input  ";
        }
        System.out.println(day);
        sc.close();
    }
    
}
