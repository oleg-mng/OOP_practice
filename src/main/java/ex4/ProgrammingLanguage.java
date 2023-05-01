package ex4;

public class ProgrammingLanguage implements Language{
    @Override
    public void getType() {

    }

    @Override
    public void getVersion() {

    }

    @Override
    public void getName(String n) {
        System.out.println("Programming Language: " + n);
    }
}
