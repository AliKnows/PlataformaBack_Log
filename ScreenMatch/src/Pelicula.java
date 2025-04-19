public class Pelicula {

    String nombrePelicula;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeCalificaciones;
    int totalEvaluaciones;
    //creando metodos
    /*
    convencion de metodos: verbos en infinitivo y tambien en imperativo(mas usado)=
    */


    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombrePelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
        System.out.println("*************");
    }

    void evalua(double calificacionPeli){
        sumaDeCalificaciones += calificacionPeli;
        totalEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeCalificaciones / totalEvaluaciones;
        }




}
