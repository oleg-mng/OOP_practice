package ex5;

public class DoubleBoat extends Boat {
    public int price;
    public String color;

    int q = 2;

    public DoubleBoat(int numB, String size, int price, String color) {
        super(numB, size);
        this.price = price;
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Доступна к использованию 2-х местная лодка, с количеством мест = " + q);
    }
}
