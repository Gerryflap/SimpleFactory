package example;

import example.entities.Ball;
import example.entities.Entity;
import example.factories.BallFactory;
import example.factories.EntityFactory;

public class Main {
    public static void main(String[] args) {
        // Add sub-factory, since all Balls are entities
        EntityFactory.getInstance().addSubFactory(BallFactory.getInstance());

        Entity entity = new Entity(0.5f, 0.5f);
        EntityFactory.getInstance().addManagedObject(entity);

        Ball ball = new Ball(0.1f, 0.1f, 0.0f, 0.1f);
        BallFactory.getInstance().addManagedObject(ball);

        System.out.printf("Entities: %s \n", EntityFactory.getInstance().getAllManagedObjects().toList());
        System.out.printf("Balls: %s \n", BallFactory.getInstance().getAllManagedObjects().toList());

        EntityFactory.getInstance().removeManagedObject(ball);
        System.out.printf("Entities: %s \n", EntityFactory.getInstance().getAllManagedObjects().toList());
    }
}
