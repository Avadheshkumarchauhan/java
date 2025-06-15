package unit3;

@FunctionalInterface/* This is a optional */
interface Lembda1  {
    int sum(int x,int y);
    
}
// class Lembda2 implements Lembda1{
//     public int sum(int x,int y){
//         return x+y;
//     }
// }
      /*OR */
public class LambdaExp {
    public static void main(String[] args) {
       // Lembda1 obj=new Lembda2();
       /*OR */
        Lembda1 obj=(a,b)->a+b;
        System.out.println("Sum of two number "+obj.sum(4, 6));
        System.out.println("Sum of two number "+obj.sum(9, 6));
        
    }
    
}
