package ex2;

public class BankApp {
    static Integer value;

    public void setDeposit(Integer value) {
        BankApp.value = value;
    }

    void foo() {
        System.out.println("void foo: " + value.toString());
    }

    public static void main(String[] args) {
        BankApp account1 = new BankApp();
        BankApp account2 = new BankApp();

        account1.setDeposit(567);
        account1.foo();
        account2.foo();

        account2.setDeposit(234);
        account1.foo();
        account2.foo();

    }
}

