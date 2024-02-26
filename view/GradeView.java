package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.SubjectDto;
import model.UserDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("이름, 국어/영어/수학 점수?");
        UtilService util = UtilServiceImpl.getInstance();
        UserDto student = new UserBuilder().name(sc.next()).build();
        GradeService grade = GradeServiceImpl.getInstance();
        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0, 100))
                .english(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build();
        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);
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
