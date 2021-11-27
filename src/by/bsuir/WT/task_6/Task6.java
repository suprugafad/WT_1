package by.bsuir.WT.task_6;

import by.bsuir.WT.service.reader.impl.ConsoleReader;
import by.bsuir.WT.service.reader.interfaces.Reader;
import by.bsuir.WT.service.writer.impl.ConsoleWriter;
import by.bsuir.WT.service.writer.interfaces.Writer;

public class Task6 {
    public static void main(String[] args) {
        Reader reader = ConsoleReader.getInstance();
        Writer writer = ConsoleWriter.getInstance();

        writer.writeLn("Input size of array: ");
        int arrSize = reader.readInt();
        int[] array = inputElementsOfArray(reader, writer, arrSize);

        int[][] matrix = initMatrix(array);
        printMatrix(writer, matrix);
    }


    private static int[] inputElementsOfArray(Reader reader, Writer writer, int arrSize) {
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            writer.writeLn("Input " + i + " element: ");
            array[i] = reader.readInt();
        }
        return array;
    }

    private static int[][] initMatrix(int[] arr) {
        int[][] matrix = new int[arr.length][arr.length];
        int offset = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[(j + offset) % arr.length];
            }
            offset++;
        }
        return matrix;
    }

    private static void printMatrix(Writer writer, int[][] matrix) {
        for (int[] ints : matrix) {
            for (int element : ints) {
                writer.write(String.valueOf(element));
            }
            writer.writeLn("");
        }
    }
}
