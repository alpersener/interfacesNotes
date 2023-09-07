package OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();

        System.out.println("-----------");

        NiceCar car2=new NiceCar();
        car2.start();
        car2.startMusic();
        car2.upgradeEngine();
        car2.start();

 /*
 burada kimi referans verirsek onun erişebileceğini öğrenebiliriz burada engine interface'inde brake yok ya da Media
 interface'inde acc ve brake yok ondan dolayı erişemezler temel mantık budur.
      Engine car=new Car();
        car.start();
        car.acc();
        car.brake();  --->Error çünkü engine interface'inin içerisinde brake metodu yok
        car.stop();*/
    }
}
