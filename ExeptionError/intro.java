package ExeptionError;

public class intro {

    public static void main(String[] args) {
        
        int x=2;
        int y=0;
        String st = "avadhesh";
        int []arr=new int[5];
        try{
        y=19/x;
        System.out.println(st.length());
        System.out.println(arr[1]);
        System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Exeption Error divided by zero : "+e);
        }
        catch(ArrayIndexOutOfBoundsException d){
            System.out.println("Array Error : "+d);
        }
        catch(Exception f){
            System.out.println("Error : "+f);
        }
        System.out.println(y); 
        System.out.println(st);
        System.out.println("bye");
        //or
        // try{
        //     System.out.println(arr[6]);

        // }
        // catch(Exception d){
        //     System.out.println("erroe : "+d);
        // }
    }
    
}
