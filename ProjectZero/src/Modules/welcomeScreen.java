package Modules;
import java.util.Scanner;
import java.io.*;


public class welcomeScreen
{
    public void display() throws Exception
    {
        File file = new File("C:\\Users\\wrupp\\Desktop\\temp\\Bill_Ruppert_P0\\ProjectZero\\src\\Util\\welcomeScreen.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}




