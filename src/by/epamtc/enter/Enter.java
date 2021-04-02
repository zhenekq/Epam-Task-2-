package by.epamtc.enter;

import by.epamtc.item.Ball;
import by.epamtc.item.Basket;

public class Enter {
    public static void putBallInBasket(Basket basket) throws Exception {
        System.out.print("Enter amount of balls in basket: ");
        int amountOfBalls = ReadNumber.readIntegerNumber();
        while(amountOfBalls < 0){
            System.out.println("Enter positive amount of balls");
            amountOfBalls = ReadNumber.readIntegerNumber();
        }
        double weightOfBall = 0;
        String colorOfBall;
        for(int i = 0;i < amountOfBalls;i++){
            System.out.println("#" + (i + 1) + " Ball: ");
            System.out.print("The weight of this ball is: ");
            weightOfBall = ReadNumber.readDoubleNumber();
            while(weightOfBall < 0){
                System.out.print("Enter positive weight of ball");
                weightOfBall = ReadNumber.readDoubleNumber();
            }
            System.out.println("The color of this ball is: ");
            colorOfBall = ReadNumber.readString();
            while(colorOfBall == null || colorOfBall.isEmpty()){
                System.out.print("Color can't be null");
                colorOfBall = ReadNumber.readString();
            }
            basket.addBall(new Ball(colorOfBall, weightOfBall));
        }
    }
}
