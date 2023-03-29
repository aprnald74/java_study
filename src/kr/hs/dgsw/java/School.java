package kr.hs.dgsw.java;

import org.w3c.dom.ls.LSOutput;

public class School {

    String schoolName = "대구소프트웨어마이스터고등학교";

    int countOfStudent = 0;

    void teach() {
        System.out.println("학생들을 가르칩니다");
        System.out.printf("%d %f %s", 3, 3.14, "원주율");
    }

    void enroll() {
        countOfStudent++;
    }

    void graduate() {
        if (countOfStudent > 0) {
                countOfStudent--;
        }
    }

    void printInformation() {
        System.out.printf("%s 에는 %d명이 재학중입니다", schoolName, countOfStudent);
    }



}
