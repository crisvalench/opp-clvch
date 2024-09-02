package files;

import java.io.*;

public class MainRead {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = "";
            System.out.println(br.readLine());
            while(line != null) {
                line = br.readLine();
                if(line != null) System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }

    }
}
