//Writing to a file (File handling)
import java.io.FileOutputStream;

class FileTest{
    String str = "This is a test file to write in a file using file handling";
    void writeFile(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\Github Java\\Java Programming\\test1.txt");
            fos.write(str.getBytes());
            fos.flush();
            fos.close();
            }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main_36 {
    public static void main(String[] args) {
        FileTest f1 = new FileTest();
        f1.writeFile();
    }
}
