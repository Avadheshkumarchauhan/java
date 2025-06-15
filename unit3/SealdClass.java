package unit3;

 sealed class A1 permits B1,C1{
    public void f(){
        System.out.println("Seald class in java of super class ");
    }
}
 non-sealed class B1 extends A1{
    public void f2(){
        System.out.println("hello sub class B1");
    }
}
 final class C1 extends A1 {
    public void f3(){
        System.out.println("hello sub class  C1");
    }
}
class D1 extends B1{
    public void f4(){
        System.out.println("Class D4 extend A1 and B1 ");
    }
}

public class SealdClass {
    public static void main(String[] args) {
       A1 a =new A1();
       a.f();
        B1 b=new B1();
        b.f();
        b.f2();
        C1 c=new C1();
        c.f();
        c.f3();
        D1 d =new D1();
        d.f4();
        d.f2();
        d.f();
    }
    
}
