import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int cantidadEstudiantes = 60_000_000;
        int cantidadConsultas = 40_000;

        System.out.println("Generando estudiantes ...");
        // [] Est1, Est2, Est3
        List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);
        // for(Estudiante est : estudiantes){
        //     System.out.println(est.nombre);
        // }
        //Buscar si existe el usr
        ///Con CI 1_999_993
        String cedulaBuscar="5199993";
        // for(Estudiante est: estudiantes){
        //     if(est.cedula.equals(cedulaBuscar)){//Devuelve true or false
        //     System.out.println("Existe");
        //     break;
        //     }
        // }

         int inicio=0;
         int fin = estudiantes.size()-1;
         while(inicio<=fin){
             int medio = (inicio+fin)/2;
             Estudiante actual = estudiantes.get(medio);
            
             //Devuelve numero, cero si es igual, positivo si es mayor alfabeticamente, negativo menor alfabeticamente
             int comparacion = actual.cedula.compareTo(cedulaBuscar);
             if(comparacion==0){
                 System.out.println("EXISTE");
                 break;
             }else if(comparacion <0){
                 inicio = medio+1;
             }else{
                 fin = medio-1;
             }
            
         }
    }
}