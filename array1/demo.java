package array1;
class classarray{
    void onedayarray(){

        int []arr= new int [3];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
       // arr[3]=6;// exception array index of boundry
        System.out.println("One -day Array ");
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        int []arr1={
            1,2,3,4,5,6
        };
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        String []arr2={
            "Avadhesh","Amit","Akash"
        };
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        
        

    }
    void multyArray(){
        int [][]arr4={{1,2,3},{5,8,7},{3,6,0},{1,2,3}};
        // int [][]arr3=new int[2][4];
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                System.out.print(arr4[i][j] +" ");
            }
            System.out.println();

        }
    }

}

public class demo {
    public static void main(String[] args) {
         classarray ob=new classarray();
         ob.onedayarray();
         ob.multyArray();
         int []arr={1,2 ,3,4,5,6,7,8};
         for(int x:arr){
            System.out.print(x+" ");
         }

    }
    
}
