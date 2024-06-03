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

        //RectanguleTriangule1
        RectanguleTriangule1 tr11 = new RectanguleTriangule1(4);
        tr11.printRectanguleTriangule1();

        RectanguleTriangule1 tr22 = new RectanguleTriangule1(5);
        tr22.printRectanguleTriangule1();

        //Rectangule
        Rectangule r1 = new Rectangule(6,4);
        r1.printRectangule();
    }


}


