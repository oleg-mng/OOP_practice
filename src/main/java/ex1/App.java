package ex1;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        ButtonAction foo = new ButtonAction();
        Btn button = new Btn(foo);

        View v1 = new View(button);
        v1.click();

        button.setAction(new NewAction());

    }
}

class ButtonAction {
    public void method() {
        System.out.println("ButtonAction.method");
    }

}

class NewAction extends ButtonAction {
    @Override
    public void method() {
        System.out.println("NewAction.method");
    }
}

class Hoo extends ButtonAction {
    @Override
    public void method() {
        System.out.println("Hoo.method");
    }
}

class View {
    private Btn btn;
    public void click(){
        btn.click();
    }

    public View(Btn current) {
        this.btn = current;
    }
}

class Btn {
    ButtonAction action;

    public Btn(ButtonAction action) {
        this.action = action;
    }
    public void setAction(ButtonAction action){
        this.action = action;
    }

    public void click() {
        action.method();
    }

}
