package unit2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PhotoCopy {

    public static void main(String[] args) throws Exception {
        FileInputStream fl=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\avadhesh.jpg");
        FileOutputStream w=new FileOutputStream("A:/java/unit2/avadhesh.jpg",false);
        int a=fl.read();
        while(a>=0){

            w.write(a);
            w.flush();
           // System.out.print(a);
            //Thread.sleep(1);
            a=fl.read();
        }
        w.close();
        fl.close();

    }
    
}
