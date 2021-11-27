package by.bsuir.WT.task_9;

import by.bsuir.WT.service.writer.impl.ConsoleWriter;
import by.bsuir.WT.service.writer.interfaces.Writer;
import by.bsuir.WT.task_9.entity.Ball;
import by.bsuir.WT.task_9.entity.Basket;
import by.bsuir.WT.task_9.entity.Color;

public class Task9 {
    public static void main(String[] args) {
        Writer writer = ConsoleWriter.getInstance();

        Basket basket = new Basket();
        basket.addBall(new Ball(10, Color.GREEN));
        basket.addBall(new Ball(5, Color.BLUE));
        basket.addBall(new Ball(3, Color.RED));
        basket.addBall(new Ball(11, Color.BLUE));

        writer.writeLn("Weight of balls in basket: " + basket.getWeightOfBallList());
        writer.writeLn("Count of blue balls: " + basket.getCountOfBlueBalls());
    }
}
