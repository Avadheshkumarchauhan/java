package unit3;

interface RefMethod{
    void sum(int x,int y);
}
class RefMethod1{
    /*This is not Static method */
    public void add(int a,int b){
        System.out.println("sum : "+(a+b));
    }
}
class RefMethod3{
    /*This is  Static method */
    public static void add(int a,int b){
        System.out.println("sum : "+(a+b));
    }
}
class RefMethod4{
    /*This is constracter */
    public RefMethod4(int a,int b){
        System.out.println("sum : "+(a+b));
    }
}
public class MethodRef {
    public static void main(String[] args) {
        //Non static refrence
        RefMethod1 obj=new RefMethod1();
        RefMethod obj1=obj::add;
        obj1.sum(3, 8);
        //Static method refrence
        RefMethod obj2=RefMethod3::add;
        obj2.sum(9, 8);
        /*Constracter refrence */
        RefMethod obj3=RefMethod4::new;
        obj3.sum(6, 45);
        
    }
    
}
