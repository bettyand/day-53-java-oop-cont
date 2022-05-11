public class Book {
    private String title;
    private int numPages;
    private int pubYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numPages = numberOfPages;
        this.pubYear = publicationYear;
    }

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title + ", " + numPages + " pages, " + pubYear;
    }
}
