package ex5;

import java.text.Format;

public class AppBoatStation {
    public static void main(String[] args) {

        SingleBoat s1 =new SingleBoat(1, "blue");
        s1.getInfo();
        s1.getParameters();

        QuadrupleBoat q1 = new QuadrupleBoat();
        q1.getInfo();

        Payment p1 = new Payment();
        p1.setTypePayment("cash");
        Payment p2 = new Payment();
        p2.setTypePayment("card");

        Repair r1 = new Repair();
        r1.getDayRepair(1,3);

        Repair r2 = new Repair();
        r2.getDayRepair(2,4);

    }
}

interface Boat {
    int q = 0;
    String boatMode = "";

    default void getInfo() {
        System.out.println("Базовая модель лодки 1 местная");

    }
}
class SingleBoat implements Boat {
    public int price;
    public String color;

    public SingleBoat(int price, String color) {
        this.price = price;
        this.color = color;
    }
    public void setPrice(int p1){
        price = p1;
    }
    public int getPrice(){
        return price;
    }
    public String getParameters(){
        return String.format("price: %d color: %s", price, color);
    }


    public SingleBoat() {

    }
}

class DoubleBoat implements Boat {
    public int price;
    public String color;

    public DoubleBoat(int price, String color) {
        super();
        this.price = price;
        this.color = color;
    }
}

class QuadrupleBoat implements Boat {
    @Override
    public void getInfo() {
        System.out.println("У нас появилась 4-х местная лодка");
    }
}

class CashDesk {
    int money;
    int numB;
    Time t;

    public CashDesk(int money, int numB) {
        this.money = money;
        this.numB = numB;
    }


    public void getPay(int numB, Time t) {
        t = new Time();
        System.out.println("Лодка номер " + numB + "оплачена на количество часов " + t.payTime(money));

    }
}

class Time {
    int hour;
    int s = 100;

    public int payTime(int money) {
        hour = money / s;
        return hour;
    }
}

class Payment {
    String type;

    void setTypePayment(String type){
        this.type = type;
    }
}
class Client{
    int age;
    String gender;

    public Client(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
}
class Repair{
    int numB;
    int day;

    public Repair() {
        this.numB = numB;
        this.day = day;
    }

    public int getDayRepair(int numB, int day){
        System.out.println("Лодка номер "+numB+" будет ремонтироваться "+day+" дней");
        return day;
    }
}