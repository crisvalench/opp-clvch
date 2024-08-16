package test;
//Manejo de Excepciones

public class Main {
    public static void main(String[] args) {
        int a  = 5;
        int c = 0;
        printSum(a,c);
        printDiv(a,c);
        printDiff(a,c);

    }

    public static void printSum(int a, int c){
        System.out.println("a + c = " + (a + c));
    }

    public static void printDiff(int a, int c){
        System.out.println("a - c = " + (a - c));
    }
    public static void printDiv(int a, int c){
        try{
            System.out.println("a / c = " + (a / c));
            System.out.println("****************/ Operacion / ****************");
        }catch(ArithmeticException ae){
           // ae.printStackTrace(); Estado del error
            System.out.println("One of the numbers is 0, and / operation can't be executed. Exception Message: " + ae.getMessage());
        } finally {
            System.out.printf("Division Method Executed");
        }


    }
}
