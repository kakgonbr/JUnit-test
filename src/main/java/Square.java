interface Shape {
    void draw();
    void resize();
}

public class Square implements Shape {
    public void draw() {
        var logger = java.util.logging.Logger.getLogger("Square");
        logger.info("Drawing square");
    }

    @Override
    public void resize() {
        throw new UnsupportedOperationException();
    }

}
