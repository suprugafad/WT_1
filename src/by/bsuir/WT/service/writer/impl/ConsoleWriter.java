package by.bsuir.WT.service.writer.impl;

import by.bsuir.WT.service.writer.interfaces.Writer;

public class ConsoleWriter implements Writer {
    private static ConsoleWriter instance;

    private ConsoleWriter() {
    }

    public static ConsoleWriter getInstance() {
        if (instance == null) {
            instance = new ConsoleWriter();
        }
        return instance;
    }

    @Override
    public void write(String str) {
        System.out.print(str);
    }

    @Override
    public void writeLn(String str) {
        System.out.println(str);
    }

    @Override
    public void writeF(String format, Object... args) {
        System.out.printf(format, args);
    }
}
