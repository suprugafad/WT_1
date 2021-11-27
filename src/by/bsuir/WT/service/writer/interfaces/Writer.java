package by.bsuir.WT.service.writer.interfaces;

public interface Writer {
    void write(String str);

    void writeLn(String str);

    void writeF(String format, Object... args);
}
