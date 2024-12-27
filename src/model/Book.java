package model;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book =(Book)obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return "\n Book : " +
                "\n Titre : " +title +
                "\n Auteur :  " +author;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}
