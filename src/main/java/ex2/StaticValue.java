package ex2;

public class StaticValue {

    static Integer value;

    void setValue(Integer value){
        StaticValue.value = value;

    }
    void foo(){
        System.out.println("value foo ="+value);
    }
    public static void main(String[] args) {
        StaticValue s1 = new StaticValue();
        StaticValue s2 = new StaticValue();

        s1.setValue(111);
        s1.foo();
        s2.foo();

    }
}
