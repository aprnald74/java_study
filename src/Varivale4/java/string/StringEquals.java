package Varivale4.java.string;

public class StringEquals {
    void study() {
        String name = "John";
        String name1 = "John";
        String name2 = "peter";
        String name3 = new String("John");
        String name4 = new String("John");

        showEqualent(name, name1);
        showEqualent(name, name2);
        showEqualent(name, name3);
        showEqualent(name3, name4);
    }

    void showEqualent(String str1, String str2) {
        //boolean result = (str1 == str2);
        boolean result = str1.equals(str2);
        System.out.printf("%s == %s : %b \n", str1, str2, result);
    }



    public static void main(String[] args) {
        StringEquals stringEquals = new StringEquals();
        stringEquals.study();
    }

}
