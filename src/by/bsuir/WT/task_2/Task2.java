package by.bsuir.WT.task_2;

import by.bsuir.WT.service.reader.impl.ConsoleReader;
import by.bsuir.WT.service.reader.interfaces.Reader;
import by.bsuir.WT.service.writer.impl.ConsoleWriter;
import by.bsuir.WT.service.writer.interfaces.Writer;

public class Task2 {
    public static void main(String[] args) {
        Reader reader = ConsoleReader.getInstance();
        Writer writer = ConsoleWriter.getInstance();

        writer.writeLn("Enter x coordinate: ");
        double x = reader.readDouble();
        writer.writeLn("Enter y coordinate: ");
        double y = reader.readDouble();

        writer.write(String.valueOf(contains(1, 1)));
    }

    public static boolean contains(double x, double y) {
        boolean isContains = false;

        if (y >= 0 && y <= 5) {
            isContains = x >= -4 && x <= 4;
        } else {
            if (y >= -3 && y <= 0) {
                isContains = x >= -6 && x <= 6;
            }
        }
        return isContains;
    }
}
