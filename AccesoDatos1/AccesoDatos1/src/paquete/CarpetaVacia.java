package paquete;

public class CarpetaVacia extends Exception{

	public CarpetaVacia(String message, Throwable cause) {
        super("La carpeta no tiene nada", cause);
      
    }
}
