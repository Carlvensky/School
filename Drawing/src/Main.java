// time conplexity is O(1) and O(N) for the loop therefor total is O(N)
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable[] shapes = {new Circle(), new Rectangle()};

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
