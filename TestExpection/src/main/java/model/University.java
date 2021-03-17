package model;

import customexceptions.NoFacultiesAtUniversityException;
import customexceptions.NoStudentsInGroupException;
import customexceptions.ScoreBelowZeroAndAbodeFiveException;
import customexceptions.StudentHasNoSubjectsException;
import enums.Subject;

import java.util.List;

import static java.lang.System.out;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", faculties=" + faculties +
                '}';
    }

    public void checkFaculty() throws NoFacultiesAtUniversityException {
        if(this.faculties == null) {
            throw new NoFacultiesAtUniversityException("No faculty");
        }
        out.println("University have faculties");

    }
    public int getAverageScoreBySubject(Subject subject) throws ScoreBelowZeroAndAbodeFiveException, StudentHasNoSubjectsException, NoStudentsInGroupException {
        int result = 0;
        for (Faculty faculty : faculties) {
            result += faculty.getAverageScoreBySubject(subject);
        }
        return result / faculties.size();
    }

}
