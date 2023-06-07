package org.lessons.java.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookCreateException, IOException {
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
                    flag = true;
                } catch (BookCreateException e) {
                    System.out.println("Hai inserito qualche valore in fase di creazione errato, riprova.");
                } catch (NumberFormatException e) {
                    System.out.println("Numero pagine non corretto, riprova.");
                }

            } while (!flag);

            library[i] = newBook;
        }

        for (Book book : library) {
            System.out.println(book.toString());
        }

        scanner.close();

        // BONUS
        // creazione
        try {
            File newFile = new File("./file.txt");
            if (newFile.createNewFile()) {
                System.out.println("File creato");
            } else {
                System.out.println("File non creato");
            }
        } catch (IOException e) {
            System.out.println("Errore in fase di creazione");
        }

        // scrittura
        try {
            FileWriter writer = new FileWriter("file.txt");
            for (Book book : library) {
                writer.write(book.toString());
            }
            writer.close();
            System.out.println("Scrittura su file avvenuta correttamente");
        } catch (Exception e) {
            System.out.println("Errore scrittura su file");
        }

        // lettura su schermo
        try {
            File newFile = new File("./file.txt");
            Scanner reader = new Scanner(newFile);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
            System.out.println("Lettura avvenuta correttamente");
        } catch (Exception e) {
            System.out.println("Errore lettura su file");
        }
    }
}
