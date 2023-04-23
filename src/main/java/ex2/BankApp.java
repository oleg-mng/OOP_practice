package ex2;

public class BankApp {
    int res;

    public void setDeposit(int value) {
        new BankApp().res= value;
        this.res= value;
        System.out.println(res);

    }

    void foo() {
        System.out.println("void foo: " + res);
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

