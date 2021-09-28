package paquete;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface AccesoInterfazEJ1 {

	List<File> listarFicheros(String ruta, boolean ordenadosPorNombre, boolean soloDirectorios, boolean ordenadorPorTamaño);

	int crearDirectorios(File rutaOrigen, ArrayList<String> listaDirectorios);

	int cambiarExtensionFicheros(String ruta, String extensionAntigua, String extensionNueva);
}