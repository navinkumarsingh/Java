package Day25_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*1) Create a file
2) writing content into file
3) reading content from the file
4) rename a file
5) delete a file
*/


public class Ex2_FileActions {


    //Create a file
    public static void createFile(String filePath)
    {
        File fileObj=new File(filePath);

        try
        {
            if(fileObj.createNewFile())
            {
                System.out.println("File is created: "+fileObj.getName());
            }
            else
            {
                System.out.println("File is already exists.");
            }
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //Write content into the file
    public static void writeFile(String filePath)
    {
        try
        {
            FileWriter mywriter=new FileWriter(filePath);

            mywriter.write("Welcome to java");
            mywriter.append("Demonstrating file handling concept.");

            mywriter.close();

            System.out.println("Successfully wrote the content in the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }


    //reading content from the file

    public static void readFile(String filePath)
    {
        try
        {
            File myObj=new File(filePath);

            Scanner sc=new Scanner(myObj);

            while(sc.hasNextLine())
            {
                String content=sc.nextLine();
                System.out.println(content);
            }
            sc.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    //rename the file
    public static void renameFile(String oldFilePath, String newFilePath)
    {
        File oldfile=new File(oldFilePath);
        File newfile=new File(newFilePath);

        if(oldfile.renameTo(newfile))
        {
            System.out.println("File is renamed." +newfile.getName());
        }
        else
        {
            System.out.println("The file cannot be renamed.");
        }
    }

    //delete the file

    public static void deleteFile(String filePath)
    {
        File myObj=new File(filePath);

        if(myObj.delete())
        {
            System.out.println("Deleted the file: "+myObj.getName());
        }
        else
        {
            System.out.println("Failed to delete the file. ");
        }
    }


    public static void main(String[] args) {

        createFile(".\\src\\main\\java\\ex24_FileHandling\\test.txt");

        writeFile(".\\src\\main\\java\\ex24_FileHandling\\test.txt");

        readFile(".\\src\\main\\java\\ex24_FileHandling\\test.txt");

        renameFile(".\\src\\main\\java\\ex24_FileHandling\\test.txt",".\\src\\main\\java\\ex24_FileHandling\\testnew.txt");

        deleteFile(".\\src\\main\\java\\ex24_FileHandling\\testnew.txt");
    }

}
