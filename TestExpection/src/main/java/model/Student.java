package model;

import customexceptions.ScoreBelowZeroAndAbodeFiveException;
import customexceptions.StudentHasNoSubjectsException;
import enums.Subject;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;
    private List<SubjectScore> subjectScoreList;

    public Student(int id, String name, String surname, List<SubjectScore> subjectScoreList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.subjectScoreList = subjectScoreList;
    }

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<SubjectScore> getSubjectScoreList() {
        return subjectScoreList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public double avScoreByAllSubject() throws StudentHasNoSubjectsException, ScoreBelowZeroAndAbodeFiveException {
        if (subjectScoreList == null) {
            throw new StudentHasNoSubjectsException("No subjects");
        }
        double result = 0;
        for (SubjectScore subjectScores : subjectScoreList) {
            int score = subjectScores.getScore();
            result += score;
        }
        return result / subjectScoreList.size();

    }
    public int avScoreBySubject(Subject subject) throws StudentHasNoSubjectsException, ScoreBelowZeroAndAbodeFiveException{
        if (subjectScoreList == null) {
            throw new StudentHasNoSubjectsException("No subjects");
        }
        for (SubjectScore subjectScores : subjectScoreList) {
            if(subjectScores.getName() == subject) {
                return subjectScores.getScore();
            }
        }
        return 0;
    }



}






















