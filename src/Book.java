public class Book {
    private String title;
    private String author;
    private int availability;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = 2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "\"" + title +  "\" " + author;
    }
}
