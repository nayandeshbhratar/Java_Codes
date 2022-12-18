/*
Develop an application to print the following statistics of a given file :
1) Number of uppercase letters
2) Number of lowercase letters
3) Number of words 
4) Number of lines 
5) Number of characters 
*/

import java.io.FileInputStream;
class Statistics{
    
    int upperCase = 0;
    int lowerCase = 0;
    int words =0;
    int lines =0;
    int charCount =0;
    void readFile(){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Java Programming\\test.txt");
            int i;
            while((i=fis.read())!=-1){ 
                    for (char C = 'A'; C <= 'Z'; C++) {
                        if (((char)i) == C) {
                            upperCase++;
                        }
                    }
                    for (char c ='a';c<='z';c++){
                        if (((char)i) == c) {
                            lowerCase++;
                        }
                    }   
                    
                    if (((char)i) == ' ') {
                            words++;
                        }
                    
                    if (((char)i) == '\n') {
                            lines++;
                        }
                    

                    if ((char)i==(char)i){
                        charCount++;
                    }
                }
                    
            System.out.println("Number of uppercase is \t: "+upperCase);
            System.out.println("Number of lowercase is \t: "+lowerCase);
            System.out.println("Number of words is \t: "+(words+1));
            System.out.println("Number of lines is \t: "+lines);
            System.out.println("Number of chracters is \t: "+charCount);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main_38 {
    public static void main(String[] args) {
        Statistics s1 = new Statistics();
        s1.readFile();
    }    
}
