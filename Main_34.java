// Output Stream

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class IOTest{
    String str = "S.B. Jain Institute of Technology, Management & Research";
    void writeFile(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\test.txt");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                baos.write(str.getBytes());
                baos.writeTo(fos);
                baos.flush();
                baos.close();
            }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main_34 {
    public static void main(String[] args) {
        IOTest a1 = new IOTest();
        a1.writeFile();
    }
}
