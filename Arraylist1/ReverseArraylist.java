package Arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArraylist {
    public static void reveseArraylist(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while (i<j) {
            Integer temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arraylist Element : ");
        int n=sc.nextInt();
        System.out.print("Enter "+n+" Element : ");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        System.out.println("Original Array list ");
        System.out.println(l);
      //  reveseArraylist(l);
       //or
       Collections.reverse(l);
       System.out.println("Reverse Arraylist  ");       
        System.out.println(l);
        
 
       sc.close();
    }
    
}
