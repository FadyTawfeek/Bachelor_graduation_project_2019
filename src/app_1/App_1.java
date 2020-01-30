/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


/**
 *
 * @author HP
 */
public class App_1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        NewJFrame1 form = new NewJFrame1();
        form.setExtendedState(NewJFrame1.MAXIMIZED_BOTH); 
        form.setVisible(true);
    }    
}
