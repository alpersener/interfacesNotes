package OOP.interfaces.extendDemo2;

public interface A {
    default void fun(){
        System.out.println("Ben A'dayım");

    }

    //Static methodların body'leri olmak zorundadır.
    static void greeting() {
        System.out.println("ben a interface'i içindeki statik methodum");

    }

}
