package ex5;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AppBoatStation {
    public static void main(String[] args) {

        Client client1 = new Client(1, 8, "female");
        Client client2 = new Client(2, 15, "male");

        SingleBoat s1 = new SingleBoat(1, "Single", 100, "blue");
        s1.getInfo();
        s1.getParameters();

        QuadrupleBoat q1 = new QuadrupleBoat(2, "Quadro", 150, "green");
        q1.getInfo();

        Payment p1 = new Payment();
        p1.setTypePayment("cash");
        Payment p2 = new Payment();
        p2.setTypePayment("card");

        Repair r1 = new Repair();
        r1.getDayRepair(1, 3);

        Repair r2 = new Repair();
        r2.getDayRepair(2, 4);

        CashDesk c1 = new CashDesk(300, 1);
        c1.getPay();
        c1.getStatus();

        CashDesk c2 = new CashDesk(100, 2);
        c2.getPay();
        c2.getStatus();

        Boat b1 = new Boat(1, "Single");

        Serviceability sb1 = new Serviceability(b1, 0.7);
        sb1.hashMapAdd();
    }
}

interface ParameterBoats {

    default void getInfo() {
        System.out.println("Данная модель лодки - базовая, количество мест = ");

    }
}
class Boat implements ParameterBoats {
    int numB;
    String size;

    public Boat(int numB, String size) {
        this.numB = numB;
        this.size = size;
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

    public void getStatus() {
        System.out.println("Лодка: " + numB + " оплачено: " + money);
    }

    public void getPay() {
        t = new Time();
        System.out.println("Лодка номер " + numB + " оплачена на количество часов " + t.payTime(money));

    }
}

class Payment {
    String type;

    void setTypePayment(String type) {
        this.type = type;
    }
}

class db extends Client {
    int id;
    Date dateBorn;
    int numberVisits;

    public db(int id, int age, String gender, Date dateBorn, int numberVisits) {
        super(id, age, gender);
        this.dateBorn = dateBorn;
        this.numberVisits = numberVisits;
    }
}


class Repair {
    int numB;
    int day;

    public Repair(int numB, int day) {
        this.numB = numB;
        this.day = day;
    }

    public Repair() {

    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDayRepair(int numB, int day) {
        System.out.println("Лодка номер " + numB + " будет ремонтироваться " + day + " дней");
        return day;
    }
}

class Serviceability {
    Boat boat;
    double servAbility;
    HashMap<Boat, Double> hashMapBoat;

    public Serviceability(Boat boat, double servAbility) {
        this.boat = boat;
        this.servAbility = servAbility;
    }

    public HashMap<Boat, Double> hashMapAdd(){
        hashMapBoat = new HashMap<>();
        hashMapBoat.put(boat, servAbility);
        for (Map.Entry<Boat, Double> boatDoubleEntry : hashMapBoat.entrySet()) {
//            System.out.println(boatDoubleEntry);
            System.out.println(String.format("number: %d, color: %s, servAbility: %f", boat.numB, boat.size, servAbility));

        }
        return hashMapBoat;
    }

}
class busyOfBoat{

}