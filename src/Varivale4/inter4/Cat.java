package Varivale4.inter4;

public class Cat implements Soundable, Jump {

    @Override
    public void makeSound() {
        System.out.println("야아옹~");
    }

    @Override
    public void jump() {
        System.out.println("뛰용ㅇ");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();

        Soundable pet = new Cat();
        pet.makeSound();

        Jump cat = new Cat();
        cat.jump();
    }
}
