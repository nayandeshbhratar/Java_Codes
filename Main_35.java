// File Handling 
// Reading from a file

import java.io.FileInputStream;

class FileTest{
    void readFile(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Github Java\\Java Programming\\test.txt");
                int i;
                while((i=fis.read())!=-1){
                    System.out.print((char)i);
                }
            }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main_35 {
    public static void main(String[] args) {
        FileTest f1 = new FileTest();
        f1.readFile();
    }
}
