package telesko;

//class A extends Object {/*this is a optional  */
class A {
    int x;
    public A(){
       // super();/*optional */
        System.out.println("Defalt contstracter A ");
    }
    public A(int y){
       // super();/*optianal */
       this();
        System.out.println("Paramitrige contstracter A ");
    }
}
class B extends A{
    public B(){
        super(6);/*Assin super class and select parametrige constracter */
        //super();/*Assin super class and select default constracter */
        System.out.println("Default constracter B ");
    }
    public B(int x){
        this();/* This method assign same class or child of super */
       // super(x);/*Assin super class and select parametrige constracter */
        //super();/*Assin super class and select default constracter */
        System.out.println("Parametrige constracter B ");
    }
}

public class ThisAndSupar {
    public static void main(String[] args) {
       // A obj=new A();
        B obj1=new B(6);
        obj1.x=10;
        
    }
    
}
