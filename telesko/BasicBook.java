package telesko;



public class BasicBook {
public static void main(String[] args) {
    
    int i=10;
    int n=i++%5;
    System.out.println("i : "+i+" , n : "+n);//11,0
    int j=10;
    int m=++j%5;
    System.out.println("j : "+j+" , m : "+m);//11,1
    int x=5,y=1;
    while (x>0) {
        x--;
        y*=x;
        System.out.println(y);
    }
    System.out.println();
    //print 3 to 36 multiple of 3
    int a=3,b=0;
    while (true) {
        if (a*b==36) {
            break;
            
        }
        b++;
        System.out.print(a*b+" ");
        
    }
    System.out.println();

    //or
    for(int k=1;k<=12;k++){
        System.out.print(a*k+" " );

    }
    System.out.println();
   
}
    
}
