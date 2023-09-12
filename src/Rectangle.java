import java.util.HashMap;
import java.util.Map;

public class Rectangle implements IShape {
    private double width;
    private double height;



    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of("Width", Double.toString(this.getWidth()), "Height", Double.toString(this.getHeight())));
    }
}
