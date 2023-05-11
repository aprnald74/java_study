package Varivale4;

import java.util.Date;

public class Score {

    protected final int point;

    public Score(int point) {
        this.point = point;
    }

    public String getGrade() {

        if(point >= 90) {
            return "수";
        } else if(point >= 80) {
            return "우";
        } else if(point >= 70) {
            return "미";
        } else if(point >= 60) {
            return "양";
        } else {
            return "가";
        }
    }



    @Override
    public String toString() {

        return String.format("점수는 %d점이고, 등급은 '%s'입니다.", point, getGrade());

        //return "점수는 " + point + "점이고, 등급은" + getGrade() + "입니다.";
    }


    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Score) {
            return false;
        }

        return getGrade() == ((Score)o).getGrade();

        /*
        try {
            Score score = (Score)o;
            return getGrade() == ((Score)o).getGrade();
        } catch (ClassCastException e) {
            return false;
        }
         */
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Object object = new Object();
        Score score = new Score(82);
        Date date = new Date();


        System.out.println(object.toString());
        System.out.println(score.toString());
        System.out.println(date.toString());

        String str1 = new String("대한민국");
        String str2 = new String("Republic Of Korea");
        boolean same = str1.equals(str2);

        Score score1 = new Score(60);
        Score score2 = new Score(93);
        //System.out.println(score1.getGrade().equals(score2.getGrade()));
        System.out.println(score1.equals(score2));
    }
}