package thread;

class counter{
    int coun;
    public synchronized void increment(){
        coun++;
    }
}
public class intro3 {

    public static void main(String[] args) throws InterruptedException  {
        counter S =  new counter();
        Runnable obj1 = () -> 
        {
        for(int i=0;i<=100;i++){
            S.increment();
        }
       };
       Runnable obj2 = () ->
        {
            for (int i=0;i<=100;i++){
                S.increment();
            }
        };
        Thread a=new Thread(obj1);
        Thread b=new Thread(obj2);
        a.join();
        b.join();
        a.start();       
        b.start();
        System.out.println("increment : "+ S.coun);
    }

    
}
