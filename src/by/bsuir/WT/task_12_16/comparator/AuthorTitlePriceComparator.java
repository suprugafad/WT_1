package by.bsuir.WT.task_12_16.comparator;

import by.bsuir.WT.task_12_16.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitlePriceComparator(Comparator<Book> comparator) {
        this.comparator = new AuthorTitleComparator().thenComparing(new PriceComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
