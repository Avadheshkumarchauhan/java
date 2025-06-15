class app{
    int a,b;


    app( int x,int y){
        System.out.println("Hello Contracter ");
        a=x;
        b=y;
    }
    int sum(){
        return (a+b);
    }
    int sub (){
        return (a-b);
    }
    int mul(){
        return (a*b);
    }

}

public class contracters {
    public static void main(String[] args) {
        app ob =new app(2,4);

      System.out.println(ob.sum());  
      System.out.println(ob.sub()); 
      System.out.println(ob.mul()); 
      app ob1 =new app(8,4);

      System.out.println(ob1.sum());  
      System.out.println(ob1.sub()); 
      System.out.println(ob1.mul()); 
        
    }
    
}
