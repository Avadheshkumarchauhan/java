public class n3notmul_print {

    public static void main(String[] args) {
        int n=1;
        /*
        while (n<=50) {
            if(n%3==0){
                n++;
                continue;
                
            }
            System.out.println(n);
            n++;

        }
        //OR
        */
         conts :for(;n<=50;n++) {
            if(n%3==0){        
                continue conts ;
                
            }
            System.out.println(n);
        
        }

    }
}
