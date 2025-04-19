public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.nombrePelicula = "Matrix";
        pelicula1.fechaDeLanzamiento = 2001;
        pelicula1.duracionEnMinutos = 120;
        //Llamamos a los metodos de la clase
        pelicula1.muestraFichaTecnica();
        pelicula1.evalua(9.5);
        pelicula1.evalua(8);
        System.out.println(pelicula1.sumaDeCalificaciones);
        System.out.println(pelicula1.totalEvaluaciones);
        System.out.println(pelicula1.calculaMedia());


        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombrePelicula = "Mr Robot";
        pelicula2.fechaDeLanzamiento = 2005;
        pelicula2.duracionEnMinutos = 120;
        pelicula2.muestraFichaTecnica();
        pelicula2.evalua(9.8);

        System.out.println(pelicula2 +" ; "+ pelicula1);

    }
}
