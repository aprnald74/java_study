package Varivale4.java.inherit4;

public class Child extends Parent{

    private int value4;
    public static void main(String[] args) {
        Child child = new Child();

        //child.value1 = 2;
        child.value2 = 5;
        child.value3 = 7;
        child.value4 = 9;

        System.out.println(child.value3);
        System.out.println(child.value2);
        System.out.println();
        //System.out.println(child.value1);
        System.out.println(child.value4);

        child.setValue1(4);
        child.setValue2(15);

        System.out.println("합 : " + child.add());

    }

}
