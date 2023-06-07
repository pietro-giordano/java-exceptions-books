package org.lessons.java.library;

public class Book {
    private String name;
    private int numberPage;
    private String author;
    private String editor;

    public Book(String name, int numberPage, String author, String editor) {
        this.name = name;
        this.numberPage = numberPage;
        this.author = author;
        this.editor = editor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberPage=" + numberPage +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
