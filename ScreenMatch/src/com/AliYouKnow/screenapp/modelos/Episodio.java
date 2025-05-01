package com.AliYouKnow.screenapp.modelos;

import com.AliYouKnow.screenapp.funciones.Clasificable;

public class Episodio implements Clasificable {
    private int numeroEpisodio;
    private String nombre;
    private String Serie;
    private int totalVisualiziones;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    @Override
    public int getClasificacion() {
        if(totalVisualiziones > 100){
            return 4;
        }else{
            return 2;
        }



    }

    //Incluyendo comportamientos adcionales



}
