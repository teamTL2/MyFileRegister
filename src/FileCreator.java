
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class FileCreator {
    
    public FileCreator()
    {
        
    }
    
    //elenxei an to arxeio iparxei,an oxi to dimiourgei.
    public boolean fileChecker(File file) {
         boolean exist = false;
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
                System.out.println("DOULEUEI WS EDW!!!");
                exist = true; 
            } 
            else
            {
                exist = false;
            }
        }
        catch(IOException e)
        {
            System.out.println("Error file not found in directory" + e);
        }
        return exist;
    }
}
    

