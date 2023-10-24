import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите длины сторон треугольника");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        try{
            Triangle tr = new Triangle(x,y,z);
            System.out.println("периметр "+tr.getPerimeter());
            Files.writeString(Path.of("результирующий \" файл"), "периметр "+tr.getPerimeter());
        } catch (UnnaturalLengthEx e) {
            System.out.println("нельзя вводить такие числа!");
            System.out.println(e.getMessage());
            System.out.println(e.number + " не подходит в качестве длины");
        } /*catch (ImpossibleTriangleEx e) {
            System.out.println(e.getMessage());
        }*/
        catch (GeometryException e){
            System.out.println("Учи геометрию!!!");
        }
        catch (IOException | InvalidPathException e) {
            System.out.println("ошибка при записи");
            System.out.println(e.getMessage());
        }

    }
}