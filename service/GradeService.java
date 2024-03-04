package service;

import model.Subject;

public interface GradeService {
    int getTotalScore(Subject total);
    double findAverage(int total);
}
