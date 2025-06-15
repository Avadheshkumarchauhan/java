public class insertion_short {
    static void short_inc(int []m){
        int l=m.length,i,j;
        for(i=1;i<l;i++){
            j=i;
            while(j>0 && m[j]<m[j-1]){
                int temp=m[j];
                m[j]=m[j-1];
                m[j-1]=temp;
                j--;
            }
        }
    }
    static void short_desc(int []n){
        int l=n.length,i,j;
        for(i=1;i<l;i++){
            j=i;
            while(j>0 && n[j]>n[j-1]){
                int temp=n[j];
                n[j]=n[j-1];
                n[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={6,3,5,9,1,4};
        short_inc(arr);
        System.out.println("    Shorted array in incrise order    ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println(); 
        short_desc(arr);
        System.out.println("     Shorted array in decrise order    ");
        for(int y:arr){
           System.out.print(y +" ");

        }
    }
    
}
