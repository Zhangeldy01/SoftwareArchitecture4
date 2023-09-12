import java.util.HashMap;
import java.util.Map;

public class Triangle implements IShape {
    private double a;
    private double b;
    private double c;



    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Sides of the triangle", this.getA() + ", " + this.getB() + ", " + this.getC()
        ));
    }
}
