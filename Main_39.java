//Develop an application to copy the contents of one program file into another without comments 

import java.io.FileOutputStream;
import java.io.FileInputStream;

class Testclass{
    void test1(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\withComment.java");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\withoutComment.java");
        
            boolean MultiLineComment = false;
            boolean SingleLineComment = false;
            int c1;
            if ((c1 = fis.read()) != -1) {
                int c2;
                while (c1 != -1) {
                    if ((c2 = fis.read()) == -1) {
                        fos.write(c1);
                        break;
                    }
                    if (c1 == '/' && c2 == '*') {
                        MultiLineComment = true;
                        c1 = fis.read();
                        continue;
                    } else if (c1 == '*' && c2 == '/') {
                        MultiLineComment = false;
                        c1 = fis.read();
                        continue;
                    } else if (c1 == '/' && c2 == '/'){
                        SingleLineComment = true;
                        c1 = fis.read();
                        continue;
                    }
                    if (MultiLineComment) {
                        c1 = c2;
                        continue;
                    }
                    if (SingleLineComment) {
                        if (c2 == '\n') {
                            SingleLineComment = false;
                            fos.write(c2);
                            c1 = fis.read();
                            continue;
                        } else if (c1 == '\n') {
                            SingleLineComment = false;
                            fos.write(c1);
                            c1 = c2;
                            continue;
                        } else {
                            c1 = fis.read();
                            continue;
                        }
                    }
                    fos.write(c1);
                    c1 = c2;
                }
                fos.flush();
                fos.close();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}   
public class Main_39 {
    public static void main(String[] args) {
       Testclass d1 = new Testclass();
       d1.test1();
    }
    
}