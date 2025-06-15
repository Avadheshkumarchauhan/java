package unit2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class VideoCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream r =new FileInputStream("D:\\javascript\\Bind in javascript _ chai aur #javascript1.mp4");
        FileOutputStream w=new FileOutputStream("A:/java/unit2/video1.mp4");
        int x=r.read();
        while(x>=0){
            w.write(x);
            w.flush();
            x=r.read();
           
        }
        r.close();
        w.close();
    }
    
}
