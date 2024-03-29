package view;

import model.Subject;
import model.User;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("이름, 국어/영어/수학 점수?");
        UtilService util = UtilServiceImpl.getInstance();
        User student = User.builder().name(sc.next()).build();
        GradeService grade = GradeServiceImpl.getInstance();
        Subject subjects = Subject.builder()
                .korean(util.createRandomInteger(0, 100))
                .english(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build();
        String totalScore = grade.getTotalScore(subjects);
        String average = grade.findAverage(totalScore);
        System.out.println(totalScore);
        System.out.println(average);
//        System.out.printf("===============성적표============\n" +
//                        "Korean : %s\n" +
//                        "English : %s\n" +
//                        "Math: %s\n" +
//                        "Total: %s\n" +
//                        "Average: %s\n",
//                String.valueOf(subjects.getKorean()),
//                String.valueOf(subjects.getEnglish()),
//                String.valueOf(totalScore),
//                String.valueOf(average));
    }
}
