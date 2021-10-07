/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoej3;

/**
 *
 * @author Alumno Presencial
 */
public class AccesoEJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ficheros fichero= new Ficheros();
        
        
        fichero.cifrarFicheros("C:\\Users\\Alumno Presencial\\Pictures\\Camera Roll", 3);
        fichero.descifrarFichero();
        
    }
    
}
