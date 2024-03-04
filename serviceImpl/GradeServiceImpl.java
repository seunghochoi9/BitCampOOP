package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}
    public static GradeService getInstance(){
        return instance;
    }
    @Override
    public int getTotalScore(Subject total) {
        int sum = total.getKorean() + total.getEnglish() + total.getMath();
        return sum;
    }

    @Override
    public double findAverage(int total) {
        double result =  Math.round(total / (double) 3 * 100) / 100.0;
        return result;
    }
}
