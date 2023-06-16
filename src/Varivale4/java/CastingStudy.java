package Varivale4.java;

public class CastingStudy {

    void studySome() {
        int intValue = 3;
        double doubleValue =3;

        intValue = (int)-3.64;

        System.out.println(intValue);

        long longValue = intValue;
        intValue = (int)longValue;

        //boolean bool = (booleen)0;

        char ch = 'A';
        intValue = (int)ch;

        String str = "123";
        //intValue = (int)str;

    }

    public static void main(String[] args) {
        CastingStudy object = new CastingStudy();
        object.studySome();
    }

}
