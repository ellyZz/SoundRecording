package model;

import customexceptions.*;
import enums.Subject;

import java.util.List;

public class App {
    public static void main(String[] args) {
        SubjectScore math2 = new SubjectScore(Subject.MATH, 2);
        SubjectScore math3 = new SubjectScore(Subject.MATH, 3);
        SubjectScore math4 = new SubjectScore(Subject.MATH, 4);
        SubjectScore math5 = new SubjectScore(Subject.MATH, 5);
        SubjectScore math6 = new SubjectScore(Subject.MATH, 55);
        SubjectScore english3 = new SubjectScore(Subject.ENGLISH, 3);
        SubjectScore phisics4 = new SubjectScore(Subject.PHISICS, 4);

        Student student1 = new Student(1, "Habib", "Nurmagomedov", List.of(math2, phisics4));
        Student student2 = new Student(2, "Conor", "Macgregor", List.of(math3, english3));
        Student student3 = new Student(3, "Vanya", "Ivanov", List.of(math4, english3));
        Student student4 = new Student(4, "Vladimir", "Pupkin", List.of(math5, english3));
        Student student5 = new Student(5, "igor", "Nikolaev", List.of(math2, english3));

        Student student6 = new Student(6, "Vitalya", "Andreev", List.of(math6, english3));
        Student student7 = new Student(6, "Fake", "Fake");

        Group is2020 = new Group("is2020", List.of(student2));
        Group is2021 = new Group("is2021", List.of(student3, student4));
        Group in2020 = new Group("in2020", List.of(student1, student5));
        Group fakeGroup = new Group("fake");

        Faculty fit = new Faculty("FIT", List.of(is2020, is2021, in2020));
        Faculty fakeFaculty = new Faculty("fakeFaculty");

        University nkzu = new University("NKZU", List.of(fit));
        University fakeUniversity = new University("fakeUniversity");

        try {
            nkzu.checkFaculty();
            System.out.println("Average score of student 1 by all subjects =" + student1.avScoreByAllSubject());
            System.out.println("Average score of group is2020 in english =" + fit.getAvScoreByGroupAndSubject(is2020, Subject.ENGLISH));
            System.out.println("Average score of university by subject =" + nkzu.getAverageScoreBySubject(Subject.MATH));
        } catch (NoFacultiesAtUniversityException | NoGroupsAtFacultyException | NoStudentsInGroupException | ScoreBelowZeroAndAbodeFiveException | StudentHasNoSubjectsException e) {
            e.printStackTrace();
        }


        try {
            student6.avScoreByAllSubject();
        } catch (StudentHasNoSubjectsException | ScoreBelowZeroAndAbodeFiveException e) {
            e.printStackTrace();
        }

        try {
            student7.avScoreByAllSubject();
        } catch (StudentHasNoSubjectsException | ScoreBelowZeroAndAbodeFiveException e) {
            e.printStackTrace();
        }

        try {
            fakeGroup.getAvScoreBySubject(Subject.MATH);
        } catch (NoStudentsInGroupException | StudentHasNoSubjectsException | ScoreBelowZeroAndAbodeFiveException e) {
            e.printStackTrace();
        }

        try {
            fakeFaculty.getAvScoreByGroupAndSubject(is2020, Subject.MATH);
        } catch (NoGroupsAtFacultyException | NoStudentsInGroupException | ScoreBelowZeroAndAbodeFiveException | StudentHasNoSubjectsException e) {
            e.printStackTrace();
        }

        try {
            fakeUniversity.checkFaculty();
        } catch (NoFacultiesAtUniversityException e) {
            e.printStackTrace();
        }


    }
}
