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
    public String getTotalScore(Subject total) {
        int sum = total.getKorean() + total.getEnglish() + total.getMath();
        return sum+"";
    }

    @Override
    public String findAverage(String total) {
        double result =  Math.round(Integer.getInteger(total) / (double) 3 * 100) / 100.0;
        return result+"";
    }
}
