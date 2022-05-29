package example.factories;

import example.entities.Ball;
import factory.AbstractFactory;

public class BallFactory extends AbstractFactory<Ball> {
    private static BallFactory instance = null;

    public static BallFactory getInstance() {
        if (instance == null) {
            instance = new BallFactory();
        }
        return instance;
    }
}
