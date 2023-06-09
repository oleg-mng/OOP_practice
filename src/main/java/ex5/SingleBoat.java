package ex5;

class SingleBoat extends Boat {
    public int price;
    public String color;

    int q = 1;

    public SingleBoat(int numB, String size, int price, String color) {
        super(numB, size);
        this.price = price;
        this.color = color;
    }

    public void setPrice(int p1) {
        price = p1;
    }

    public int getPrice() {
        return price;
    }

    public String getParameters() {
        return String.format("price: %d color: %s", price, color);
    }

    @Override
    public void getInfo() {
        System.out.println("Данная модель лодки - базовая, количество мест = " + q);
    }
}