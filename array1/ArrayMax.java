package array1;

class Max{
    int max=0;
    void maxium(){
        int []arr={2,5,8,55,33,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Array of maximum number : "+max);
    }

}

public class ArrayMax {
    public static void main(String[] args) {
        Max ob=new Max();
        ob.maxium();
        
    }
    
}
