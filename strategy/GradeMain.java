package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

enum Grade{

    A(9, (i)-> i==9 || i==10),
    B(8,  (i)-> i==8),
    C(7,  (i)-> i==7),
    D(6,  (i)-> i==6),
    E(5,  (i)-> i==5),
    F(4,  (i)-> i==4)
    ;
    private final int score;
    private final Predicate<Integer> predicate;

    Grade(int score, Predicate<Integer> predicate) {
        this.score = score;
        this.predicate = predicate;
    }

    public static Grade grade(int score) {
        return Arrays.stream(values())
                .filter(o -> o.predicate.test(score/10))
                .findAny().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));

    }

}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        System.out.println(Grade.grade(80));
    }
}
