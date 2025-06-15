package recursions;

import java.util.Scanner;
/*Increasing number  */
class Increase{

    public  void increasinNumber(int n){

        if(n==0){
            return;
        }
        increasinNumber(n-1);
        System.out.print(n+" ");
        if(n%10==0){
            System.out.println();
        }
    }
}
/*Decreasing number  */
class Decrease{

    public  void decreasinNumber(int n){

        if(n==0){
            return;
        }
        System.out.println(n+" ");
       
        decreasinNumber(n-1);
    }
}

public class PrintNumber1 {
  

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.println("-----Printing increasing number -----");
    
        
        Increase ob =new Increase();/*Create not Static method then create bojec then .calling method */
        ob.increasinNumber(num);
   
       /*Decrease number method calling  */
       System.out.println("\n-----Printing decreasing number -----");
       Decrease obj1=new Decrease();
       obj1.decreasinNumber(num);

        sc.close();
    }
    
}
