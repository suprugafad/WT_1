package by.bsuir.WT.task_3;

import by.bsuir.WT.service.reader.impl.ConsoleReader;
import by.bsuir.WT.service.reader.interfaces.Reader;
import by.bsuir.WT.service.writer.impl.ConsoleWriter;
import by.bsuir.WT.service.writer.interfaces.Writer;

public class Task3 {
    public static void main(String[] args) {
        Reader reader = ConsoleReader.getInstance();
        Writer writer = ConsoleWriter.getInstance();

        double a = reader.readDouble();
        double b = reader.readDouble();
        double h = reader.readDouble();

        printTable(writer, a, b, h);
    }

    private static void printTable(Writer writer, double a, double b, double h) {
        final String line = "-------------------------";
        writer.writeLn(line);
        writer.writeF("|\t%4s\t|\t%5s\t|\n", 'x', 'y');
        writer.writeLn(line);
        for (double i = a; i <= b; i += h) {
            writer.writeF("|\t%4.1f\t|\t%4.3f\t|\n", i, Math.tan(i));
        }
        writer.writeLn(line);
    }

}
