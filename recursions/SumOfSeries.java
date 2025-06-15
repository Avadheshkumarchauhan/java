package recursions;

import java.util.Scanner;
class Series{
    public int sumOfSeries(int n){
        if(n==0)return 0;

        return sumOfSeries(n-1)+n;
    }
}
class AlternativeSeries{
    public int sumOfAlternative(int n){
        if(n==0)return 0;
        if(n%2==0)return sumOfAlternative(n-1)-n;
        else return sumOfAlternative(n-1)+n;

        
    }
}
public class SumOfSeries {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num =sc.nextInt();
        Series obj=new Series();
        System.out.println("Sum of 1 to "+num+" number : "+obj.sumOfSeries(num));
        AlternativeSeries obj1=new AlternativeSeries();
        System.out.println("Sum of alternative series : "+obj1.sumOfAlternative(num));

        sc.close();
    }
    
}
