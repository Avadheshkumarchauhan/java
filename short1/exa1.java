package short1;
public class exa1 {

    static void asc(int []m){
        int l=m.length,i,j;
        boolean flag=false;
        for(i=0;i<l-1;i++){
            for(j=0;j<l-1-i;j++){
                if(m[j]<1){
                    int temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                    flag=true;
                    
                }
            }
            while(!flag){
                return ;
            }
        }
    }
    public static void main(String[] args) {
        int []x={0,5,0,3,4,2};
        asc(x);
        System.out.println("Asending order :  ");
        for(int n:x){
            System.out.print(n+" ");
        }
    }
    
}
