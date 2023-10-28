import java.util.*;
import javax.swing.*;
import java.io.*;

public class Estudiantes2023 {
    private static ArrayList<Estudiante> estudiantes;

    public Estudiantes2023() {
        estudiantes = new ArrayList<>();
        cargarArchivo();
    }

    public void adicionar(Estudiante estudiante) {
        //Introduce c�digo
    }

    public void eliminar(Estudiante estudiante) {
        //Introduce c�digo
    }

    public Estudiante obtener(int pos) {
	//Introduce c�digo
        return null;
    }

    public Estudiante buscar(int codigo) {
	//Introduce c�digo        
	  return null;
    }

    public int tamano() {
        //Introduce c�digo        
	  return 0;
    }

    public void listarEstudiantes(){
        //Introduce c�digo    a    
    }
    public void listarEstudiantesPorApellido() {
    //Introduce c�digo   b
    }
    public void listarEstudiantesPorPensionAscendente() {
        //Introduce c�digo  c
    }
    public void modificarEstudiante(Estudiante estudianteExistente, Estudiante nuevoEstudiante) {
       //Introduce c�digo  f
    }
    public void modificarApellidosMayuscula() {
    //Introduce c�digo  g
    }
    public boolean existeEstudiante(int codigo) {
        //Introduce c�digo  h
    }
    public double sumaTotalPensiones() {
       //Introduce c�digo  i
    }

    // M�todos para manipular el archivo de texto
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        while ((linea = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            createStudent(st);
        }
        br.close();
    }

	// M�todo que a�adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void createStudent(StringTokenizer st){
        int codigo = Integer.parseInt(st.nextToken().trim());
        String nombre = st.nextToken().trim();
        int ciclo = Integer.parseInt(st.nextToken().trim());
        double pension = Double.parseDouble(st.nextToken().trim());
        Estudiante estudiante = new Estudiante(codigo, nombre, ciclo, pension);
        adicionar(estudiante);
    }
	


    // M�todos para manipular el archivo de texto
    private void cargarArchivo() {
        try {
            File file = new File("./src/estudiantes.txt");
            Class<Estudiantes2023> clazz = Estudiantes2023.class;
            InputStream inputStream = clazz.getResourceAsStream("/estudiantes.txt");
            if (file.exists()) {
                readFromInputStream(inputStream);
            } else
                JOptionPane.showMessageDialog(null,
                        "El archivo estudiantes.txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
	
	public double sumaTotalPensiones() {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getPension();
        }
        return suma;
    }
	
    public void guardarArchivo() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Jeff\\Desktop\\pc04\\estudiantes.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
    
            for (Estudiante estudiante : estudiantes) {
                printWriter.println(
                    estudiante.getCodigo() + "," + 
                    estudiante.getNombre() + "," +
                    estudiante.getCiclo() + "," +
                    estudiante.getPension()
                );
            }
    
            printWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
        }
    }
}
