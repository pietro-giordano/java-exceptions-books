package org.lessons.java.library;

public class Book {
    private String name;
    private int nPage;
    private String author;
    private String editor;

    public Book(String name, int nPage, String author, String editor) {
        this.name = name;
        this.nPage = nPage;
        this.author = author;
        this.editor = editor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNPage() {
        return nPage;
    }

    public void setNPage(int numberPage) {
        this.nPage = numberPage;
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
                ", numberPage=" + nPage +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
