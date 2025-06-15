package pw.skils;

public class packs {
    public String name="Avadhesh kumar chauhan";
    public void interclass(){
        System.out.println("Within class and same packeses : "+name);
    }

    public static void main(String[] args) {
        packs ob =new packs();
        System.out.println("Within packese main function : "+ob.name);
        ob.interclass();
        app ob1=new app();
        ob1.outerClass();
    }
 
    
}
class app{

    public void outerClass(){

        packs ob =new packs();
        System.out.println("Within packeses outer class "+ob.name);
    }
    

}



    

