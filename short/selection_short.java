//package short;

public class selection_short {
    static void short_inc(int []x){
      int n=x.length,w=0;
        for(int i=0;i<n-1;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(x[j]<x[ind]){
                    ind=j;
                }
            }
            if(ind!=i){
                int temp=x[i];
                x[i]=x[ind];
                x[ind]=temp;
                w++;
            }
        }
        System.out.println("Swaping element time : "+w);
    }
    static void short_dec(int []y){
        int n=y.length,w=0;
        for(int i=0;i<n-1;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(y[j]>y[ind]){
                    ind=j;
                }
            }
            if(ind!=i){
                int temp=y[i];
                y[i]=y[ind];
                y[ind]=temp;
                w++;
            }
        }
        System.out.println("Swaping element time : "+w);
    }

    public static void main(String[] args) {
        int [] arr={1,2,4,3};
        short_inc(arr);
        System.out.println("Shorted array in Acending order ");
        for(int s:arr){
            System.out.print(s+" ");
        }
        short_dec(arr);
        System.out.println("Shorted array in Decending order ");
        for(int s:arr){
            System.out.print(s+" ");
        }
    }
    
}
