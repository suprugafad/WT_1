package by.bsuir.WT.task_12_16.comparator;

import by.bsuir.WT.task_12_16.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitleComparator() {
        this.comparator = new AuthorComparator().thenComparing(new TitleComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
