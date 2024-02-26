package service;

import model.SubjectDto;

public interface GradeService {
    int getTotalScore(SubjectDto total);
    double findAverage(int total);
}
