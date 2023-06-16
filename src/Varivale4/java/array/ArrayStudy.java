package Varivale4.java.array;

public class ArrayStudy {

    void study() {
        // 배열의 선언
        int[] intArray = new int[5];
        int intArray2[] = new int[5];

        double[] doubleArray = new double[20];

        boolean[] boolArray = new boolean[5];

        String[] strArray = new String[12];

        // 읽고 쓰기
        intArray[2] = 7;
        strArray[4] = "Korea";

        System.out.println(boolArray[0]);
        System.out.println(intArray[2]);
        System.out.println(strArray[4]);
    }

    void studyInit() {
        int[] intArray = new int[] {5, 4, 8, 3, 1, 4};

        System.out.println(intArray[3] + intArray[2]);

        String[] colors = new String[] {
                "발강", "노랑", "초록", "파랑", "보라"
        };

        int lengthOfColors = colors.length;

        for (int i = 0; i < lengthOfColors; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }
        intArray[6] = 12;
        intArray[-1] = 3;
    }
    public static void main(String[] args) {
        ArrayStudy arrayStudy = new ArrayStudy();
        //arrayStudy.study();
        arrayStudy.studyInit();
    }
}
