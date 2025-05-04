import com.AliYouKnow.screenapp.funciones.CalculadoraDeTiempo;
import com.AliYouKnow.screenapp.funciones.FiltroRecomendaciones;
import com.AliYouKnow.screenapp.modelos.Episodio;
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


        Pelicula pelicula2 = new Pelicula();
        pelicula2.setNombre("Devs");
        pelicula2.setFechaDeLanzamiento(2005);
        pelicula2.setDuracionEnMinutos(150);


        CalculadoraDeTiempo calcularTiempo =  new CalculadoraDeTiempo();
        calcularTiempo.incluyeTitulos(pelicula1);
        calcularTiempo.incluyeTitulos(mrRobot);
        calcularTiempo.incluyeTitulos(pelicula2);

        System.out.println("Tiempo para ver los titulo: "+calcularTiempo.getTiempoTotal() + " Minutos");


        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(pelicula1);

        Episodio episodio = new Episodio();
        episodio.setNumeroEpisodio(1);
        episodio.setNombre("Osymandias");
        episodio.setSerie(mrRobot);





    }
}
