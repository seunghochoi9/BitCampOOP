package service;

import model.Subject;

public interface GradeService {
    String getTotalScore(Subject total);
    String findAverage(String total);
}
