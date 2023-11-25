package exercise3;

public class Book {
    private String author;
    private String title;
    private int wasWritten;
    private int wasPublished;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getWasWritten() {
        return wasWritten;
    }

    public int getWasPublished() {
        return wasPublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWasPublished(int wasPublished) {
        this.wasPublished = wasPublished;
    }

    public void setWasWritten(int wasWritten) {
        this.wasWritten = wasWritten;
    }
}
