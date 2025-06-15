import java.util.Scanner;

public class persons1 {
    int rollno;
    String name;

    public static void main(String[] args) {
        persons1 ob=new persons1();
        ob.rollno=1;
        ob.name="Avadhesh";
        System.out.println("rollnumber : "+ob.rollno);
        System.out.println("name : "+ob.name);

        persons1 ob1=new persons1();
        ob1.rollno=2;
        ob1.name="Amit";
        System.out.println("rollnumber : "+ob1.rollno);
        System.out.println("name : "+ob1.name);
        persons1 ob2=new persons1();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name : ");
        ob2.name=sc.nextLine();
        System.out.println("Name : "+ob2.name);
        sc.close();
    }
    
}
