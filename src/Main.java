import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        // Добавляем круг
        Circle circle1 = new Circle(10);
        figureBox.add(circle1);

        // Добавляем треугольник
        Triangle triangle = new Triangle(3,4,5);
        figureBox.add(triangle);

        // Добавляем прямоугольник
        Rectangle rectangle = new Rectangle(5,10);
        figureBox.add(rectangle);

        // Удаляем фигуру по ее номеру
        figureBox.delFigure(1);

        // Находим фигуру по названию
        figureBox.searchFigure("Rectangle");
        // Выводим информацию о фигуре
        figureBox.getFigureInfo(1);

    }
}