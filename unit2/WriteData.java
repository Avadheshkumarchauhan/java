package unit2;

import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) throws Exception {
    FileWriter wr=new FileWriter("A:/java/unit2/texts.txt",false);

    wr.write("hello\n");
    wr.write(120+"\n");
    wr.write("hellos\n");
    wr.write("234");

    wr.close();

        
    }
    
}
