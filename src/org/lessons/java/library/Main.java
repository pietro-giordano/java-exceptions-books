package org.lessons.java.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salve. Quanti libri vuoi inserire in libreria?");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Book[] library = new Book[n];

        for (int i = 0; i < library.length; i++) {
            System.out.println("Inserisci titolo:");
            String title = scanner.nextLine();
            System.out.println("Inserisci numero pagine:");
            int nPage = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci autore:");
            String author = scanner.nextLine();
            System.out.println("Inserisci editore:");
            String editor = scanner.nextLine();
            Book newBook = new Book(title, nPage, author, editor);
            library[i] = newBook;
        }


        scanner.close();
    }
}
