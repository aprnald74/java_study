package Varivale4;

public class MathScore extends Score {
    public MathScore(int point) {
        super(point);
    }

    @Override
    public String getGrade() {
        if(point >= 70) {
            return "수";
        } else if(point >= 60) {
            return "우";
        } else if(point >= 50) {
            return "미";
        } else if(point >= 40) {
            return "양";
        } else {
            return "가";
        }
    }
    public static void main(String[] args) {
        Score korean = new Score(82);
        Score math = new MathScore(65);

        boolean same = korean.equals(math);
        System.out.println(same);
    }

}
