package ex4;

public interface Polygon extends Line {
    void getArea();
    public default void getPerimeter(int... size){
        int perimeter = 0;
        for (int i : size) {
            perimeter += i;

        }
        System.out.println("Perimeter: " + perimeter);

    }
}
