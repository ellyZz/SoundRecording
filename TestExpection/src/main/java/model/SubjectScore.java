package model;

import customexceptions.ScoreBelowZeroAndAbodeFiveException;
import enums.Subject;

public class SubjectScore {
    private Subject name;
    private int score;

    public SubjectScore(Subject name, int score) {
        this.name = name;
        this.score = score;
    }

    public Subject getName() {
        return name;
    }

    public int getScore() throws ScoreBelowZeroAndAbodeFiveException {
        if (score > 0 && score < 6) {
            return score;
        } else throw new ScoreBelowZeroAndAbodeFiveException(score + " not in range");

    }
}
