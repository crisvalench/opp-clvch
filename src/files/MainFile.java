package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            String message = "This is the content of the file. ";
            fileOutputStream.write(message.getBytes());
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }
    }
}