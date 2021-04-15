package by.epamtc.runner;

import by.epamtc.item.Ball;
import by.epamtc.util.Color;
import by.epamtc.util.Weight;
import by.epamtc.enter.Enter;
import by.epamtc.item.Basket;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws Exception {
        String BLUE_COLOR = "blue";
        Basket basket = new Basket();
        Enter.putBallInBasket(basket);
        System.out.println("Weight of balls in basket is: " + Weight.getWeightOfBalls(basket));
        System.out.println("Amount of blue balls is: " + Color.amountOfColoredBalls(basket, BLUE_COLOR));

    }
}
