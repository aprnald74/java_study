package Varivale4.inter4;

public class Dog implements Soundable {

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();

        Dog doge = new Dog();
        doge.makeSound();

        Soundable pet = new Dog();
        pet.makeSound();
    }
}
