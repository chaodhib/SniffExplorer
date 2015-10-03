/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tc.sniffexplorer.core;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import tc.sniffexplorer.model.Message;

/**
 *
 * @author chaouki
 */
public class ViewerFile implements Viewer{
    
    private PrintWriter out;
    
    public ViewerFile(){
        try {
            out= new PrintWriter("sniffexplorer.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewerFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void show(Message message) {
        out.println(message);
    }
    
    @Override
    public void cleanup(){
        out.close();
    }
}