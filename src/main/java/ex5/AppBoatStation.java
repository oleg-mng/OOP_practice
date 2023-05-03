package ex5;

public class AppBoatStation {
    public static void main(String[] args) {

        QuadrupleBoat q1 = new QuadrupleBoat();
        q1.getInfo();

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
    public void getPay(int numB, int hour) {
        System.out.println("Лодка номер " + numB + "оплачена на количество часов " + hour);

    }
}

class Payment {

}