package ExeptionError;

public class ThrowExc {
    public static void main(String[] args) {
        
    
    int x=20;
    int j=0;

    try {
        j=18/x;
        if(j==0){
            throw new ArithmeticException("I do not want to print Zero.");
        }
    }
    catch (ArithmeticException e) {
        j=18/1;
        System.out.println("Default value output : "+e);
    }
    // //or
    // catch(Exception e){
    //     j=18/1;
    //     System.out.println("Error : "+e);
    // }
    System.out.println(j);
    System.out.println("Bye ... ");
  }
    
}
