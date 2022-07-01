import java.io.*;  
public class FileDemo {  
    public static void main(String[] args) {  
  
        String path = "";  
        boolean bool = false;  
        try {  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println(file);  
            File file2 = file.getCanonicalFile();  
            System.out.println(file2);  
            bool = file2.exists();  
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            if (bool) {  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
} 