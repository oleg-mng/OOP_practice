package ex5;

public class DoubleBoat extends Boat {
    public int price;
    public String color;

    public DoubleBoat(int numB, String size, int price, String color) {
        super(numB, size);
        this.price = price;
        this.color = color;
    }

}
