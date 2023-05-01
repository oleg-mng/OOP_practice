package ex1;

class ap{
    void foo(){
        System.out.println("not static foo() work with class instance a1");

    }
}

public class NotStatic {
    public static void main(String[] args) {
        ap a1 = new ap();
        a1.foo();

        ap a2 = new ap();

    }
}
