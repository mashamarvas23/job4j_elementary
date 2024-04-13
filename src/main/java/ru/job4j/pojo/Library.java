package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("Война и мир", 3645);
        Book secondBook = new Book("Мастер и Маргарита", 2225);
        Book thirdBook = new Book("Колобок", 50);
        Book fourthBook = new Book("Clean code", 90);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        Book book = books[0];
        books[0] = books[3];
        books[3] = book;
        System.out.println("Переставили местами книги с индексом 0 и 3");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println("Вывод книг с именем 'Clean code':");
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
