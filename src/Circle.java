import java.util.HashMap;
import java.util.Map;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Radius", Double.toString(this.getRadius())
        ));
    }
}
