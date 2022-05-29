package example.factories;

import example.entities.Entity;
import factory.AbstractFactory;

public class EntityFactory extends AbstractFactory<Entity> {
    private static EntityFactory instance = null;

    public static EntityFactory getInstance() {
        if (instance == null) {
            instance = new EntityFactory();
        }
        return instance;
    }
}
