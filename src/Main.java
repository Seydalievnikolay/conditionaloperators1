import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Задача1");
        int humanAge = 18;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        }
        if (humanAge < 18) {
            System.out.println("Если возраст человека меньше 18,то он не достиг совершеннолетия, нужно немного подождать».");
        }
    }
    public static void task2(){
        System.out.println("Задача2");
        int airTemperatureLower = 5;
        if (airTemperatureLower < 5) {
            System.out.println("На улице ниже 5 градусов, нужно надеть шапку");
        } else {
                System.out.println("На улице выше 5 градусов, можно идти без  шапки");
        }

    }




    public static void task3() {
        System.out.println("Задача3");
        int driverSpeed = 60;
        if (driverSpeed > 60) {
            System.out.println("Если скорость больше " + driverSpeed + " ,то придется платить штраф");
        }

        if (driverSpeed < 60) {
            System.out.println("Если скорость менише " + driverSpeed + " ,можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача4");
    }
}