package Arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortArraylist {

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
        Collections.sort(l);
        System.out.println("Sorted Arraylist Asc order ");
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Sorted Arraylist desc order ");
        System.out.println(l);
    }
    
}
