package by.epamtc.item;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class Ball {

    private String color;
    private double weight;

    public Ball(String color, double weight) throws Exception {
        if(weight <= 0){
            throw new Exception("Weight might be more than 0!");
        }
        if(color == null){
            throw new Exception("Color might be exists!");
        }
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ball ball = (Ball) object;
        return Double.compare(ball.weight, weight) == 0 && color.equals(ball.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
