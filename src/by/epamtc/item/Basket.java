package by.epamtc.item;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket(){
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public int getSizeOfBasket(){
        return balls.size();
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}
