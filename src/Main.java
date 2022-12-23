import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача1");
        int humanAge = 18;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else if (humanAge < 18) {
            System.out.println("Если возраст человека меньше 18,то он не достиг совершеннолетия, нужно немного подождать».");
        }
    }

    public static void task2() {
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
        int driverSpeed = 63;
        if (driverSpeed > 60) {
            System.out.println("Если скорость больше " + driverSpeed + " ,то придется платить штраф");
        }

        if (driverSpeed < 60) {
            System.out.println("Если скорость менише " + driverSpeed + " ,можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int humanAge = 14;
        if (humanAge > 2 && humanAge < 6) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в детский сад");
        } else if (humanAge > 7 && humanAge < 18) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в школу");
        } else if (humanAge > 18 && humanAge < 24) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в университет");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача5");
        int kidAge = 10;
        boolean accompanyingAdult = true;
        if (kidAge < 5){
        System.out.println("Если возраст ребенка равен " + kidAge + " ,то ему нельзя кататься на аттракционе");
        }
        else if (kidAge > 5 && kidAge < 14){
            System.out.println("Если возраст ребенка равен " + kidAge + " ,то можно кататься на аттракционе в сопровождении взрослого" );
        }
        else if (kidAge > 14){
            System.out.println("Если возраст ребенка равен " + kidAge + " ,то можно кататься на аттракционе без сопровождения");
        }

    }
    public static void task6() {
        System.out.println("Задача6");
        int carCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = 42;
        int peopleAreSitting = 37;
        int peopleAreStanding = 13;
        if (peopleAreSitting >= 60 && peopleAreStanding >= 42){
            System.out.println("В вагоне нет мест");
        } if (seatingPlaces > peopleAreSitting) {
            System.out.println("В вагоне есть " + (seatingPlaces-peopleAreSitting) + " мест для сидения");
        } if (standingPlaces > peopleAreStanding) {
            System.out.println("В вагоне есть " +(standingPlaces-peopleAreSitting)+ " стоячих мест");
        }
    }
    public static void task7() {
        System.out.println("Задача7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two){
            if (one>=three){
                System.out.println("Наибольшее число " + one);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        }
        else if (two > one){
            if (two>=three){
                System.out.println("Наибольшее число " + two);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        }
        else {
            if (one > three){
                System.out.println("Наибольшее число " + one);
            } else if (three>one){
                System.out.println("Наибольшее число " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}