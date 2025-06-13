interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    @Override
    public void draw() {

    }
    // Missing draw() implementation → compile error
}
