import java.util.Scanner;

public class swich_basic {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter number : ");
        int x=ob.nextInt();
        switch (x) {
            case 0:
                  System.out.println("sunday");
                break;
            case 1:
                    System.out.println("Monday");
                    break;
            
            case 3:
                    System.out.println("Tuesday");
                  break;
            case 4:
                      System.out.println("Wednesday");
                      break;
            case 5:
                      System.out.println("Friday");
                    break;
            case 6:
                        System.out.println("Saturday");
                        break;
                          
                      
            default:
                System.out.println("Default number ");
        }
        ob.close();
    }
    
}
