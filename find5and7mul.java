public class find5and7mul {
    public static void main(String[] args) {
        int n=1;
        while(true){
            if((n%5==0)&&(n%7==0)){
                System.out.println("5 And 7 multiple is : " +n);
                break;
            }
            n++;
        }
    }
    
}
