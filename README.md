# interfacesNotes

- Java multiple inheritance desteklemez(Diamond Problem),Interface aracılığıyla yapılabilir
- Interface variables default olarak public,static ve final'dir ve tanımlanırken initialize edilmesi gerekir.
- Interface->Interface "extends"
- Class->Interface "implements"
- Static method'lar tanımlanabilir ve body'leri olması zorundadır,ek olarak static method'lar override edilemez.Abstract methodların body'si bulunmazken default keyword'ü ile body tanımlanabilir.
```
public interface A {
    default void fun(){
        System.out.println("Ben A'dayım");

    }

    static void greeting() {
        System.out.println("ben a interface'i içindeki statik methodum");

    }

}

public interface B extends A{
    void greet();
}

public class Main implements B{
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }
}

```
- Bir class birden fazla interface'i implemente ediyorsa ve 2 interface'de de aynı method bulunuyorsa class içerisinde o method 1 kez yazılacaktır(önemli olan override edilmesi)


- Upcasting işlemi uygulanabilir
```
Engine car=new Car();
car.start();
car.acc();
car.brake() --> Error engine interface'inin içerisinde brake methodu tanımlı değil,Engine referansı ile erişilemez
car.stop();

```
  


