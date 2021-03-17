package model;

import customexceptions.NoStudentsInGroupException;
import customexceptions.ScoreBelowZeroAndAbodeFiveException;
import customexceptions.StudentHasNoSubjectsException;
import enums.Subject;


import java.util.List;

public class Group {
    private String name;
    private List<Student> studentList;

    public Group(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() throws NoStudentsInGroupException {
        if(!studentList.isEmpty()){
            return studentList;
        }
        else throw new NoStudentsInGroupException();

    }
    public int getAvScoreBySubject(Subject subject) throws NoStudentsInGroupException, StudentHasNoSubjectsException, ScoreBelowZeroAndAbodeFiveException {
        if (studentList == null) {
            throw new NoStudentsInGroupException("No students at group");
        }
        int result = 0;
        for (Student student : studentList) {
            result += student.avScoreBySubject(subject);
        }
        return result / studentList.size();
    }
}
