/*
Construct a program to print the temperature as follows :
1) If temperature < -273 then print "Invalid temperature"
2) If temperature = -273 then print "Absolute zero temperature"
3) If temperature >-273 but less then 0 then print "Temperature is below freezing point"
4) If temperature = 0, then print "Temperature is at freezing "
5) If temperature >0 but less than 100 then print "Temperature is at normal range"
6) If temp = 100, then print "Temperature is at boiling point"
7) If temperature >100 then print "Temperature is above boling point"
 */


public class Main_07 {
    public static void main(String[] args) {

        float temp = -72;

        if (temp < -273){
            System.out.println("Invalid Temperature");
        }
        else if (temp == -273){
            System.out.println("Absolute zero temperature");
        }
        else if (temp > -273 && temp <0){
            System.out.println("Temperature is below freezing point");
        }
        else if (temp == 0){
            System.out.println("Temperature is at freezing point");
        }
        else if (temp> 0 && temp < 100){
            System.out.println("Temperature is at normal range");
        }
        else if (temp == 100){
            System.out.println("Temperature is at boiling point");
        }
        else if(temp > 100){
            System.out.println("Temperature is above boiling point");
        }
        else {
            System.out.println("Temperature is Invalid.......");
        }
    }
}
