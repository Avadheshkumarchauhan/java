package short1;
public class short_lexico_string {
    static void lexico(String[]name){
        int i,j,x=name.length;
        for(i=0;i<x-1;i++){
            int ind=i;
            for(j=i+1;j<x;j++){
                if(name[j].compareTo(name[ind])<0){
                    ind=j;
                }
            }
            String temp=name[i];
            name[i]=name[ind];
            name[ind]=temp;
        }
    }
    public static void main(String[] args) {
        String []frut={"mango","apple","grapes","banana","papayas","papaya"};
        lexico(frut);
        System.out.println("Lexico order :  ");
        for(String x:frut){
            System.out.print(x+ ", ");
        }
    }
}