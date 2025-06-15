package array1;


public class SwapNumber {

    static void swapWithVar(int x,int y){ 

        System.out.println("Before Swap value " +x+" , "+y);
        int tamp=0;
        tamp=x;
        x=y;
        y=tamp;
        System.out.println("After Swap value : "+x+" ,"+y);
    }
    static void swapWithoutVar(int x,int y){ 

        System.out.println("Before Swap value " +x+" , "+y);
        
        x=x+y;
        y=x-y;
        x=x-y;
       
        
        System.out.println("After Swap value : "+x+" ,"+y);
    }
    public static void main(String[] args) {
        swapWithVar(2, 5);
        swapWithoutVar(6, 7);
    }
}
