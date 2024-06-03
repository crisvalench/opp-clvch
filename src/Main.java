import figures.Line;
import figures.Square;

public class Main {
    public static void main(String[] args) {
        //Example for printing method
        Line l1 = new Line(3);
        l1.printLine();

        Line l2 = new Line(15);
        l2.printLine();

        Square sq1 = new Square(5);
        sq1.printSquare();

        Square sq2 = new Square(8);
        sq1.printSquare();

        printRectanguleTriangule(4);
        printRectanguleTriangule(2);

        printRectanguleTriangule1(4);
    }

    public static void printRectanguleTriangule(int num){
        System.out.println("----------Printing Rectangule Triangule----------");
        for(int height = 0; height < num; height++){
            for(int weight = 0; weight < num; weight++){
                if(weight<=height) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void printRectanguleTriangule1(int num) {
        System.out.println("----------Printing Rectangule Triangule----------");
        for (int height = 0; height < num; height++) {
            for (int weight = 0; weight < num; weight++) {
                if (weight >= height) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
}


