package Task_9July;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
String filepath= "C:\\Users\\Acer-nitro-5\\IdeaProjects\\LearningJavaATB13xProgram\\report";
       try {
           FileReader f = new FileReader(filepath);
           System.out.println("File opened");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
    }
}
