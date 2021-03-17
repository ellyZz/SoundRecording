package model;

import customexceptions.NoGroupsAtFacultyException;
import customexceptions.NoStudentsInGroupException;
import customexceptions.ScoreBelowZeroAndAbodeFiveException;
import customexceptions.StudentHasNoSubjectsException;
import enums.Subject;

import java.util.List;

public class Faculty {
    private String name;
    private List<Group> groups;

    public Faculty(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public int getAvScoreByGroupAndSubject(Group group, Subject subject) throws NoGroupsAtFacultyException, NoStudentsInGroupException, ScoreBelowZeroAndAbodeFiveException, StudentHasNoSubjectsException {
        if (this.groups == null) {
            throw new NoGroupsAtFacultyException("No groups at faculty");
        }
        return group.getAvScoreBySubject(subject);
    }

    public int getAverageScoreBySubject(Subject subject) throws ScoreBelowZeroAndAbodeFiveException, StudentHasNoSubjectsException, NoStudentsInGroupException {
        int result = 0;
        for (Group group : groups) {
            result += group.getAvScoreBySubject(subject);
        }
        return result / groups.size();
    }
}
