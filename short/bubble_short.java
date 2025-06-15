
public class bubble_short{
    static void short_inc(int []x){
        int n = x.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return ;
            }
        }
    }
    static void short_dec(int []y){
        int n = y.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(y[j]<y[j+1]){
                    int temp=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return ;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,7,9,6,4,8,5};
        short_inc(arr);
        System.out.println("Shorted array in acending order ");
        for(int s:arr){
            System.out.print(s+" ");
        }

        short_dec(arr);
        System.out.println("\nShorted array in decending order ");
        for(int d:arr){
            System.out.print(d+" ");
        }
        
    }
}