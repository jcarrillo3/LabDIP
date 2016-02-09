/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.*;

/**
 *
 * @author Juan
 */
public class FileInput implements Input {
    File file = new File(File.separator + "File1.txt");
    
    @Override
    public String inputLn() {
        String ln = null;
        BufferedReader fr = null;
        try {
            if (file.exists()){
                fr = new BufferedReader( new java.io.FileReader(file));
                ln = fr.readLine();
                fr.close();
            } else {
                System.out.println("File not found.");
            }
        } catch (IOException ioe){
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ioe2){
                System.out.println(ioe2.getMessage());
            }
            System.out.println( ioe.getMessage() );
            System.exit(1);
        }
        return ln;
    }
    
}
