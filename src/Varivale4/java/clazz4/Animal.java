package Varivale4.java.clazz4;

public class Animal {

    private String name;

    private String elephant;

    public Animal() {
        //this.name = "동물";
        this("동물");
        System.out.println("생성됨");
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("코끼리");
        System.out.println(elephant.name);

        Animal turtle = new Animal();
        System.out.println(turtle.name);
    }
}
