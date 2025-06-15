package thread;


class A1 extends Thread{
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
class B1 extends Thread{
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
public class intro {

    public static void main(String[] args) throws InterruptedException {
        A1 obj1= new A1();
        B1 obj2= new B1();
        //System.out.println(obj1.getPriority());//Get priority 
       //obj2.setPriority(Thread.MAX_PRIORITY);//set priority 

        obj1.start();
        Thread.sleep(10);
        obj2.start();
    }
}
