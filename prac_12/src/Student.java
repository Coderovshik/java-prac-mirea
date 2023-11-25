public class Student implements Comparable<Student> {
    private int IDNumber;
    private int GPA;

    Student(int IDNumber, int GPA) {
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int iDNumber) {
        IDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int gPA) {
        GPA = gPA;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return this.IDNumber - anotherStudent.getIDNumber();
    }

    @Override
    public String toString() {
        return "Student@IDNumber:" + this.IDNumber + "&GPA:" + this.GPA;
    }
}
