package sumdu.edu.ua.mainbookshop1;

public class Book {
 private int id;
    private String author;
    private String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public String toSting(){
        return this.id+" "+this.author+" "+this.title;
    }
    
    public int getId() {
        return id;
    }

    public Book() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
 
}
