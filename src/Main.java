import figures.*;

public class Main {
    public static void main(String[] args) {
        //Example for printing method

        //Line
        Line l1 = new Line(3);
        l1.printLine();

        Line l2 = new Line(15);
        l2.printLine();

        //Square
        Square sq1 = new Square(5);
        sq1.printSquare();

        Square sq2 = new Square(8);
        sq1.printSquare();

        //RectanguleTriangule
        RectanguleTriangule tr1 = new RectanguleTriangule(2);
        tr1.printRectanguleTriangule();

        RectanguleTriangule tr2 = new RectanguleTriangule(8);
        tr2.printRectanguleTriangule();

        //RectanguleTrianguleReverse
        RectanguleTrianguleReverse trr1 = new RectanguleTrianguleReverse(4);
        trr1.printRectanguleTrianguleReverse();

        RectanguleTrianguleReverse trr2 = new RectanguleTrianguleReverse(5);
        trr2.printRectanguleTrianguleReverse();

        //Rectangule
        Rectangule r1 = new Rectangule(6,4);
        r1.printRectangule();

        Rectangule r2 = new Rectangule(7,3);
        r2.printRectangule();
    }
}


