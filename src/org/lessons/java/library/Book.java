package org.lessons.java.library;

public class Book {
    private String name;
    private int nPage;
    private String author;
    private String editor;

    public Book(String name, int nPage, String author, String editor) throws BookCreateException {
        if (!name.isEmpty() && nPage > 0 && !author.isEmpty() && !editor.isEmpty()) {
            this.name = name;
            this.nPage = nPage;
            this.author = author;
            this.editor = editor;
        } else {
            throw new BookCreateException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws BookCreateException {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new BookCreateException();
        }
    }

    public int getNPage() {
        return nPage;
    }

    public void setNPage(int numberPage) throws BookCreateException {
        if (nPage > 0) {
            this.nPage = numberPage;
        } else {
            throw new BookCreateException();
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws BookCreateException {
        if (!author.isEmpty()) {
            this.author = author;
        } else {
            throw new BookCreateException();
        }
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws BookCreateException {
        if (editor.isEmpty()) {
            this.editor = editor;
        } else {
            throw new BookCreateException();
        }
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
