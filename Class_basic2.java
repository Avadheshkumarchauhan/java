class person{
    int rolln =3;
    String Name="Aman";
}


public class Class_basic2 {
    public static void main(String[] args) {
        
        person ob=new person();
        System.out.println("Roll Number "+ob.rolln+" And "+ob.Name);

        ob.Name="Avadhesh";
        ob.rolln=1;
        System.out.println("Roll Number "+ob.rolln+" And "+ob.Name);
        person ob1=new person();

        ob1.Name="Swaraj";
        ob1.rolln=2;
        System.out.println("Roll Number "+ob1.rolln+" And "+ob1.Name);
    }
    
}
