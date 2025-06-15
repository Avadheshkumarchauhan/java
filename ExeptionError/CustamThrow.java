package ExeptionError;

import java.util.Scanner;

//class Avadhesh extends Exception{
    //or
class Avadhesh extends RuntimeException{
    public Avadhesh(String str){
        super(str);
    }

    
}

public class CustamThrow  {
  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int x=sc.nextInt();
        int j=0;
    
        try {
            j=18/x;
            if(j==0){
                throw new Avadhesh("I do not want to print Zero.");
            }
        }
        catch (Avadhesh e) {
            j=18/1;
            System.out.println("Default value output : "+e);
        }
        // //or
        catch(Exception e){
            j=18/1;
            System.out.println("Error : "+e);
        }
        finally{
        System.out.println(j);
        System.out.println("Bye ... ");
        sc.close();
    }
      
        
    }
    
}
