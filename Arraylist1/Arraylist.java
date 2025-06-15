package Arraylist1;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        
        ArrayList<Integer> l1=new ArrayList<>();
        
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.add(9);
        System.out.println(l1);
        l1.add(1,100);
        System.out.println(l1);
        l1.set(2, 50);
        System.out.println(l1);
        l1.remove(3);
        l1.remove(Integer.valueOf(9));
        System.out.println(l1);
        l1.remove(Integer.valueOf(90));
        System.out.println(l1);
      
        //or
        for (int j=0;j<l1.size();j++){
System.out.print(l1.get(j)+" ");
        }
        boolean fl=l1.contains(Integer.valueOf(98));
        System.out.println("\n"+fl);
        // ArrayList l=new ArrayList();
        // l.add(1);
        // l.add("hello");
        // l.add(true);
        // l.add(56.87);
        // System.out.println(l);

    }
    
}
