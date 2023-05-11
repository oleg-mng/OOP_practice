package ex5;

class QuadrupleBoat extends Boat {
    public int price;
    public String color;

    int q = 4;

    public QuadrupleBoat(int numB, String size, int price, String color) {
        super(numB, size);
        this.price = price;
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("для вас доступна 4-х местная лодка с количеством мест = " + q);
    }
}