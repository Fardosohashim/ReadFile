package READFILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myObj=new File("FileName.txt");
            Scanner myReader = new Scanner(myObj);

           // System.out.println(myReader.hasNextLine());
    while(myReader.hasNextLine()) {
    String reader = myReader.nextLine();

    System.out.println(reader);

    System.out.println("successfully done!!");
}
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();

        }
    }
}
