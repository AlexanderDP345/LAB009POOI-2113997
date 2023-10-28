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
                
                case 1:// Agregar nuevo estudiante
                String nombres = JOptionPane.showInputDialog("Ingrese NOMBRES:");
                String apellidos = JOptionPane.showInputDialog("Ingrese APELLIDOS:");
                int ciclo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese CICLO:"));
                double pension = Double.parseDouble(JOptionPane.showInputDialog("Ingrese PENSION:"));

                Estudiante nuevoEstudiante = new Estudiante(estudiantes2023.tamano() + 1, nombres + " " + apellidos, ciclo, pension);
                estudiantes2023.adicionar(nuevoEstudiante);
                JOptionPane.showMessageDialog(null, "¡Se añadió con éxito!");
                break;
                    
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
                     //MODIFICAR ESTUDIANTE

                case 5:
                   
                    //MODIFICAR APELLIDOS EN MINÚSCULAS.
                

                case 6:
                    //VER TODOS LOS ESTUDIANTES
                   

                case 7:
                
                   //-VER TODOS LOS ESTUDIANTE POR APELLIDOS
                 
                    break;

                case 8:

               //VER TODOS LOS ESTUDIANTE POR PENSIÓN

                    
                    break;

                case 9:
                //total de pensiones

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
