import pw.skils.*;
public class packesDemo {
    public static void main(String[] args) {
        packs ob=new packs();
        System.out.println("Outer packjeses Non -child class : "+ob.name);
        app3 obs=new app3();
        obs.outerchild();

        
    
    }  
    
}
class app3 extends packs{
    public void outerchild(){
        app3 ob=new app3();
        System.out.println("Outer packeses and child class : "+ob.name);
    }
}
