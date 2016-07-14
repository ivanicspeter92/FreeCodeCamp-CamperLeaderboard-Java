/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camperleaderboard;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author peter.ivanics
 */
public class ContentLoader {
    private String filePath;
    
    public ContentLoader(String filePath) {
        this.filePath = filePath;
    }
    
    public String getContents()
    {
        try {
            String readData = "";
            Scanner in = new Scanner(new File(filePath));
            while(in.hasNext())
                readData += in.nextLine() + "\r\n";
            in.close();
            return  readData;
        }
        catch (Exception e)
        {
            e.getMessage();
            return null;

        }
    }
}
