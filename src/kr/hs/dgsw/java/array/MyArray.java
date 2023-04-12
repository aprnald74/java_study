package kr.hs.dgsw.java.array;

import java.util.Arrays;
import java.util.Random;

//bone 18
public class MyArray {

    int[] array = new int[10];

    void makeArray() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + ", ");
        }
        System.out.println();
    }

    int min() {

        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        return min;
        //System.out.println(Arrays.stream(array).min());
    }

    int sum() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double average() {
        return sum() / (double)array.length;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.makeArray();
        myArray.printArray();
        myArray.min();
    }

}
