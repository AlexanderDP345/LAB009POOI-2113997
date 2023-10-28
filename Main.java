import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception {
        Estudiantes2023 estudiantes2023 = new Estudiantes2023();

        int opcion;
        do {
            String menu = "BIENVENIDOS AL SISTEMA DE GESTIÓN DE ESTUDIANTES\n" +
                    "1-NUEVO ESTUDIANTE\n" +
                    "2-BUSCAR ESTUDIANTE\n" +
                    "3-ELIMINAR ESTUDIANTE\n" +
                    "4-MODIFICAR ESTUDIANTE\n" +
                    "5-MODIFICAR APELLIDOS EN MINÚSCULAS\n" +
                    "6-VER TODOS LOS ESTUDIANTES\n" +
                    "7-VER TODOS LOS ESTUDIANTES POR APELLIDOS\n" +
                    "8-VER TODOS LOS ESTUDIANTES POR PENSIÓN\n" +
                    "9-TOTAL DE PENSIONES\n" +
                    "10-SALIR";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                
                case 1:public void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(estudiante);
            }
        }
    }
                
                case 2:
                
                    // Buscar estudiante
                    
                    // Lógica para buscar por apellido (debes implementarla en la clase Estudiantes2023)
                    break;

                case 3:
                    // Eliminar estudiante
                    // Lógica para listar estudiantes
                    // Implementar esta parte en la clase Estudiantes2023
                    // y mostrar los resultados
                    break;

                case 4:
                  

                case 5:
                   
                  
                

                case 6:
                    // Ver todos los estudiantes
                   

                case 7:
                
                   
                 
                    break;

                case 8:
                    
                    break;

                case 9:

                    break;

                case 10:
                    // Salir
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 10);
    }
}
