package unit2;

import java.io.File;

public class FileExample {
    public static void main(String[] args) throws Exception {
        
        File fl=new File("A:/java/unit2/abcde.txt");
        if(fl.exists()){
            System.out.println("File is exits ");
        }
        else{
            System.out.println("File do not exits , please file create ");
           if(fl.createNewFile()){
            System.out.println("File is create succecfully ");
           }
           else{
            System.out.println("File is not create succesfully ");
           }
        }
        System.out.println("File name : "+fl.getName());
        System.out.println("Path : "+fl.getPath());
        System.out.println("Absolute path : "+fl.getAbsolutePath());
        System.out.println("File is a directory : "+fl.isDirectory());
        System.out.println(("File ia a file : "+fl.isFile()));
        System.out.println("File size : "+fl.length()+" bytes ");
        if(fl.delete()){
            System.out.println("File is deleted succesfully ");
        }else{
            System.out.println("Failed to delete  file ");
        }
        
    }
    
}
