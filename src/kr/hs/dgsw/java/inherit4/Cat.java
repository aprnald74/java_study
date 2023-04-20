package kr.hs.dgsw.java.inherit4;

public class Cat extends Mammal{


    public void cry() {
        System.out.println("미야웅");
    }
    public static void main(String[] args) {
        Mammal mammal1 = new Whale();
        Mammal mammal2 = new Cat();

        mammal1.move();
        mammal2.move();

        Cat cat1 = (Cat)mammal1;
        Cat cat2 = (Cat)mammal2;
    }
}
