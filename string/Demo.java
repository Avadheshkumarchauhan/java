package string;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        String str ="Avadhesh kumar chauhan";
        System.out.println(str);
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String st1=sc.nextLine(); 
        String st=sc.next(); 
        System.out.println(st1+": "+st);
        sc.close();
        System.out.println(str.length());
        System.out.println(str.charAt(21));
        System.out.println(str.indexOf('a'));
        String st2="aellow";
        String st3="hellow";
        System.out.println(" compatre String : "+st2.compareTo(st3));
        System.out.println(str.contains("vad"));
        System.out.println(str.startsWith("Avad"));
        System.out.println(str.endsWith("han"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(st2.concat(" "+st3));       
    }
    
}
 
