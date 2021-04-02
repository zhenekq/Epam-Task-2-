package by.epamtc.weight;

import by.epamtc.item.Ball;
import by.epamtc.item.Basket;

import java.util.concurrent.ExecutionException;

public class Weight {
    public static double getWeightOfBalls(Basket basket) throws Exception {
        if(basket == null)
            throw new Exception("Basket can't be empty");
        double weightOfBalls = 0;
        for(Ball ball: basket.getBalls()){
            weightOfBalls+= ball.getWeight();
        }
        return weightOfBalls;
    }
}
