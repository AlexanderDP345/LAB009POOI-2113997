import java.util.*;
import javax.swing.*;
import java.io.*;

public class Estudiantes2023 {
    private ArrayList<Estudiante> estudiantes;

    public Estudiantes2023() {
        estudiantes = new ArrayList<>();
        cargarArchivo();
    }
    //agregar alumnos D ethan
    public void adicionar(Estudiante estudiante) {
        //codigo
    }
    
    // Método para obtener el siguiente código disponible 
    private int obtenerSiguienteCodigoDisponible() {
        if (!estudiantes.isEmpty()) {
            int ultimoCodigo = estudiantes.get(estudiantes.size() - 1).getCodigo();
            return ultimoCodigo + 1; 
        } else {
            return 100; 
        }
    }
    
    //elimnar estudiante E ethan
    public void eliminar(Estudiante estudiante) {
        //codigo
    }

    //obtener estudiante 
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    //obtener estudiante 
    public Estudiante obtener(int pos) {
        if (pos >= 0 && pos < estudiantes.size()) {
            return estudiantes.get(pos);
        }
        return null;
    }
    
    //buscar estudiante
    public Estudiante buscar(int codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo() == codigo) {
                return estudiante;
            }
        }
        return null;
    }
    //buscar por apellido Martin i
    
    
    
    //tamaño de alumno  
    public int tamano() {
        return estudiantes.size();
    }
    //listar estudiantes alfabetico  Camila
    public void listarEstudiantes() {
        //codigo
    }
    //listar estudiante alfetico por apellido B Camila
    public void listarEstudiantesPorApellido() {
      //codigo
    }
    
    //modificar estudiante F Jeff
    public void modificarEstudiante(Estudiante estudianteExistente, Estudiante nuevoEstudiante) {
        //codigo
    }
    //modificar apellido misnusula G Jeff
    public void modificarApellidosMayuscula() {
      //codigo
    }
        //pension menor a mayor C KEVIN
    public void listarEstudiantesPorPensionAscendente() {
      //codigo
    }
    //suma total estudiante I KEVIN
    

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
            File file = new File("C:\\Users\\Jeff\\Desktop\\pc04\\estudiantes.txt");
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