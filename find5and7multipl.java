
public class find5and7multipl {
    public static void main(String[] args) {
        int num =1;
        while (true) {
            if(num%5==0 && num%7==0){
                System.out.println("both 5 and 7 multipal : "+num);
                break;
            }
            num++;
        }
    }
    
}
