// Input Stream

import java.io.ByteArrayInputStream;

class IOTest {
    String str = "Welcome to Byte Stream";
    
    void readFile(){
        byte b[]=str.getBytes();
        ByteArrayInputStream bias = new ByteArrayInputStream(b);
        int i;
        while((i=bias.read())!=-1){
            System.out.print((char)i);
        }
    }
}

public class Main_33 {
    public static void main(String[] args) {
        IOTest obj = new IOTest();
        obj.readFile();
    }
}
