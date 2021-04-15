package by.epamtc.util;

import by.epamtc.item.Ball;
import by.epamtc.item.Basket;

import java.util.ArrayList;

public class Color {

    public static ArrayList<Ball> getColorOfBalls(Basket basket, String color){
        ArrayList<Ball> colorList = new ArrayList<>();
        for(Ball ball: basket.getBalls()){
            if(ball.getColor().toLowerCase().equals(color.toLowerCase())){
                colorList.add(ball);
            }
        }
        return colorList;
    }

    public static int amountOfColoredBalls(Basket basket, String color){
        return getColorOfBalls(basket, color).size();
    }
}
