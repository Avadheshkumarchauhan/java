package thread;


    class A implements Runnable{
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {e.printStackTrace();
            }
            
        }
    }
}
public class intro1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable obj1= new A();
        Runnable obj2= new B();
        Thread a=new Thread(obj1);
        Thread b=new Thread(obj2);
       
        a.start();
        Thread.sleep(10);
        b.start();
    }

    
}
