package org.lessons.java.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookCreateException {
        System.out.println("Salve. Quanti libri vuoi inserire in libreria?");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Book[] library = new Book[n];

        for (int i = 0; i < library.length; i++) {
            Book newBook = null;
            boolean flag = false;
            do {
                try {
                    System.out.println("Inserisci titolo:");
                    String title = scanner.nextLine();
                    System.out.println("Inserisci numero pagine:");
                    int nPage = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci autore:");
                    String author = scanner.nextLine();
                    System.out.println("Inserisci editore:");
                    String editor = scanner.nextLine();
                    newBook = new Book(title, nPage, author, editor);
                } catch (BookCreateException e) {
                    System.out.println("Hai inserito qualche valore in fase di creazione errato. Riprova.");
                }
            } while (!flag);

            library[i] = newBook;
        }

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].toString());
        }

        scanner.close();
    }
}
