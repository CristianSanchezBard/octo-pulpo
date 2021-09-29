package paquete;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.BadLocationException;

public class AccesoFicheros implements AccesoInterfazEJ1 {

	
	public List<File> listarFicheros(String ruta, boolean ordenadosPorNombre, boolean soloDirectorios, boolean ordenadosPorTamaño) {
		try {
			File fichero = new File(ruta);

			File[] ficherosSinOrdenar = fichero.listFiles();
			int contador = 0;

			List<File> ficheroOrdenado = new ArrayList<File>();
			List<File> nombreDirectorio = new ArrayList<File>();

			/**
			 * Si la ruta está vacia buscara en la raíz en función del OS
			 */
			if (ruta == null) {
				ficherosSinOrdenar = File.listRoots();
				throw new BadLocationException("No existe dicho fichero", 0);
			}

			/**
			 * Si ordenadosPorNombre es true retornará la lista ordenada por nombre
			 */
			if (ordenadosPorNombre) {

				for (int i = 0; i < ficherosSinOrdenar.length; i++) {
					ficheroOrdenado.add(ficherosSinOrdenar[i]);
				}

				Comparator<File> comparatorNombre = (fichero1, fichero2) -> {
					return fichero1.getName().compareTo(fichero2.getName());
				};

				ficheroOrdenado.sort(comparatorNombre);

				return ficheroOrdenado;
			}

			
			if (ordenadosPorTamaño) {
				Comparator<File> comparatorTamaño = new Comparator<File>() {
					@Override
					//comparar los ficheros
					public int compare(File file1, File file2) {
						return file1.length() < file2.length() ? -1 : file1.length() == file2.length() ? 0 : 1;
						 
					}
				};
				ficheroOrdenado.sort(comparatorTamaño); // los ordena por nombre
			}
			/**
			 * Recibe el soloDirectorios si es true
			 * Además si no es un directorio lanzará la excepcion personalizada
			 */
			if (soloDirectorios) {
				for (File directorio : nombreDirectorio) {
					if (directorio.isDirectory()) {
						nombreDirectorio.add(directorio);
					}
					else {
						new NoEsUnDirectorioNoSePuedeListar();
					}
				}
				
			}

		}

		/**
		 * Si la ruta no existe 
		 * 
		 */
		catch (BadLocationException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return null;
	}
	

	@Override
	public int crearDirectorios(File rutaOrigen, ArrayList<String> listaDirectorios) {
		
		
		try {
			File directorio= new File(String ruta));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
	
	}

	@Override
	public int cambiarExtensionFicheros(String ruta, String extensionAntigua, String extensionNueva) {
		int contador = 0;
		File fichero = new File(ruta);
		String nuevaRuta = "";
		String[] partes = fichero.getName().split(".");
		if (partes[partes.length - 1].equals(extensionAntigua)) {
			for (int i = 0; i < partes.length - 2; i++) {
				nuevaRuta = partes[i];
			}
		}

		return contador;
	}

}