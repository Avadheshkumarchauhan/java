
package unit3;

interface A{
    static int x=10;
    final String name="Avadhesh";
    void f1();
    static void f2(){
        System.out.println("Hello , Avadhesh kumar chauhan , This is a static method ");
    }
        default void f3(){
            System.out.println("default method in java ");
        }
    
} 
 class B implements A{
    public void f1(){
        System.out.println("Override method ");
    }
}

public class Anonomous {

    public static void main(String[] args) {
        A a=new B();
        a.f1();
        a.f3();
        System.out.println(A.name);
        System.out.println(A.x);
        A.f2();
        /*Or */
        // System.out.println(a.x);
        // System.out.println(a.name);
        
        
    }
}