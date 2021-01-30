import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo3 {

	public CrearArchivo3() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CrearArchivo3 obj = new CrearArchivo3();
		obj.creaArchivo("archivo 3","El contenido del nuevo archivo es éste");
		
		CrearArchivo3 obj2 = new CrearArchivo3();
		obj2.creaArchivo("archivo 4","El contenido del el archivo 4");
		
		
	}
	
	public static void creaArchivo(String NombreArchivo, String Contenido) throws IOException {
		FileWriter archivo;
		archivo = new FileWriter(NombreArchivo);
		BufferedWriter archTemp = null;
		archTemp = new BufferedWriter(archivo);
		try (PrintWriter wrArchTemp = new PrintWriter(archTemp)){
			wrArchTemp.print(Contenido);
			wrArchTemp.close();
		}
		archTemp.close();
		archivo.close();
	}

}
