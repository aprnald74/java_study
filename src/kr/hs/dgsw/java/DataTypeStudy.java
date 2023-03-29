package kr.hs.dgsw.java;

public class DataTypeStudy {

    void studyInteger() {
        byte byteValue = 1; //127
        short shorValue = 3; //32767
        int intValue = 1; //2147483647
        long longValue = 1L; //2147483647

        System.out.printf("int %d ~ %d \n", Byte.MAX_VALUE, Byte.MIN_VALUE);

        System.out.printf("int %d ~ %d \n", Short.MAX_VALUE, Short.MIN_VALUE);

        System.out.printf("int %d ~ %d \n", Integer.MAX_VALUE, Integer.MIN_VALUE);

        System.out.printf("int %d ~ %d \n", Long.MAX_VALUE, Long.MIN_VALUE);

        byte max = 127;
        max += 1;
        System.out.printf("127 + 1 = %d\n", max);

        int value1 = 1200000000;
        int value2 = 1300000000;
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);

        //byteValue = shorValue;
        shorValue = 128;
        byteValue = (byte)shorValue;
        //shorValue = byteValue;

        System.out.printf("%d -> %d\n", shorValue, byteValue);
    }

    void studyFloat() {

        float floatValue = 3.14f;
        double doubleVlue = 3.14;

        System.out.println(floatValue);
        System.out.println(doubleVlue);

        float value1 = 0.0f;
        for (int i = 0; i < 1000; i++) {
            value1 += 0.001f;
        }

        System.out.println(value1);


    }

    void studyBoolean() {
        boolean booleanValue = true;
        booleanValue = false;

        boolean value1 = (3==2);
    }

    void studyChar() {
        char charValue = 'A';
        //charValue = 65;
        charValue = '가';

       // System.out.printf("%c : %d\n", charValue, (int)charValue);
        for(char i = '가'; i < '나'; i++) {
            System.out.printf("%c : %d\n", i, (int) i);
        }
    }

    void study() {
        char first = '가';
        char last = '힣';
        int cnt = last - first + 1;
        System.out.printf("한글에 부여된 코드의 개수는 %d개입니다.\n", cnt);

        char hanja = '火';
        System.out.printf("%c : %d\n", hanja, (int)hanja);
    }

    void studyWrapper() {
        int value = 0;
        Integer value1 = 3;
        value = value1;

        System.out.println(value);
    }

    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();
        //dataTypeStudy.studyInteger();
        //dataTypeStudy.studyFloat();
        //dataTypeStudy.studyChar();
        //dataTypeStudy.study();
        dataTypeStudy.studyWrapper();


        System.out.printf("내 하드웨어가 꺼진다ㅏㅏㅏㅏㅏㅏ");
    }
}
