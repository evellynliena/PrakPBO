package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book implements Serializable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toTextFormat() {
        return title + " | " + author + " | " + year;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Year: " + year;
    }
}

public class BookManager {
    private static final String TEXT_FILE = "book.txt";
    private static final String SERIAL_FILE = "book.ser";

    private static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBOOK MENU");
            System.out.println("1. Add New Book");
            System.out.println("2. Save Books to Text File");
            System.out.println("3. Save Books to Serialized File");
            System.out.println("4. Display Books from Text File");
            System.out.println("5. Display Books from Serialized File");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBook(sc);
                case 2 -> saveToTextFile();
                case 3 -> saveToSerializedFile();
                case 4 -> readFromTextFile();
                case 5 -> readFromSerializedFile();
                case 6 -> {
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addBook(Scanner sc) {
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter publication year: ");
        int year = sc.nextInt();

        Book book = new Book(title, author, year);
        bookList.add(book);

        System.out.println("Book added successfully!");
    }

    private static void saveToTextFile() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Book book : bookList) {
                writer.write(book.toTextFormat() + "\n");
            }
            System.out.println("Books successfully saved to book.txt");
        } catch (IOException e) {
            System.out.println("Error saving to text file.");
            e.printStackTrace();
        }
    }

    private static void saveToSerializedFile() {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(bookList);
            System.out.println("Books successfully serialized to book.ser");
        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
    }

    private static void readFromTextFile() {
        System.out.println("\nBooks in book.txt:");

        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading book.txt");
        }
    }

    private static void readFromSerializedFile() {
        System.out.println("\nBooks in book.ser:");

        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Book> storedBooks = (List<Book>) ois.readObject();
            for (Book b : storedBooks) {
                System.out.println(b);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading serialized file.");
        }
    }
}
