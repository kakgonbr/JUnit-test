class Animal {
    void speak() {
        var logger = java.util.logging.Logger.getLogger("Animal");
        logger.info("Animal speaks");
    }
}

public class Dog extends Animal {
    @Override
    void speak() {
        var logger = java.util.logging.Logger.getLogger("Dog");
        logger.info("Dog barks");
    }
}
