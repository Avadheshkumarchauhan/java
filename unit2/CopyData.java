package unit2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class CopyData {

    public static void main(String[] args) throws Exception {
        FileWriter wr=new FileWriter("A:/java/unit2/intro3.java",false);
        FileReader fl=new FileReader("A:/java/thread/intro3.java");
        BufferedReader sc=new BufferedReader(fl);
        String line=sc.readLine();
        while(line!=null){
           
            wr.write(line);
            wr.write("\n");
            wr.flush();
            Thread.sleep(60);
            line=sc.readLine();
        }
        sc.close();
        wr.close();
        fl.close();
    }
    
}
