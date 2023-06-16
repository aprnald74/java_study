package Varivale4.java.aprnald;

public class Score {

    void score(int score) {

        if (score > 89) {
            System.out.println("수");
        } else if (score > 79) {
            System.out.println("우");
        } else if (score > 69) {
            System.out.println("미");
        } else if (score > 59) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }

    }
    public static void main(String[] args) {
        Score score = new Score();
        score.score(6);
    }
}
