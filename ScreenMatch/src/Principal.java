import com.AliYouKnow.screenapp.modelos.Pelicula;
import com.AliYouKnow.screenapp.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Matrix");
        pelicula1.setFechaDeLanzamiento(2000);
        pelicula1.setDuracionEnMinutos(120);

        //Llamamos a los metodos de la clase

        pelicula1.muestraFichaTecnica();

        pelicula1.evalua(9.5);
        pelicula1.evalua(8);
        pelicula1.evalua(6);
        System.out.println(pelicula1.getNombre());
        System.out.println(pelicula1.getFechaDeLanzamiento());
        System.out.println(pelicula1.getTotalEvaluaciones());

        System.out.println(pelicula1.calculaMedia());

        Serie mrRobot = new Serie();
        mrRobot.setNombre("Mr Robot");
        mrRobot.setFechaDeLanzamiento(2001);
        mrRobot.setTemporadas(5);
        mrRobot.setMinutosPorEpisodio(53);
        mrRobot.setEpisodiosPorTemporada(10);
        mrRobot.muestraFichaTecnica();

        //muestre la duracion en minutos de la serie

        System.out.println("la duracion de minutos es de: "+ mrRobot.getDuracionEnMinutos());













       /* com.AliYouKnow.screenapp.modelos.Pelicula pelicula2 = new com.AliYouKnow.screenapp.modelos.Pelicula();
        pelicula2.nombrePelicula = "Mr Robot";
        pelicula2.fechaDeLanzamiento = 2005;
        pelicula2.duracionEnMinutos = 120;
        pelicula2.muestraFichaTecnica();
        pelicula2.evalua(9.8);
         System.out.println(pelicula2 +" ; "+ pelicula1);
        */



    }
}
