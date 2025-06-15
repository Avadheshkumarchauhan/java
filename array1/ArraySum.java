package array1;

class Arr{
    void sum(){
        int []arr={2,4,6,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        System.out.println("sum of array : "+ans);
    }
}

public class ArraySum {
    public static void main(String[] args) {
        Arr ob=new Arr();
        ob.sum();
        
    }
    
}
