package telesko;
class A1{
    public void show(){
        System.out.println("In A1 show ");
    }
}
class B1 extends A1 {
    public void show(){
        System.out.println("In B1 show");
    }
}
class C1 extends A1 {
    public void show(){
        System.out.println("In C1 show");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A1 obj=new A1();
        obj.show();
        obj =new B1();
        obj.show();
        obj =new C1();
        obj.show();
        
    }
    
}
