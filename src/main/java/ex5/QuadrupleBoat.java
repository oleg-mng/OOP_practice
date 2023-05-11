package ex5;

class QuadrupleBoat extends Boat {
    public int price;
    public String color;

    public QuadrupleBoat(int numB, String size, int price, String color) {
        super(numB, size);
        this.price = price;
        this.color = color;
    }


    @Override
    public void getInfo() {
        System.out.println("У нас появилась 4-х местная лодка");
    }
}