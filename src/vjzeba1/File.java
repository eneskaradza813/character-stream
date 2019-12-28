package vjzeba1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public static void main(String[] args) {
        
        String myText = "Hello world";
        try(FileWriter fw = new FileWriter("myFile.txt");){
            fw.write(myText);
        }catch(IOException exc){
            System.out.println(exc);
        }
        
    }
    
}
