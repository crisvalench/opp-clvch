package figures;

public class Rectangule {
    private int width;
    private int height;

    public Rectangule() {
    }

    public Rectangule(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printRectangule(){
        System.out.println("-----Printing Rectangule" + width + "x" + height + "-----");
        for(int height = 0; height > width; height++){
            for(int weight = 0; weight < width; weight++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
