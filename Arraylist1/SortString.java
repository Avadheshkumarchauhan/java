package Arraylist1;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {
        
    
    ArrayList<String> st =new ArrayList<>();
    
    st.add("Avadhesh");
    st.add("Kumar");
    st.add("Chauhan");
    st.add("Swaraj");
    st.add("Chauhan");
    System.out.println("Original Arraylist ");
    System.out.println(st);
    Collections.sort(st);
    System.out.println("Asc order arraylist ");
    System.out.println(st);
    Collections.sort(st,Collections.reverseOrder());
    System.out.println("Desc order arraylist ");
    System.out.println(st);

    }
}
