package by.epamtc.util;

import by.epamtc.item.Ball;
import by.epamtc.item.Basket;

import java.util.concurrent.ExecutionException;

public class Weight {
    public static double getWeightOfBalls(Basket basket) throws Exception {
        if(basket == null){
            //exception
        }
        double weightOfBalls = 0;
        for(Ball ball: basket.getBalls()){
            weightOfBalls+= ball.getWeight();
        }
        return weightOfBalls;
    }
}
