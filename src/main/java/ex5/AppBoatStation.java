package ex5;

public class AppBoatStation {
    public static void main(String[] args) {

    }
}
interface Boat{
    int q = 0;

}
class DoubleBoat implements Boat{

}
class QuadrupleBoat implements Boat{

}
class CashDesk{
    public void getPay(int numB, int hour){
        System.out.println("Лодка номер "+ numB +" количество часов" + hour);
    }

}
class Payment{

}