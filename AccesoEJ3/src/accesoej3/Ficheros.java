/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoej3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Presencial
 */
public class Ficheros {

    String carpeta = "C:\\Users\\Alumno Presencial\\Pictures\\Camera Roll";
    File fi = new File(carpeta);
    FileInputStream in;
    FileOutputStream out;
    FiltroTxt filtro;

    public List<File> filtrar(String ruta) {

        return filtro.listarTxt(ruta);

    }

    public void codificar(File fichero1, File fichero2, int cifrado) {
        try {
            try {
                in = new FileInputStream(fichero1);
            } catch (FileNotFoundException ex) {
                System.out.println("Error. Fichero no encontrado.");
            }
            out = new FileOutputStream(fichero2);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c + cifrado);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error.");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar.");
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar.");
                }
            }
        }
    }

    /**
     * Metodo parta cifrar los ficheros seleccionados en el filtro anterior
     *
     * @param ruta
     * @param cifrado
     * @return 
     */
    public void cifrarFicheros(String ruta, int cifrado) {
        File archivo= new File (ruta);
        List<File> lista = filtro.listarTxt(ruta);
        lista.forEach((File fichero) -> {
            File ficheroSalida = new File(archivo.getAbsolutePath());
            codificar(fichero, ficheroSalida, cifrado);
        });
       
    }

    /**
     * Método para descifrar lo cifrado anteriormente
     * @return 
     */
    
    public int descifrarFichero() {
        try {
            in = new FileInputStream(fi);
            out = new FileOutputStream(fi);
            int x;

            while ((x = in.read()) != -1) {
                x = in.read() - 3;
                return x;
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Fichero no encontrado");
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

}
