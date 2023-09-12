import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeometryFigure {
    static private List<IShape> toolbox;

    public GeometryFigure() {

        toolbox = new ArrayList<IShape>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }
    // Метод для удаления фигуры
    public void delFigure(int num){
        if (num >= toolbox.size()){
            System.out.println("Фигуры по запрошенному номеру не существует.");
            return;
        }
        IShape figure = toolbox.remove(num);
        System.out.println("Фигура удалена");
        printFigure(figure);
        }
    // Метод поиска необходимой фигуры
    public void searchFigure(String name){
        int i = 0;
        boolean found = false;
        String nameFormat = name.toLowerCase();
        for (IShape figure : toolbox) {
            if (nameFormat.equals((figure.getName().toLowerCase())))
                found = true;
            System.out.println(i);
            printFigure(figure);
        }
        i ++;
        if (!found)
            System.out.println("Фигура с названием " + name + "не найдено");
    }
    // Метод отображения подробной информации о фигуре
    public void getFigureInfo(int num) {
        if (num >= toolbox.size()) {
            System.out.println("Фигуры нет.");
            return;
        }
        IShape figure = toolbox.get(num);
        printFigure(figure);
    }
    // Вывод информации о фигуре
    private void printFigure(IShape figure) {
        Map<String,String> parametersMap = figure.getParameters();
        String parametersString = "";
        for (var item : parametersMap.entrySet())
            parametersString += item.getKey() + ": " + item.getValue() + "\n";

        System.out.println("Name of the figure: " + figure.getName() + "\n" +
                parametersString +
                "The area of the figure: "  + (Math.round(figure.getArea() * 100) / 100.0) + "\n" +
                "The perimeter of the figure: " + (Math.round(figure.getPerimeter() * 100) / 100.0)
        );
    }
}
