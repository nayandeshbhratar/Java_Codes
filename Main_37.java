// Construct a program to read from a file saved on the system & write it to another file & save it on system

import java.io.*;
class Read_and_Write{
    void file(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\test.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\test3.txt");
                int i;
                while((i=fis.read())!=-1){ // read 
                    //System.out.print((char)i);
                    fos.write(i); // write
                }
            }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main_37 {
    public static void main(String[] args) {
        Read_and_Write r1 = new Read_and_Write();
        r1.file();
    }
}
