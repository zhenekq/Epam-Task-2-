package by.epamtc.util;

import by.epamtc.item.Ball;
import by.epamtc.item.Basket;

import java.util.ArrayList;

public class Color {

    private static ArrayList<Ball> getColorOfBalls(Basket basket, String color){
        if(basket == null){
            //exception
        }
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
