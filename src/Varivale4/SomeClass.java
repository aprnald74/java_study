package Varivale4;

import kr.hs.dgsw.java.string.StringEquals;

public class SomeClass {

    String name;

    int count;

    //전역 변수로 설정하면 초기값 설정해야됨 final은
    static final int value = 5;

    static final double PI = 3.1415926;

    void someMethod1() {
        int age = 18;
        name = "홍길동";

        if (true) {
            int value1 = 5;
            System.out.println(value1);
        }

        for (int i = 0; i < 10; i++) {
            int value1 = i + 2;
        }
    }

    void someMethod2(int value) {

        //int value;

        this.name = "abcd";

        String name = "이세돌";

        System.out.println(name);
        //System.out.println(age);
    }

    void doSomething(final int param) {
        final int value = 6;
        //value = 7;

        final int value1;
        value1 = 10;
        //value1 = 11;
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod1();
        someClass.someMethod2(5);
    }

}
