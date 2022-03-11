import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try {

            File file = new File("indicative_File.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()){

                break;
            }

            
        }
        catch ( FileNotFoundException e){
            
            //say hello to heaven
        }
      


    }
}
