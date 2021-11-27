package by.bsuir.WT.task_12_16;

public class ISBN implements Comparable<ISBN>, Cloneable {
    private final int bookNumber;

    public ISBN(String bookNumberStr) {
        bookNumber = Integer.parseInt(bookNumberStr.replace("-", ""));
    }

    @Override
    public int compareTo(ISBN isbn) {
        return bookNumber - isbn.bookNumber;
    }

    @Override
    public ISBN clone() throws CloneNotSupportedException {
        return (ISBN) super.clone();
    }
}
