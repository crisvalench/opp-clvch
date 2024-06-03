package figures;

public class Square {
    private int lenght;

    public Square() {
    }

    public void printSquare(){
        System.out.println("-----Printing Square "+ lenght +" -----");
        for(int height = 0; height > lenght; height++){
            for(int weight = 0; weight < lenght; weight++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    public Square(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
