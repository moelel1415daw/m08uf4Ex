/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m08uf4ex;

/**
 *
 * @author elafia
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;


public class M08uf4Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("m08uf4Ex.html");
          try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                bw.write("<html>");bw.newLine();
                bw.write("  <head>");bw.newLine();
                bw.write("    <title>");bw.newLine();
                bw.write("      Exercici 1");bw.newLine();
                bw.write("    </title>");bw.newLine();
                bw.write("  </head>");bw.newLine();
                bw.write("  <body>");bw.newLine();
                bw.write("    P&agrave;gina web de l'Exercici 1<br>");bw.newLine();
                bw.write("    ");bw.newLine();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                bw.write(dateFormat.format(date));bw.newLine();
                bw.write("  </body>");bw.newLine();
                bw.write("</html>");bw.newLine();
                bw.close();              
          }
    }
    
}
