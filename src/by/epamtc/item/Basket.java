package by.epamtc.item;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket(){
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls){
        if(balls == null){
            //exception
        }
        this.balls = balls;
    }

    public void addBall(Ball ball){
        if(ball == null){
            //exception
        }
        this.balls.add(ball);
    }

    public ArrayList<Ball> getBalls() {
        return this.balls;
    }

    public int getSizeOfBasket(){
        return this.balls.size();
    }

    public void setBalls(ArrayList<Ball> balls) {
        if(balls == null){
            //exception
        }
        this.balls = balls;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Basket basket = (Basket) object;
        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), balls);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + balls +
                '}';
    }
}
