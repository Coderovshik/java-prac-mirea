import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return b.getGPA() - a.getGPA();
    }
}
