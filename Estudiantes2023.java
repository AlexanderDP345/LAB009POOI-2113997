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
        int nuevoCodigo = obtenerSiguienteCodigoDisponible(); 
        estudiante.setCodigo(nuevoCodigo);
        estudiantes.add(estudiante);
        guardarArchivo();
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
       estudiantes.remove(estudiante);
        guardarArchivo();
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
    public Estudiante buscarPorApellido(String apellido) {
        for (Estudiante estudiante : estudiantes) {
            String[] partesNombre = estudiante.getNombre().split(" ");
            if (partesNombre.length > 1) {
                if (partesNombre[1].equalsIgnoreCase(apellido)) {
                    return estudiante;
                }
            }
        }
        return null;
    }
    
    
    //tamaño de alumno  
    public int tamano() {
        return estudiantes.size();
    }
    //listar estudiantes alfabetico  Camila
    public void listarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
    //listar estudiante alfetico por apellido B Camila
    public void listarEstudiantesPorApellido() {
      Collections.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                String[] partesNombre1 = e1.getNombre().split(" ");
                String[] partesNombre2 = e2.getNombre().split(" ");
    
                // Verificar si hay al menos un apellido en ambos estudiantes
                if (partesNombre1.length > 1 && partesNombre2.length > 1) {
                    String apellido1 = partesNombre1[1];
                    String apellido2 = partesNombre2[1];
    
                    return apellido1.compareToIgnoreCase(apellido2);
                } else {
                    // En caso de que no haya un segundo nombre en uno de los estudiantes, ordenar por nombre completo
                    return e1.getNombre().compareToIgnoreCase(e2.getNombre());
                }
            }
        });
    }
    
    //modificar estudiante F Jeff
    public void modificarEstudiante(Estudiante estudianteExistente, Estudiante nuevoEstudiante) {
        int index = estudiantes.indexOf(estudianteExistente);
        if (index >= 0) {
            estudiantes.set(index, nuevoEstudiante);
            guardarArchivo();
        }
    }
    //modificar apellido misnusula G Jeff
    public void modificarApellidosMayuscula() {
        for (Estudiante estudiante : estudiantes) {
            String[] partesNombre = estudiante.getNombre().split(" ");
            if (partesNombre.length > 1) {
                partesNombre[1] = partesNombre[1].toLowerCase(); // Convertir a minúsculas
                estudiante.setNombre(String.join(" ", partesNombre));
            }
        }
        guardarArchivo(); 
    }
        //pension menor a mayor C KEVIN
    public void listarEstudiantesPorPensionAscendente() {
      Collections.sort(estudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return Double.compare(e1.getPension(), e2.getPension());
            }
        });
        listarEstudiantes();
    }
    public double sumaTotalPensiones() {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getPension();
        }
        return suma;
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
