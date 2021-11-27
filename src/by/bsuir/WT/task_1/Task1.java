package by.bsuir.WT.task_1;

import by.bsuir.WT.service.reader.impl.ConsoleReader;
import by.bsuir.WT.service.reader.interfaces.Reader;
import by.bsuir.WT.service.writer.impl.ConsoleWriter;
import by.bsuir.WT.service.writer.interfaces.Writer;

public class Task1 {
    public static void main(String[] args) {
        Reader reader = ConsoleReader.getInstance();
        Writer writer = ConsoleWriter.getInstance();

        writer.writeLn("Enter x: ");
        double x = reader.readDouble();
        writer.writeLn("Enter y: ");
        double y = reader.readDouble();

        writer.writeLn("Result: " + calculateExpression(x, y));
    }

    private static double calculateExpression(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        result = result / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x;
        return result;
    }
}
