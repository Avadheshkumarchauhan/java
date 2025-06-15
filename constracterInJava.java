import java.util.Scanner;

class Algebra{
    int a,b;
Algebra(int x, int y){
    a=x;
    b=y;
    System.out.println("Consracter of algebra class called ");
}
int add(){
    return a+b;
}
int sub(){
    return a-b;
} 
int multpl(){
    return a*b;
}int div(){
    return a/b;
}int mod(){
    return a%b;
}
    
}
public class constracterInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number : ");
        int m=sc.nextInt(),n=sc.nextInt();
        Algebra ob=new Algebra(m,n); 

        System.out.println("sum : "+ob.add());
        System.out.println("sub : "+ob.sub());
        System.out.println("multiply : "+ob.multpl());
        System.out.println("division : "+ob.div());
        System.out.println("modules : "+ob.mod());
        sc.close();
    }
    
}
