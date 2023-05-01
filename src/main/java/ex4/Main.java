package ex4;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
//        rec1.getArea(5,15);

        ProgrammingLanguage p1 = new ProgrammingLanguage();
        p1.getName("Java Programming");

        Triangle tr1 = new Triangle(2, 3, 4);
        tr1.getArea();
        tr1.getPerimeter(2,3,4);
    }
}
