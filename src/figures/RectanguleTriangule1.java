package figures;

public class RectanguleTriangule1 {
    private int num;

    public RectanguleTriangule1() {
    }

    public RectanguleTriangule1(int num) {
        this.num = num;
    }
    public void printRectanguleTriangule1() {
        System.out.println("----------Printing Rectangule Triangule " + num + "----------");
        for (int height = 0; height < num; height++) {
            for (int weight = 0; weight < num; weight++) {
                if (weight >= height) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
