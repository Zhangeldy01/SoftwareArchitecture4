import java.util.Map;

// интерфейс для геомтерических фигур
public interface IShape {

    // Название фигуры
    String getName();
    // Площадь фигуры
    double getArea();

    // Периметр фигуры
    double getPerimeter();

    Map<String, String> getParameters();
}
