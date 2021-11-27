package by.bsuir.WT.task_12_16.comparator;

import by.bsuir.WT.task_12_16.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
