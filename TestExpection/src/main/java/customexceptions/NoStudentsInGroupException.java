package customexceptions;

public class NoStudentsInGroupException extends Exception {
    public NoStudentsInGroupException(String message) {
        super(message);
    }

    public NoStudentsInGroupException() {
    }

    ;
}