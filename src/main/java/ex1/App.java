package ex1;

/**
 *
 */
public class App {
    public static void main(String[] args) {


    }

}

class Foo {
    public void method() {
        System.out.println("Foo.method");
    }

}

class Doo extends Foo {
    @Override
    public void method() {
        System.out.println("Doo.method");
    }
}

class Hoo extends Foo {
    @Override
    public void method() {
        System.out.println("Hoo.method");
    }
}

class View {
    Btn btn = new Btn();
}

class Btn {
    Foo f;

    public Btn() {
        f = new Foo();
    }

    public void click() {
        f.method();
    }

}
