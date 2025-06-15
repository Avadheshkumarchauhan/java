package array2D; 
  
  public class intro {
    public static void main(String[] args) {
        
        int [][]arr={
                    {1,2 ,3,5},
                    {22,11,3},
                    {8,9,3,6,7},
                    {0}
              };

                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                            System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                    }
           
            int [][]arr1={{1,2,3},{1,2 ,3,4},{1 ,2 ,3,4,5,6,7}};
            for(int []a:arr1){
                for(int b:a){
                    System.out.print(b+" ");
                }
                System.out.println();

            }
    }
    
}
