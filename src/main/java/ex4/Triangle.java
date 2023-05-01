package ex4;

public class Triangle implements Polygon {
    private int x, y, q;
    private double s, p;

    public Triangle(int x, int y, int q) {
        this.x = x;
        this.y = y;
        this.q = q;
    }

    @Override
    public void getArea() {
        s = (double) (x + y + q)/2;
        p = Math.sqrt(s*(s-x)*(s-y)*(s-q));
        System.out.println("Area: " + p);

    }


}
