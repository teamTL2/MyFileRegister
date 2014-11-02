
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class FileRegister extends FileCreator {
    public FileRegister()
    {
        
    }
    
    File usersFile = new File("C:\\Users\\wolf\\Documents\\NetBeansProjects\\MyFileRegister\\usersFile.txt");
    boolean result = fileChecker(usersFile);
    
    public void fileWriter(Users user)
    {
        try
        {
            if(result == true)
            {
                System.out.println("RESULT =  TRUE");
                FileWriter fWriter = new FileWriter(usersFile.getAbsolutePath());
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                bWriter.write(user.getName() + " " + user.getSurname() + " " + user.getPhone());
                bWriter.newLine();
                bWriter.close();
            }
            else
            {
                System.out.println("RESULT =  FALSE");
                FileWriter fWriter = new FileWriter(usersFile.getAbsolutePath(), true);//bazoume edw True gia na mporoume na anoi3poume to arxeio se Append mode.
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                bWriter.append(user.getName() + " " + user.getSurname() + " " + user.getPhone());
                bWriter.newLine();
                bWriter.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("Error!!" +e);
        }
        
    }
    
    public void fileReader(Users user){
        
        try 
        {
            Scanner fileScanner = new Scanner(usersFile);
            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                
                    if(line.contains(user.getSurname()) && line.contains(user.getPhone()))
                    {
                        ExceptionMessage message = new ExceptionMessage();
                        message.INFORMATIONMessage();
                    }
                
            }
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found!!" + ex);
        }
    }
}
