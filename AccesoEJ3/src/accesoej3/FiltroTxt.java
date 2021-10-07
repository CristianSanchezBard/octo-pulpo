/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoej3;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Alumno Presencial
 */
public class FiltroTxt {

    public FiltroTxt(String txt) {
    }

    /**
     * 
     * @param carpeta
     * @return 
     */
    public File[] listarTxt(String ruta){
       File carpeta= new File(ruta);
        FilenameFilter filtroTxt= new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("txt");
            }
        };
        
        
        File[] listFiles = carpeta.listFiles(filtroTxt);
       
       
        return listFiles;
    }
            
    
    
    
}