package ex5;

public class AppBoatStation {
    public static void main(String[] args) {

        QuadrupleBoat q1 = new QuadrupleBoat();
        q1.getInfo();

        Payment p1 = new Payment();
        p1.setTypePayment("cash");
        Payment p2 = new Payment();
        p2.setTypePayment("card");

    }
}

interface Boat {
    int q = 0;
    String boatMode = "";

    default void getInfo() {
        System.out.println("Базовая модель лодки 1 местная");

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

}