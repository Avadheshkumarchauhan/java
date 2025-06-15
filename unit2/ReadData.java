package unit2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadData {

    public static void main(String[] args)  throws Exception{
        FileReader fl=new FileReader("A:/java/unit3/SealdClass.java");
        FileWriter wr=new FileWriter("A:/java/unit2/SealdClass.java",false);
        BufferedReader br=new BufferedReader(fl);
        String line =br.readLine();
        while(line!=null){
            System.out.println(line);
            wr.write(line);
            wr.write("\n");
            wr.flush();
            Thread.sleep(600);
            line=br.readLine();
        }

        br.close();
        fl.close();
        wr.close();
    }
    
}
