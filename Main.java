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
                // Agregar nuevo estudiante D ethan
              
                break;

                
               
    
                //BUSCAR ESTUDIANTE PUEDE BUSCAR POR NOMBRE O CODIGO. ELEGIR UNA OPCIÓN:A – APELLIDO B – CODIGO H Martin
                case 2:
                
                break;


                 case 3:
                // Eliminar estudiante E ethan
                break;
               
               
                   
                case 4:
                // Modificar estudiante  jeff
           
                    break;
                  

                case 5:
                // modificar apellidos jeff
                
                 break;

                case 6:
                //6-VER TODOS LOS ESTUDIANTES A Camila
                
                break;

              
                case 7:
                //-VER TODOS LOS ESTUDIANTE POR APELLIDOS  B Camila
                
                break;
                case 8:
                //vER TODOS LOS ESTUDIANTE POR PENSIÓN C Kevin
                
                break;
      

                case 9:
                // Total de pensiones I Kevin
                
                
                break;
            

                case 10:
                    

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 10);
    }
}