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
                
                case 1: 
                String nombres = JOptionPane.showInputDialog("Ingrese NOMBRES:");
                String apellidos = JOptionPane.showInputDialog("Ingrese APELLIDOS:");
                int ciclo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese CICLO:"));
                double pension = Double.parseDouble(JOptionPane.showInputDialog("Ingrese PENSION:"));

                Estudiante nuevoEstudiante = new Estudiante(estudiantes2023.tamano() + 1, nombres + " " + apellidos, ciclo, pension);
                estudiantes2023.adicionar(nuevoEstudiante);
                JOptionPane.showMessageDialog(null, "¡Se añadió con éxito!");
                break;

                
               
    
                //BUSCAR ESTUDIANTE PUEDE BUSCAR POR NOMBRE O CODIGO. ELEGIR UNA OPCIÓN:A – APELLIDO B – CODIGO H Martin
                case 2:
                String[] opcionesBusqueda = {"Código", "Apellido"};
                int opcionBusqueda = JOptionPane.showOptionDialog(
                 null,
                 "Seleccione una opción de búsqueda:",
                         "Búsqueda de Estudiantes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                 null,
                opcionesBusqueda,
                opcionesBusqueda[0]
                 );

                if (opcionBusqueda == 0) { // Búsqueda por Código
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del estudiante a buscar:"));
                Estudiante estudianteEncontrado = estudiantes2023.buscar(codigo);

                if (estudianteEncontrado != null) {
                JOptionPane.showMessageDialog(
                null,
                "Datos del estudiante:\n" + estudianteEncontrado.toString(),
                "Estudiante Encontrado",
                JOptionPane.INFORMATION_MESSAGE
                );
                } else {
                JOptionPane.showMessageDialog(
                null,
                "El estudiante no está registrado.",
                "Estudiante No Encontrado",
                JOptionPane.WARNING_MESSAGE
                 );
                }
                } else if (opcionBusqueda == 1) { // Búsqueda por Apellido
                String apellidoBuscar = JOptionPane.showInputDialog("Ingrese el apellido del estudiante a buscar:");
                Estudiante estudiantePorApellido = estudiantes2023.buscarPorApellido(apellidoBuscar);
        
                 if (estudiantePorApellido != null) {
                 JOptionPane.showMessageDialog(
                null,
                "Datos del estudiante:\n" + estudiantePorApellido.toString(),
                "Estudiante Encontrado",
                JOptionPane.INFORMATION_MESSAGE
                   );
                } else {
                JOptionPane.showMessageDialog(
                null,
                "No hay estudiantes registrados con el apellido " + apellidoBuscar,
                "Estudiante No Encontrado",
                JOptionPane.WARNING_MESSAGE
                      );
                   }
                }
                break;


                 case 3:
                int idEstudianteEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del estudiante a eliminar:"));
                Estudiante estudianteAEliminar = estudiantes2023.buscar(idEstudianteEliminar);

                if (estudianteAEliminar != null) {
                estudiantes2023.eliminar(estudianteAEliminar);
                JOptionPane.showMessageDialog(null, "¡Se eliminó con éxito!");
                } else {
                JOptionPane.showMessageDialog(null, "No se encontró un estudiante con el ID ingresado.");
                }
                break;
               
               
                   
                case 4:
                // Modificar estudiante  jeff
           
                    break;
                  

                case 5:
                // modificar apellidos jeff
                
                 break;

                case 6:
                //6-VER TODOS LOS ESTUDIANTES A Camila
                    StringBuilder estudiantesInfo = new StringBuilder();
                estudiantesInfo.append("----------------------------------------------------------------------------\n");
                estudiantesInfo.append("CODIGO DE ESTUDIANTE NOMBRE Y APELLIDOS CICLO PENSION\n");
                estudiantesInfo.append("----------------------------------------------------------------------------\n");
                for (Estudiante estudiante : estudiantes2023.getEstudiantes()) {
                 estudiantesInfo.append(estudiante.getCodigo()).append(" ").append(estudiante.getNombre()).append(" ").append(estudiante.getCiclo()).append(" ").append(estudiante.getPension()).append("\n");
                }
                estudiantesInfo.append("----------------------------------------------------------------------------");

                 JOptionPane.showMessageDialog(null, estudiantesInfo.toString(), "Lista de Estudiantes", JOptionPane.INFORMATION_MESSAGE);
                break;

              
                case 7:
                //-VER TODOS LOS ESTUDIANTE POR APELLIDOS  B Camila
                    estudiantes2023.listarEstudiantesPorPensionAscendente();
                StringBuilder estudiantesOrdenadosPorPension = new StringBuilder();
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------\n");
                estudiantesOrdenadosPorPension.append("CODIGO DE ESTUDIANTE NOMBRE Y APELLIDOS CICLO PENSION\n");
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------\n");
                for (Estudiante estudiante : estudiantes2023.getEstudiantes()) {
                estudiantesOrdenadosPorPension.append(estudiante.getCodigo()).append(" ").append(estudiante.getNombre()).append(" ").append(estudiante.getCiclo()).append(" ").append(estudiante.getPension()).append("\n");
                }
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------");

                JOptionPane.showMessageDialog(null, estudiantesOrdenadosPorPension.toString(), "Estudiantes Ordenados por Pensión Ascendente", JOptionPane.INFORMATION_MESSAGE);
                break;
                    
                case 8:
                //vER TODOS LOS ESTUDIANTE POR PENSIÓN C Kevin
               estudiantes2023.listarEstudiantesPorPensionAscendente();
                StringBuilder estudiantesOrdenadosPorPension = new StringBuilder();
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------\n");
                estudiantesOrdenadosPorPension.append("CODIGO DE ESTUDIANTE NOMBRE Y APELLIDOS CICLO PENSION\n");
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------\n");
                for (Estudiante estudiante : estudiantes2023.getEstudiantes()) {
                estudiantesOrdenadosPorPension.append(estudiante.getCodigo()).append(" ").append(estudiante.getNombre()).append(" ").append(estudiante.getCiclo()).append(" ").append(estudiante.getPension()).append("\n");
                }
                estudiantesOrdenadosPorPension.append("----------------------------------------------------------------------------");

                JOptionPane.showMessageDialog(null, estudiantesOrdenadosPorPension.toString(), "Estudiantes Ordenados por Pensión Ascendente", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 9:
                // Total de pensiones I Kevin
                double sumaPensiones = estudiantes2023.sumaTotalPensiones();
                StringBuilder totalPensionesInfo = new StringBuilder();
                totalPensionesInfo.append("----------------------------------------------------------------------------\n");
                totalPensionesInfo.append("CODIGO DE ESTUDIANTE NOMBRE Y APELLIDOS CICLO PENSION\n");
                totalPensionesInfo.append("----------------------------------------------------------------------------\n");
                for (Estudiante estudiante : estudiantes2023.getEstudiantes()) {
                    totalPensionesInfo.append(estudiante.getCodigo()).append(" ").append(estudiante.getNombre()).append(" ").append(estudiante.getCiclo()).append(" ").append(estudiante.getPension()).append("\n");
                }
                totalPensionesInfo.append("----------------------------------------------------------------------------\n");
                totalPensionesInfo.append("LA SUMA TOTAL ES: S/ ").append(sumaPensiones);
            
                JOptionPane.showMessageDialog(null, totalPensionesInfo.toString(), "Total de Pensiones", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            

                case 10:
                    

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 10);
    }
}
