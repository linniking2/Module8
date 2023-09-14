// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Enter with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Shift+F10 or click the green arrow button in the gutter to run the code.
// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.

class ShapeTest{
    public String getName(Shape shape,String name){
        return shape.getName(name);
    }

    public static void main(String[] args){
     ShapeTest pieceName = new ShapeTest();

     String circleName = pieceName.getName(new Circle(), "Circle");
     System.out.println(circleName);

     String squareName = pieceName.getName(new Square(), "Square");
     System.out.println(squareName);

     String triangleName = pieceName.getName(new Triangle(), "Triangle");
     System.out.println(triangleName);

     String pentagonName = pieceName.getName(new Pentagon(), "Pentagon");
     System.out.println(pentagonName);

     String hexagonName = pieceName.getName(new Hexagon(), "Hexagon");
     System.out.println(hexagonName);
//
    }

}

abstract class Shape{
   public abstract String getName(String name);
}
class Circle extends Shape{
    public String getName(String name){
        return "Circle";
    }
}
class Square extends Shape{
    public String getName(String name){
        return "Square";
    }
}
class Triangle extends Shape{
    public String getName(String name){
        return "Triangle";
    }
}
class Pentagon extends Shape{
    public String getName(String name){
        return "Pentagon";
    }
}
class Hexagon extends Shape{
    public String getName(String name){
        return "Hexagon";
    }
}