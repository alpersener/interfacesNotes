package OOP.interfaces.extendDemo2;

public class Main implements A,B {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.fun();
        A.greeting();
    }



}
