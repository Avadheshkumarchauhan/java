package unit2;


 import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
//import java.util.Scanner;

public class ReadDataKeybord {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter data in file : ");
        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(read);
        String data =bfr.readLine();

        //Or
        // Scanner sc=new Scanner(System.in);
        // String data1=sc.nextLine();
        FileWriter wr=new FileWriter("A:/java/unit2/text.txt",false);
       while(data!="no"){
       
        // wr.write(data);
        wr.write(data);
        wr.write("\n");
        wr.flush();
        System.out.println("Contiue : Enter data and exit (ctrl+c) ? ");
        data=bfr.readLine();

       }


        read.close();
       bfr.close();
       wr.close();
       //sc.close();
        

    }
    
}
