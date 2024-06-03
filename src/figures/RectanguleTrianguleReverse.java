package figures;

public class RectanguleTrianguleReverse {
    private int num;

    public RectanguleTrianguleReverse() {
    }

    public RectanguleTrianguleReverse(int num) {
        this.num = num;
    }
    public void printRectanguleTrianguleReverse() {
        System.out.println("----------Printing Rectangule Triangule Reverse " + num + "----------");
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
